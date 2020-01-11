/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: SearchCondition.java
 * @Package com.ruoyi.wxcustomer.domain.common
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月7日 下午4:05:44
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.domain.common;

import org.apache.commons.lang3.StringUtils;

/**
* @ClassName: SearchCondition
* @Description: TODO(这里用一句话描述这个类的作用)
* @author HuaSheng
* @date 2020年1月7日 下午4:05:44
*
*/
public class SearchCondition {
	/**
	 * 关键词
	 */
	public String keyword;
	/**
	 * 来源
	 */
	public String os;
	/**
	 * 城市
	 */
	public String city;
	/**
	 * 城市
	 */
	public String cityKey;
	/**
	 * 省
	 */
	public String province;
	/**
	 * 每页大小
	 */
	public Integer limit;
	/**
	 * 上一页
	 */
	public Integer lastPage;
	/**
	 * 下一页
	 */
	public Integer nextPage;
	
	/**
	 * 当前页
	 */
	public Integer page;

	private String operatorId;
	
	private String operatorName;
	
	private String batchCode;
	
	public String getKeyword() {
		if(StringUtils.isEmpty(keyword)) {
			keyword="%E7%BE%8E%E5%AE%B9%E9%99%A2";
		}
		return keyword;
	}

	public void setKeyword(String keyword) {
		if(StringUtils.isEmpty(keyword)) {
			keyword="%E7%BE%8E%E5%AE%B9%E9%99%A2";
		}
		this.keyword = keyword;
	}

	public String getCity() {
		if(StringUtils.isEmpty(city)) {
			this.city="";
		}
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getLastPage() {
		if(page==1) {
			this.lastPage =1;
		}
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
			this.lastPage = lastPage;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getPage() {
		if(this.page<1) {
			this.page=1;
		}
		return page;
	}

	public void setPage(Integer page) {
		if(page<1) {
			page=1;
		}
		this.page = page;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		if(StringUtils.isEmpty(os)) {
			os="MT";//美团
		}
		this.os = os;
	}

	public String getCityKey() {
		return cityKey;
	}

	public void setCityKey(String cityKey) {
		this.cityKey = cityKey;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	
	
}
