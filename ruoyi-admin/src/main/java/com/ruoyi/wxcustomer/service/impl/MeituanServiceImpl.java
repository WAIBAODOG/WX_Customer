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
import java.util.UUID;
import java.util.Vector;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;
import com.ruoyi.wxcustomer.service.IKhShopInFoService;
import com.ruoyi.wxcustomer.service.IMeituanService;
import com.ruoyi.wxcustomer.service.IProxyInfoService;

/**
 * @ClassName: MeituanServiceImpl
 * @Description: 抓取数据
 * @author HuaSheng
 * @date 2020年1月7日 下午4:14:53
 *
 */
@Service
public class MeituanServiceImpl implements IMeituanService {
	protected static final Log log = LogFactory.getLog(FileFastDFSImpl.class);
	@Value("${searchUrl.meituan.list}")
	private String listUrl;
	@Value("${searchUrl.meituan.info}")
	private String inFoUrl;
	@Value("${searchUrl.meituan.pcinfo}")
	private String pcInFoUrl;
	@Autowired
	private IKhShopInFoService khShopInFoService;
	@Autowired
	private IProxyInfoService proxyInfoService;
	private List<KhShopInFo> list = new ArrayList<>();
	@Override
	public List<KhShopInFo> search(SearchCondition condition) {
		if (condition == null) {
			return new ArrayList<KhShopInFo>();
		}
//		if (StringUtils.isEmpty(condition.getCityKey())) {
//			String[] temp = condition.getCity().split("市");
//			if ("区".contains(condition.getCity())) {
//				temp = condition.getCity().split("区");
//			}
//			condition.setCityKey(PinyinUtil.getPinyin(temp[0]));
//		}
		list = new ArrayList<>();
		String[] key=condition.getCityKey().split(",");
		Vector<Thread> vector=new Vector<Thread>();
		for(int i=0;i<key.length;i++) {
			String[] keys=key[i].split("-");
			condition.setProvince(keys[0]);
			condition.setCity(keys[1]);
			if(StringUtils.isEmpty(keys[2])) {
				continue;
			} 
			condition.setCityKey(keys[2]);
			SearchCondition con=new SearchCondition();
			BeanUtils.copyProperties(condition, con);
			Thread thread=new Thread(new SearchThread(con));
			vector.add(thread);
			thread.start();
		}//TODO 线程池实现
		for(Thread thread:vector) {
			try {
				thread.join();
			} catch (InterruptedException e) {
			}
		}
		return list;
	}
	class SearchThread implements Runnable{
		private SearchCondition condition;
		public SearchThread(SearchCondition condition) {
			this.condition=condition;
		}
		@Override
		public void run() {
			try {
				selectMeiTuan(condition);
			} catch (Exception e) {
			}
		}
		
	}
	// 美团
	public void selectMeiTuan(SearchCondition condition) throws Exception {
		/*int limit = condition.getLimit();
		int page = condition.getPage();
		boolean isGetAll = false;
		if (limit > 100) {
			page = 1000;
			limit = 100;
			isGetAll = true;
		} else {
			page = 1;
		}

		for (int i = 0; i < page; i++) {
			StringBuffer bufUrl = new StringBuffer(this.listUrl);
			bufUrl.append(condition.getCityKey());
			bufUrl.append("-");
			bufUrl.append(condition.getKeyword());
			bufUrl.append("/?p=");
			if (isGetAll) {
				bufUrl.append(i + 1);
			} else {
				bufUrl.append(condition.getPage());
			}

			bufUrl.append("&limit=");
			bufUrl.append(limit);
			String listUrl = bufUrl.toString();
			Connection conn = Jsoup.connect(listUrl).headers(GetHeadMap(listUrl, condition.getCity()))
					.cookies(GetCookieMap(condition.getCity()));
			Document document = conn.get();
			Elements searchList = document.getElementsByAttributeValue("gaevent", "search/list");
			if (searchList == null || searchList.size() < 1) {
				break;
			}
			Map<String, String> map = new HashMap<String, String>();
			for (int j = 0; j < searchList.size(); j++) {
				try {
					Element items = searchList.get(j).getElementsByAttributeValue("class", "poi-list-item").get(0);// poi
					Element item = items.getElementsByAttributeValue("data-com", "redirect").get(0);
					String hrefs = item.attr("data-href");
					String[] hrefArr = hrefs.split("/");
					String poiId = hrefArr[hrefArr.length - 1];
					Random random = new Random(5);
					Thread.sleep(Long.valueOf(random.nextInt(5)));
					KhShopInFo info = new KhShopInFo();
					info.setPoi(poiId);
					info.setOs("MT");
					List<KhShopInFo> inFoList = khShopInFoService.selectList(info);
					if (inFoList != null && inFoList.size() > 0) {
						list.add(inFoList.get(0));
					} else {
						if (StringUtils.isEmpty(map.get("host")) || StringUtils.isEmpty(map.get("port"))) {
							map = proxyInfoService.iGetProxyInFo();
						}
						boolean isConnet = ConnUtil.isHostConnectable(map.get("host"),
								Integer.valueOf(map.get("port")));
						if (!isConnet) {
							map = proxyInfoService.iGetProxyInFo();
						}
						info = selectMtInFo(poiId, condition, map);
						if (info != null && StringUtils.isNotEmpty(info.getShopName())) {
							list.add(info);
							khShopInFoService.insert(info);
						}
					}

				} catch (Exception e) {
					log.info(e.getMessage());
				}
			}
		}*/
	}

