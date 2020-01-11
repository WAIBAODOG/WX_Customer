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

import com.ruoyi.common.annotation.Excel;
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
	@Excel(name = "店名")
	private String shopName;
	@Excel(name = "联系方式")
	private String phone;
	@Excel(name = "省")
	private String province;
	@Excel(name = "城市")
	private String city;
	@Excel(name = "地址")
	private String adress;
	@Excel(name = "关键字")
	private String keyword;
	private String classic;
	@Excel(name = "来源", readConverterExp = "MT=美团,AMAP=高德地图")
	private String os;
	@Excel(name = "创建时间",dateFormat = "yyyy-MM-dd")
	private Date createDate;
	private String operatorId;
	@Excel(name = "操作人")
	private String operatorName;
	@Excel(name = "访问地址")
	private String link;
	@Excel(name = "批次号")
	private String batchCode;

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
