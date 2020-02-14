/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: AmapServiceImpl.java
 * @Package com.ruoyi.wxcustomer.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月10日 下午9:13:25
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;

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
import org.springframework.web.client.RestTemplate;

import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;
import com.ruoyi.wxcustomer.service.IAmapService;
import com.ruoyi.wxcustomer.service.IKhShopInFoService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @ClassName: AmapServiceImpl
 * @Description: 高德地图
 * @author HuaSheng
 * @date 2020年1月10日 下午9:13:25
 *
 */
@Service
public class AmapServiceImpl implements IAmapService {
	protected static final Log log = LogFactory.getLog(FileFastDFSImpl.class);
	@Value("${searchUrl.amap.list}")
	private String listUrl;
	@Value("${searchUrl.amap.detail}")
	private String detailUrl;
	@Autowired
	private IKhShopInFoService khShopInFoService;
	private List<KhShopInFo> list = new ArrayList<>();
	//@Autowired
	//private IProxyInfoService proxyInfoService;

	@Override
	public List<KhShopInFo> search(SearchCondition condition) {
		if (condition == null) {
			return new ArrayList<KhShopInFo>();
		}
		list = new ArrayList<>();
		String[] key=condition.getCityKey().split(",");
		Vector<Thread> vector=new Vector<Thread>();
		for(int i=0;i<key.length;i++) {
			String[] keys=key[i].split("-");
			condition.setProvince(keys[0]);
			condition.setCity(keys[1]);
			condition.setCityKey(keys[2]);
			if(StringUtils.isEmpty(keys[2])) {
				continue;
			} 
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
				Thread.sleep(1000);
				selectAmap(condition);
			} catch (InterruptedException e) {
				 
			}
			
		}
		
	}
	public void selectAmap(SearchCondition condition) {
		try {

			int limit = condition.getLimit();
			int page = condition.getPage();
			boolean isGetAll = false;
			if (limit > 30) {
				page = 1000;
				limit = 30;
				isGetAll = true;
			} else {
				page = 1;
			}
			for (int i = 0; i < page; i++) {
				StringBuffer bufUrl = new StringBuffer(this.listUrl);
				bufUrl.append("query_type=TQUERY");
				bufUrl.append("&keywords=" + condition.getKeyword());
				bufUrl.append("&city=" + condition.getCityKey());
				bufUrl.append("&pagesize=" + limit);
				bufUrl.append("&pagenum=");
				if (isGetAll) {
					bufUrl.append(i + 1);
				} else {
					bufUrl.append(condition.getPage());
				}
				String listUrl = bufUrl.toString();
				RestTemplate restTemplate = new RestTemplate();
				String result = restTemplate.getForObject(listUrl, String.class);
				JSONObject resultJson = JSONObject.fromObject(result);
				JSONObject dataJson = (JSONObject) resultJson.get("data");
				JSONArray poiList = (JSONArray) dataJson.get("poi_list");
				if(poiList==null||poiList.size()<1) {
					break;
				}
				for (int j = 0; j < poiList.size(); j++) {
					try {
						KhShopInFo info = new KhShopInFo();
						JSONObject obj=poiList.getJSONObject(j);
						String poi=obj.getString("poiid");
						String name=obj.getString("name");
						String cityname=obj.getString("cityname");
						String tag=obj.getString("t_tag_list");
						String phone=obj.getString("tel").replace(";", "/");
						String address=obj.getString("address");
						info.setPoi(poi);
						info.setOs("AMAP");
						List<KhShopInFo> inFoList = khShopInFoService.selectList(info);
						if (inFoList != null && inFoList.size() > 0) {
							list.add(inFoList.get(0));
							continue;
						} 
						info.setId(UUID.randomUUID().toString().replace("-", ""));
						info.setPoi(poi);
						info.setLink(detailUrl+poi);
						info.setShopName(name);
						info.setPhone(phone);
						info.setProvince(condition.getProvince());
						info.setCity(cityname);
						info.setAdress(address);
						info.setKeyword(condition.getKeyword());
						info.setClassic(tag);
						info.setOs("AMAP");
						info.setCreateDate(new Date());
						info.setOperatorId(condition.getOperatorId());
						info.setOperatorName(condition.getOperatorName());
						info.setBatchCode(condition.getBatchCode());
						khShopInFoService.insert(info);
						list.add(info);
					} catch (Exception e) {
					}
				}
				// Connection conn = Jsoup.connect(listUrl);
				// conn.cookies(GetCookieMap(condition.getCity()));
				// conn.headers(GetHeadMap(listUrl, condition.getCity()));

				// Elements searchList=conn.get().getElementsByAttributeValue("class", "poibox
				// poibox-normal amap-marker");
//				if (searchList == null || searchList.size() < 1) {
//					break;
//				}
//				Map<String, String> map = new HashMap<String, String>();
//				for (int j = 0; j < searchList.size(); j++) {
//					try {
//						String poiId = searchList.get(j).attr("id");
//						Random random = new Random(5);
//						Thread.sleep(Long.valueOf(random.nextInt(5)));
//						KhShopInFo info = new KhShopInFo();
//						info.setPoi(poiId);
//						info.setOs("AMAP");
//						List<KhShopInFo> inFoList = khShopInFoService.selectList(info);
//						if (inFoList != null && inFoList.size() > 0) {
//							list.add(info);
//						}else {
//							if (StringUtils.isEmpty(map.get("host")) || StringUtils.isEmpty(map.get("port"))) {
//								map = proxyInfoService.iGetProxyInFo();
//							}
//							boolean isConnet = ConnUtil.isHostConnectable(map.get("host"),
//									Integer.valueOf(map.get("port")));
//							if (!isConnet) {
//								map = proxyInfoService.iGetProxyInFo();
//							}
//							info = selectAmapInFo(poiId, condition, map);
//							if (info != null && StringUtils.isNotEmpty(info.getShopName())) {
//								list.add(info);
//								khShopInFoService.insert(info);
//							}
//						}
//					}catch (Exception e) {
//						log.info(e.getMessage());
//					}
//				}
//			}
			}
			 
		} catch (Exception e) {

		}
	}

	public KhShopInFo selectAmapInFo(String poi, SearchCondition condition, Map<String, String> map) {
		KhShopInFo info = new KhShopInFo();
		try {
			String detailUrl = this.detailUrl + poi;
			Connection conn = Jsoup.connect(detailUrl).ignoreHttpErrors(true);
			if (StringUtils.isNotEmpty(map.get("host")) && StringUtils.isNotEmpty(map.get("port"))
					&& "HTTPS".equals(map.get("type").toUpperCase())) {
				conn.proxy(map.get("host"), Integer.valueOf(map.get("port")));
			}
			// conn.timeout(5000);
			//conn.headers(GetHeadMap(detailUrl, condition.getCity()));
			// conn.cookies(GetCookieMap(condition.getCity()));
			Document document;
			document = conn.get();
			Elements nameElem = document.getElementsByAttributeValue("class", "poiname");
			Elements elements = document.getElementsByAttributeValue("class", "placeinfo module").select("li");
			Element addressElem = elements.get(0);
			Element phoneElem = elements.get(1);
			String name = nameElem.text();
			String address = addressElem.text();
			String phone = phoneElem.text();
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
			info.setOs("AMAP");
			info.setCreateDate(new Date());
			log.info("name:" + name + " address:" + address + " phone:" + phone);
		} catch (IOException e) {
			return null;
		}
		return info;
	}

}
