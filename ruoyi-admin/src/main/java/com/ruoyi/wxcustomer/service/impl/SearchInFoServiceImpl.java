/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: SearchInFoServiceImpl.java
 * @Package com.ruoyi.wxcustomer.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月7日 下午4:14:53
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;
import com.ruoyi.wxcustomer.service.IKhShopInFoService;
import com.ruoyi.wxcustomer.service.ISearchInFoService;
import com.ruoyi.wxcustomer.util.PinyinUtil;

/**
 * @ClassName: SearchInFoServiceImpl
 * @Description: 抓取数据
 * @author HuaSheng
 * @date 2020年1月7日 下午4:14:53
 *
 */
@Service
public class SearchInFoServiceImpl implements ISearchInFoService {
	protected static final Log log = LogFactory.getLog(FileFastDFSImpl.class);
	@Autowired
	private IKhShopInFoService khShopInFoService;
	@Value("${searchUrl.meituan.list}")
	private String mtListUrl;
	@Value("${searchUrl.meituan.info}")
	private String mtInFoUrl;

	@Override
	public List<KhShopInFo> search(SearchCondition condition) {
		if (condition == null) {
			return null;
		}
		String[] temp=condition.getCity().split("市");
		condition.setCityKey(PinyinUtil.getPinyin(temp[0]));
		try {
			switch (condition.getOs()) {
			case "MT":
				return selectMeiTuan(condition);
			case "BD":
				return selectBaiDu(condition);
			case "DZDP":
				return selectDaZhong(condition);

			default:
				return selectMeiTuan(condition);
			}
		} catch (Exception e) {
			return null;
		}
	}

