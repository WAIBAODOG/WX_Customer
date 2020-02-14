package com.ruoyi.wxcustomer.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ruoyi.wxcustomer.service.IProxyInfoService;
import com.ruoyi.wxcustomer.util.ConnUtil;

@Service
public class ProxyInfoServiceImpl implements IProxyInfoService {
	@Value("${searchUrl.proxy.free}")
	private String freeUrl;
	@Value("${searchUrl.proxy.xici}")
	private String xiciUrl;
	@Value("${searchUrl.proxy.kuai}")
	private String kuaiUrl;
	@Value("${searchUrl.proxy.yun}")
	private String yunUrl;
	@Value("${searchUrl.proxy.bjip}")
	private String bjipUrl;
	@Value("${searchUrl.proxy.iphai}")
	private String iphaiUrl;
	/**
	 * 获取代理信息
	 */
	public Map<String, String> iGetProxyInFo() {
		Map<String, String> map = new HashMap<String, String>();
		Random random=new Random();
		for(int i=0;i<5;i++) {
			switch (random.nextInt(5)) {
			case 0: map=freeIp(); break;
			case 1: map=xicidaili(); break;
			case 2: map=kuaidaili(); break;
			case 3: map=yun(); break;
			case 4: map=bjip(); break;
			default:
				map=freeIp();
				break;
			}
			if(map!=null) {
				return map;
			}
		}
		return map;
	}
	/**
	 * https://www.freeip.top/?page=1
	 */
	public  Map<String, String> freeIp() {
		try {
			Connection conn = Jsoup.connect(freeUrl);
			Document document=conn.get();
			Elements trElem=document.getElementsByAttributeValue("class", "layui-table").select("tbody").select("tr");
			if(trElem==null||trElem.size()<1) {
				return null;
			}
			for(int i=0;i<trElem.size();i++) {
				try {
					Elements tdElem=trElem.get(i).select("td");
					String host=tdElem.get(0).text().trim();
					String port=tdElem.get(1).text().trim();
					boolean isConnect=ConnUtil.isHostConnectable(host, Integer.valueOf(port));
					if(isConnect) {
						String type=tdElem.get(3).text().trim();
						Map<String, String> map = new HashMap<String, String>();
						map.put("host", host);
						map.put("port", port);
						map.put("type", type);
						return map;
					}
				} catch (Exception e) {
					 
				}
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	/**
	 * https://www.xicidaili.com
	 */
	public  Map<String, String> xicidaili() {
		try {
			Connection conn = Jsoup.connect(xiciUrl);
			Document document=conn.get();
			Elements trElem=document.getElementsByAttributeValue("id", "ip_list").select("tbody").select("tr");
			if(trElem==null||trElem.size()<3) {
				return null;
			}
			for(int i=3;i<trElem.size();i++) {
				try {
					Elements tdElem=trElem.get(i).select("td");
					String host=tdElem.get(1).text().trim();
					String port=tdElem.get(2).text().trim();
					boolean isConnect=ConnUtil.isHostConnectable(host, Integer.valueOf(port));
					if(isConnect) {
						String type=tdElem.get(5).text().trim();
						Map<String, String> map = new HashMap<String, String>();
						map.put("host", host);
						map.put("port", port);
						map.put("type", type);
						return map;
					}
				} catch (Exception e) {
					 
				}
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	/**
	 * https://www.kuaidaili.com/free/
	 */
	public  Map<String, String> kuaidaili() {
		try {
			Connection conn = Jsoup.connect(kuaiUrl);
			Document document=conn.get();
			Elements trElem=document.getElementsByAttributeValue("class","table table-bordered table-striped").select("tbody").select("tr");
			if(trElem==null||trElem.size()<1) {
				return null;
			}
			for(int i=0;i<trElem.size();i++) {
				try {
					Elements tdElem=trElem.get(i).select("td");
					String host=tdElem.get(0).text().trim();
					String port=tdElem.get(1).text().trim();
					boolean isConnect=ConnUtil.isHostConnectable(host, Integer.valueOf(port));
					if(isConnect) {
						String type=tdElem.get(3).text().trim();
						Map<String, String> map = new HashMap<String, String>();
						map.put("host", host);
						map.put("port", port);
						map.put("type", type);
						return map;
					}
				} catch (Exception e) {
					 
				}
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	/**
	 * http://www.ip3366.net/
	 */
	public   Map<String, String> yun() {
		try {
			Connection conn = Jsoup.connect(yunUrl);
			Document document=conn.get();
			Elements trElem=document.getElementsByAttributeValue("class","table table-bordered table-striped").select("tbody").select("tr");
			if(trElem==null||trElem.size()<1) {
				return null;
			}
			for(int i=0;i<trElem.size();i++) {
				try {
					Elements tdElem=trElem.get(i).select("td");
					String host=tdElem.get(0).text().trim();
					String port=tdElem.get(1).text().trim();
					boolean isConnect=ConnUtil.isHostConnectable(host, Integer.valueOf(port));
					if(isConnect) {
						String type=tdElem.get(3).text().trim();
						Map<String, String> map = new HashMap<String, String>();
						map.put("host", host);
						map.put("port", port);
						map.put("type", type);
						return map;
					}
				} catch (Exception e) {
					 
				}
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	
	/**
	 * http://www.89ip.cn/
	 */
	public   Map<String, String> bjip() {
		try {
			Connection conn = Jsoup.connect(bjipUrl);
			Document document=conn.get();
			Elements trElem=document.getElementsByAttributeValue("class","layui-table").select("tbody").select("tr");
			if(trElem==null||trElem.size()<1) {
				return null;
			}
			for(int i=0;i<trElem.size();i++) {
				try {
					Elements tdElem=trElem.get(i).select("td");
					String host=tdElem.get(0).text().trim();
					String port=tdElem.get(1).text().trim();
					boolean isConnect=ConnUtil.isHostConnectable(host, Integer.valueOf(port));
					if(isConnect) {
						Map<String, String> map = new HashMap<String, String>();
						map.put("host", host);
						map.put("port", port);
						map.put("type", "");
						return map;
					}
				} catch (Exception e) {
					 
				}
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	/**
	 * http://www.iphai.com/free/ng
	 */
	public static  Map<String, String> iphai() {
		try {
			Connection conn = Jsoup.connect("http://www.iphai.com/free/ng");
			Document document=conn.get();
			Elements trElem=document.getElementsByAttributeValue("class","table table-bordered table-striped table-hover").select("tbody").select("tr");
			if(trElem==null||trElem.size()<1) {
				return null;
			}
			for(int i=1;i<trElem.size();i++) {
				try {
					Elements tdElem=trElem.get(i).select("td");
					String host=tdElem.get(0).text().trim();
					String port=tdElem.get(1).text().trim();
					boolean isConnect=ConnUtil.isHostConnectable(host, Integer.valueOf(port));
					if(isConnect) {
						String type=tdElem.get(3).text().trim();
						Map<String, String> map = new HashMap<String, String>();
						map.put("host", host);
						map.put("port", port);
						map.put("type", type);
						return map;
					}
				} catch (Exception e) {
					
				}
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}
}