	public KhShopInFo selectMtInFo(String poi, SearchCondition condition, Map<String, String> map) {
		KhShopInFo info = new KhShopInFo();
		/*try {
			String detailUrl = this.inFoUrl + poi;
			Connection conn = Jsoup.connect(detailUrl).ignoreHttpErrors(true);
			if (StringUtils.isNotEmpty(map.get("host")) && StringUtils.isNotEmpty(map.get("port"))) {
				conn.proxy(map.get("host"), Integer.valueOf(map.get("port")));
			}
			//conn.timeout(5000);
			conn.headers(GetHeadMap(detailUrl, condition.getCity()));
			conn.cookies(GetCookieMap(condition.getCity()));
			Document document;
			document = conn.get();
			Elements nameElem = document.getElementsByAttributeValue("class", "dealcard-brand");
			// Elements openTimeElem = document.getElementsByAttributeValue("class",
			// "dd-padding open-time kv-line");
			// Elements timeElem = openTimeElem.select("p");
			Elements elements = document.getElementsByAttributeValue("class", "kv-line-r");
			Elements addressElem = elements.get(0).getElementsByAttributeValue("class", "poi-address");
			Elements phoneElem = elements.get(0).getElementsByAttributeValue("data-com", "phonecall");
			String name = nameElem.text();
			String address = addressElem.text();
			String phone = phoneElem.attr("data-tele");
			// String time = timeElem.text();
			info.setId(UUID.randomUUID().toString().replace("-", ""));
			info.setPoi(poi);
			info.setLink(detailUrl);
			info.setShopName(name);
			info.setPhone(phone);
			info.setProvince(condition.getProvince());
			info.setCity(condition.getCity());
			info.setAdress(address);
			info.setKeyword(condition.getKeyword());
			info.setClassic("");
			info.setOs("MT");
			info.setCreateDate(new Date());
			info.setOperatorId(condition.getOperatorId());
			info.setOperatorName(condition.getOperatorName());
			info.setBatchCode(condition.getBatchCode());
			log.info("name:" + name + " address:" + address + " phone:" + phone);
		} catch (IOException e) {
			info=selectMtPcInFo(poi, condition, map);
		}*/
		return info;
	}

