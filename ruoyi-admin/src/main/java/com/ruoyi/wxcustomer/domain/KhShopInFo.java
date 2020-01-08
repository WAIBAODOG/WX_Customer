/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: SearchShopInFo.java
 * @Package com.ruoyi.wxcustomer.domain.common
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月7日 下午5:02:29
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.domain;

import java.util.Date;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * @ClassName: SearchShopInFo
 * @author HuaSheng
 * @date 2020年1月7日 下午5:02:29
 *
 */
public class KhShopInFo extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String id;
	private String poi;
	private String link;
	private String shopName;
	private String phone;
	private String province;
	private String city;
	private String adress;
	private String keyword;
	private String classic;
	private String os;
	private Date createDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoi() {
		return poi;
	}

	public void setPoi(String poi) {
		this.poi = poi;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getClassic() {
		return classic;
	}

	public void setClassic(String classic) {
		this.classic = classic;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