	// 美团
	public List<KhShopInFo> selectMeiTuan(SearchCondition condition) throws Exception {
		StringBuffer bufUrl = new StringBuffer(this.mtListUrl);
		bufUrl.append(condition.getCityKey());
		bufUrl.append("-");
		bufUrl.append(condition.getKeyword());
		bufUrl.append("/?p=");
		bufUrl.append(condition.getPage());
		bufUrl.append("&limit=");
		bufUrl.append(condition.getLimit());
		String listUrl = bufUrl.toString();
		//System.setProperty("https.proxySet", "true");
		//System.getProperties().put("https.proxyHost", "60.167.21.106");
		//System.getProperties().put("https.proxyPort", "808");
		//String agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36" ;
		Connection conn = Jsoup.connect(listUrl).headers(GetHeadMap(listUrl))
				//.ignoreContentType(true)
				//.userAgent(agent)
				//.ignoreHttpErrors(true) //这个很重要 否则会报HTTP error fetching URL. Status=404
				.timeout(3000).cookies(GetCookieMap(condition.getCity()));
		Document document = conn.get();
		Elements searchList = document.getElementsByAttributeValue("gaevent", "search/list");
		List<KhShopInFo> list = new ArrayList<>();
		for (int j = 0; j < searchList.size(); j++) {
			try {
				Element items = searchList.get(j).getElementsByAttributeValue("class", "poi-list-item").get(0);// poi
				Element item = items.getElementsByAttributeValue("data-com", "redirect").get(0);
				String hrefs = item.attr("data-href");
				String[] hrefArr = hrefs.split("/");
				String poiId = hrefArr[hrefArr.length - 1];
				Random random=new Random(5);
				Thread.sleep(Long.valueOf(random.nextInt(5)));
				KhShopInFo info=new KhShopInFo();
				info.setPoi(poiId);
				info.setOs("MT");
				List<KhShopInFo> inFoList=khShopInFoService.selectList(info);
				if(inFoList!=null&&inFoList.size()>0) {
					list.add(inFoList.get(0));
				}else {
					info = selectMtInFo(poiId, condition);
					if (info != null && StringUtils.isNotEmpty(info.getShopName())) {
						list.add(info);
						khShopInFoService.insert(info);
					}
				}
				
			} catch (Exception e) {
				log.info(e.getMessage());
			}
		}
		return list;
	}
	public Map<String, String> GetHeadMap(String url){
		Map<String, String> headMap = new HashMap<String, String>();
		headMap.put("Accept", "*/*");
		headMap.put("Accept-Encoding", "gzip, deflate, br");
		headMap.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
		headMap.put("Connection", "keep-alive");
		//headMap.put("Cookie", "__mta=145006475.1578397771139.1578399496869.1578399506612.7; _lxsdk_cuid=16f7fd67c06c8-0c6b3db56f38e5-2393f61-100200-16f7fd67c06c8; iuuid=99E361137EB68C2615F0402C532D602A158341BB4F04C8E4EFF6F0F4E2B869E0; ci=20; cityname=%E5%B9%BF%E5%B7%9E; _lxsdk=99E361137EB68C2615F0402C532D602A158341BB4F04C8E4EFF6F0F4E2B869E0; webp=1; _hc.v=b5f09dcc-9d1b-7057-d332-35f9f644e4b4.1578397777; _lx_utm=utm_source%3DBaidu%26utm_medium%3Dorganic; __utmz=74597006.1578397834.2.2.utmcsr=baidu|utmccn=(organic)|utmcmd=organic; __mta=145006475.1578397771139.1578397833717.1578399478653.5; JSESSIONID=ns4puixo37lissu6cyhbc32k; IJSESSIONID=ns4puixo37lissu6cyhbc32k; idau=1; __utma=74597006.529913918.1578397772.1578397834.1578453190.3; __utmc=74597006; uuid=6803095e083a416f97f5.1578453419.1.0.0; latlng=23.131701,113.374971,1578454027632; __utmb=74597006.13.9.1578454639441; i_extend=C_b0E290419103990145016132663011444970279428_e7650553595964634474_v4859001741218346387_a%e7%be%8e%e5%ae%b9%e9%99%a2GimthomepagesearchH__a; _lxsdk_s=16f83244571-fe-595-932%7C%7C29");
		headMap.put("Host", "i.meituan.com");
		headMap.put("Referer", url);
		headMap.put("Sec-Fetch-Mode", "cors");
		headMap.put("Sec-Fetch-Site", "same-origin");
		headMap.put("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Mobile Safari/537.36");
		headMap.put("X-Requested-With", "XMLHttpRequest");
		return headMap;
	}
	public Map<String, String> GetCookieMap(String cityName){
		Map<String, String> cookieMap = new HashMap<String, String>();
		cookieMap.put("__mta", "145006475.1578397771139.1578399496869.1578399506612.7");
		//cookieMap.put("_lxsdk_cuid", "16f7fd67c06c8-0c6b3db56f38e5-2393f61-100200-16f7fd67c06c8");
		cookieMap.put("_lxsdk_cuid", UUID.randomUUID().toString());
	//	cookieMap.put("iuuid", "99E361137EB68C2615F0402C532D602A158341BB4F04C8E4EFF6F0F4E2B869E0");
		String iuuid=UUID.randomUUID().toString().replace("-", "");
		cookieMap.put("iuuid", iuuid);
		cookieMap.put("ci", "0");
		cookieMap.put("cityname", cityName);
		//cookieMap.put("_lxsdk", "99E361137EB68C2615F0402C532D602A158341BB4F04C8E4EFF6F0F4E2B869E0");
		cookieMap.put("_lxsdk", iuuid);
		cookieMap.put("webp", "1");
		//cookieMap.put("_hc.v", "b5f09dcc-9d1b-7057-d332-35f9f644e4b4.1578397777");
		cookieMap.put("_hc.v", UUID.randomUUID().toString()+"."+new Date().getTime());
		cookieMap.put("_lx_utm", "utm_source%3DBaidu%26utm_medium%3Dorganic");
		cookieMap.put("__utmz", "74597006.1578397834.2.2.utmcsr=baidu|utmccn=(organic)|utmcmd=organic");
		cookieMap.put("__mta", "145006475.1578397771139.1578397833717.1578399478653.5");
		cookieMap.put("JSESSIONID", "ns4puixo37lissu6cyhbc32k");
		cookieMap.put("IJSESSIONID", "ns4puixo37lissu6cyhbc32k");
		cookieMap.put("idau", "1");
		cookieMap.put("__utma", "74597006.529913918.1578397772.1578397834.1578453190.3");
		cookieMap.put("__utmc", "74597006");
		cookieMap.put("uuid", "6803095e083a416f97f5.1578453419.1.0.0");
		cookieMap.put("latlng", "23.131701,113.374971,1578454027632");
		cookieMap.put("__utmb", "74597006.13.9.1578454639441");
		cookieMap.put("i_extend", "C_b0E290419103990145016132663011444970279428_e7650553595964634474_v4859001741218346387_a%e7%be%8e%e5%ae%b9%e9%99%a2GimthomepagesearchH__a");
		cookieMap.put("_lxsdk_s", "16f83244571-fe-595-932%7C%7C29");
		return cookieMap;
	}
	public KhShopInFo selectMtInFo(String poi,SearchCondition condition) throws Exception {
		KhShopInFo info = new KhShopInFo();
		String detailUrl = this.mtInFoUrl + poi;
		Connection conn=Jsoup.connect(detailUrl);
		conn.timeout(300);
		Document document = conn.get();
		conn.headers(GetHeadMap(detailUrl));
		conn.cookies(GetCookieMap(condition.getCity()));
		Elements nameElem = document.getElementsByAttributeValue("class", "dealcard-brand");
		Elements openTimeElem = document.getElementsByAttributeValue("class", "dd-padding open-time kv-line");
		Elements timeElem = openTimeElem.select("p");
		Elements elements = document.getElementsByAttributeValue("class", "kv-line-r");
		Elements addressElem = elements.get(0).getElementsByAttributeValue("class", "poi-address");
		Elements phoneElem = elements.get(0).getElementsByAttributeValue("data-com", "phonecall");
		String name = nameElem.text();
		String address = addressElem.text();
		String phone = phoneElem.attr("data-tele");
		String time = timeElem.text();
		info.setId(UUID.randomUUID().toString().replace("-", ""));
		info.setPoi(poi);
		info.setLink(detailUrl);
		info.setShopName(name);
		info.setPhone(phone);
		info.setProvince("");
		info.setCity("");
		info.setAdress(address);
		info.setKeyword(condition.getKeyword());
		info.setClassic("");
		info.setOs("MT");
		info.setCreateDate(new Date());
		log.info("name:" + name + " address:" + address + " phone:" + phone + " time:" + time);
		
		return info;
	}

	// 百度
	public List<KhShopInFo> selectBaiDu(SearchCondition condition) {
		return null;
	}

	// 大众点评
	public List<KhShopInFo> selectDaZhong(SearchCondition condition) {
		return null;
	}
}