	public KhShopInFo selectMtPcInFo(String poi, SearchCondition condition, Map<String, String> map){
		KhShopInFo info = new KhShopInFo();
		/*try {
			String detailUrl = this.pcInFoUrl + poi;
			Connection conn = Jsoup.connect(detailUrl).ignoreHttpErrors(true);
			if (StringUtils.isNotEmpty(map.get("host")) && StringUtils.isNotEmpty(map.get("port"))
					&& "HTTPS".equals(map.get("type").toUpperCase())) {
				conn.proxy(map.get("host"), Integer.valueOf(map.get("port")));
			}
			Document document = conn.get();
			Elements nameElem = document.getElementsByAttributeValue("class", "seller-name");
			Elements elements = document.getElementsByAttributeValue("class", "seller-info-body");
//			Elements elements = document.getElementsByAttributeValue("class", "seller-info-body").select("div");
//			Elements addressElem = elements.get(0).getElementsByAttributeValue("class", "item").select("a");
//			Elements phoneElem = elements.get(2).getElementsByAttributeValue("class", "item").select("span");
			String name = nameElem.text();
			String address = elements.text().split("电话：")[0].split("地址：")[1];
			String phone = elements.text().split("电话：")[1].split("营业时间：")[0];
//			String address = addressElem.text();
//			String phone = phoneElem.get(1).text();
			info.setId(UUID.randomUUID().toString().replace("-", ""));
			info.setPoi(poi);
			info.setLink(detailUrl);
			info.setShopName(name);
			info.setPhone(phone);
			info.setProvince(condition.getProvince());
			info.setCity(condition.getCity());
			info.setAdress(address);
			info.setKeyword(condition.getKeyword());
			info.setClassic("");
			info.setOs("MT");
			info.setCreateDate(new Date());
			info.setOperatorId(condition.getOperatorId());
			info.setOperatorName(condition.getOperatorName());
			info.setBatchCode(condition.getBatchCode());
			log.info("name:" + name + " address:" + address + " phone:" + phone);
		} catch (Exception e) {
			return null;
		}*/
		return info;
	}

	public Map<String, String> GetHeadMap(String url, String city) {
		String iuuid = UUID.randomUUID().toString().replace("-", "");
		String uuid = UUID.randomUUID().toString();
		Map<String, String> headMap = new HashMap<String, String>();
		headMap.put("Accept", "*/*");
		headMap.put("Accept-Encoding", "gzip, deflate, br");
		headMap.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
		headMap.put("Connection", "keep-alive");
		headMap.put("Cookie", "__mta=145006475.1578397771139.1578399496869.1578399506612.7; _lxsdk_cuid=" + uuid
				+ "; iuuid=" + iuuid + "; ci=0; cityname=" + city + "; _lxsdk=" + iuuid
				+ "; webp=1; _hc.v=b5f09dcc-9d1b-7057-d332-35f9f644e4b4.1578397777; _lx_utm=utm_source%3DBaidu%26utm_medium%3Dorganic; __utmz=74597006.1578397834.2.2.utmcsr=baidu|utmccn=(organic)|utmcmd=organic; __mta=145006475.1578397771139.1578397833717.1578399478653.5; JSESSIONID=ns4puixo37lissu6cyhbc32k; IJSESSIONID=ns4puixo37lissu6cyhbc32k; idau=1; __utma=74597006.529913918.1578397772.1578397834.1578453190.3; __utmc=74597006; uuid=6803095e083a416f97f5.1578453419.1.0.0; latlng=23.131701,113.374971,1578454027632; __utmb=74597006.13.9.1578454639441; i_extend=C_b0E290419103990145016132663011444970279428_e7650553595964634474_v4859001741218346387_a%e7%be%8e%e5%ae%b9%e9%99%a2GimthomepagesearchH__a; _lxsdk_s=16f83244571-fe-595-932%7C%7C29");
		headMap.put("Host", "i.meituan.com");
		headMap.put("Referer", url);
		headMap.put("Sec-Fetch-Mode", "cors");
		headMap.put("Sec-Fetch-Site", "same-origin");
		headMap.put("User-Agent",
				"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Mobile Safari/537.36");
		headMap.put("X-Requested-With", "XMLHttpRequest");
		return headMap;
	}

	public Map<String, String> GetCookieMap(String cityName) {
		Map<String, String> cookieMap = new HashMap<String, String>();
		cookieMap.put("__mta", "145006475.1578397771139.1578399496869.1578399506612.7");
		cookieMap.put("_lxsdk_cuid", UUID.randomUUID().toString());
		String iuuid = UUID.randomUUID().toString().replace("-", "");
		cookieMap.put("iuuid", iuuid);
		cookieMap.put("ci", "0");
		cookieMap.put("cityname", cityName);
		cookieMap.put("_lxsdk", iuuid);
		cookieMap.put("webp", "1");
		cookieMap.put("_hc.v", UUID.randomUUID().toString() + "." + new Date().getTime());
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
		cookieMap.put("i_extend",
				"C_b0E290419103990145016132663011444970279428_e7650553595964634474_v4859001741218346387_a%e7%be%8e%e5%ae%b9%e9%99%a2GimthomepagesearchH__a");
		cookieMap.put("_lxsdk_s", "16f83244571-fe-595-932%7C%7C29");
		return cookieMap;
	}
}
