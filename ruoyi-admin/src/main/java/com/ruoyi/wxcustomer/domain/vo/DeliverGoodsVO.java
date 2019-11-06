/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: Snippet.java
 * @Package com.ruoyi.wxcustomer.domain.vo
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2019年11月2日 下午6:32:31
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.domain.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ruoyi.common.annotation.Excel;


/**
* @ClassName: Snippet
* @Description: TODO(这里用一句话描述这个类的作用)
* @author HuaSheng
* @date 2019年11月2日 下午6:32:31
*
*/
public class DeliverGoodsVO {
	 /** ID */
    private String id;
    /** orderNumber */
    private String orderNumber;

    /** 客户编号 */
    private String customerId;

    /** 跟进结果类型 */
    private String followResultType;

    /** 成交金额 */
    private Double dealAmount;

    /** 发样/成交清单 */
    @Excel(name = "发样清单")
    private String sendSampleList;

    /** 赠品清单 */
    private String giftsList;

    /** 成交日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Excel(name = "成交日期 ", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dealTime;
    /** 成交日期 */
    private Date dealTimeStart;
    private Date dealTimeEnd;

    /** 问题点 */
    private String troubleSpots;

    /** 意向点 */
    @Excel(name = "意向点 ")
    private String intentionPoint;

    /** 跟进次数 */
    @Excel(name = "跟进次数 ")
    private Long followTimes;

    /** 跟进情况 */
    @Excel(name = "跟进情况 ")
    private String followResult;

    /** 通话时长-时 */
    private Long durationHour;

    /** 通话时长-分 */
    private Long durationMinute;

    /** 通话时长-秒 */
    private Long durationSecond;

    /** 下次跟进时间 */
    private Date nextFollowTime;

    /** 下次跟进思路 */
    private String nextFollowMentality;

    /** 对接业务员id */
    private String creatorId;

    /** 对接业务员 */
    @Excel(name = "对接业务员 ")
    private String creator;

    /** 发件人 */
    private String sender;

    /** 发件人电话 */
    private String senderPhone;

    /** 发件人地址 */
    private String senderAddress;

    /** 发货日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sendTime;
    private Date sendTimeStart;
    private Date sendTimeEnd;

    /** 快递单号 */
    private String courierNumber;

    /** 物流公司 */
    private String logisticsCompany;

    /** 代收金额 */
    private Double collectingAmount;

    /** 保价金额 */
    private Double insuranceAmount;

    /** 邮费 */
    private Long postage;
    
    /**是否删除**/
    private String isDelete;
   

    /**意向度**/
    private String intentionDegree;

    //客户表

    /** 电话号 */
    @Excel(name = "手机号")
    private String phoneNumber;

    /** 微信号 */
    @Excel(name = "微信号")
    private String weixinNumber;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customerName;

    /** 性别 */
    private String gender;

    /** 性格 */
    private String khCharacter;

    

    /** 客户地址-省id */
    private String provinceId;

    /** 客户地址-省 */
    private String province;

    /** 客户地址-市id */
    private String cityId;

    /** 客户地址-市 */
    private String city;

    /** 客户地址-区id */
    private String areaId;

    /** 客户地址-区 */
    private String area;

    /** 客户地址详细 */
    private String customerAddress;

    /** 店名 */
    private String shopName;

    /** 预约沟通时间 */
    private Date appointmentTime;

    /** 客户类型（0：日化店  1：母婴店  2：美容院） */
    private String customerType;

    /** 店员数 */
    private Long shopAssistantNumber;
    /** 店铺数 */
    private int customerNum;

    /** 店铺规模 */
    private String storeScale;

    /** 创建时间 */
    private Date creationTime;

    /** 需求产品 */
    private String demandProduct;

    /** 是否发样（0：否 1：是） 默认0 */
    private String isDelivery;

    /** 是否销售（0：否 1：是）默认0 */
    private String isSales;
    
    /**备注**/
    private String remark;
    
    /**是否发货**/
    private String isDeliverGoods;
    /**售后人员**/
    private String saleId;
    /**售后人员**/
    private String saleName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFollowResultType() {
		return followResultType;
	}

	public void setFollowResultType(String followResultType) {
		this.followResultType = followResultType;
	}

	public Double getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(Double dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getSendSampleList() {
		return sendSampleList;
	}

	public void setSendSampleList(String sendSampleList) {
		this.sendSampleList = sendSampleList;
	}

	public String getGiftsList() {
		return giftsList;
	}

	public void setGiftsList(String giftsList) {
		this.giftsList = giftsList;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public String getTroubleSpots() {
		return troubleSpots;
	}

	public void setTroubleSpots(String troubleSpots) {
		this.troubleSpots = troubleSpots;
	}

	public String getIntentionPoint() {
		return intentionPoint;
	}

	public void setIntentionPoint(String intentionPoint) {
		this.intentionPoint = intentionPoint;
	}

	public Long getFollowTimes() {
		return followTimes;
	}

	public void setFollowTimes(Long followTimes) {
		this.followTimes = followTimes;
	}

	public String getFollowResult() {
		return followResult;
	}

	public void setFollowResult(String followResult) {
		this.followResult = followResult;
	}

	public Long getDurationHour() {
		return durationHour;
	}

	public void setDurationHour(Long durationHour) {
		this.durationHour = durationHour;
	}

	public Long getDurationMinute() {
		return durationMinute;
	}

	public void setDurationMinute(Long durationMinute) {
		this.durationMinute = durationMinute;
	}

	public Long getDurationSecond() {
		return durationSecond;
	}

	public void setDurationSecond(Long durationSecond) {
		this.durationSecond = durationSecond;
	}

	public Date getNextFollowTime() {
		return nextFollowTime;
	}

	public void setNextFollowTime(Date nextFollowTime) {
		this.nextFollowTime = nextFollowTime;
	}

	public String getNextFollowMentality() {
		return nextFollowMentality;
	}

	public void setNextFollowMentality(String nextFollowMentality) {
		this.nextFollowMentality = nextFollowMentality;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSenderPhone() {
		return senderPhone;
	}

	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getCourierNumber() {
		return courierNumber;
	}

	public void setCourierNumber(String courierNumber) {
		this.courierNumber = courierNumber;
	}

	public String getLogisticsCompany() {
		return logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public Double getCollectingAmount() {
		return collectingAmount;
	}

	public void setCollectingAmount(Double collectingAmount) {
		this.collectingAmount = collectingAmount;
	}

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Long getPostage() {
		return postage;
	}

	public void setPostage(Long postage) {
		this.postage = postage;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWeixinNumber() {
		return weixinNumber;
	}

	public void setWeixinNumber(String weixinNumber) {
		this.weixinNumber = weixinNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getKhCharacter() {
		return khCharacter;
	}

	public void setKhCharacter(String khCharacter) {
		this.khCharacter = khCharacter;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Date getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Long getShopAssistantNumber() {
		return shopAssistantNumber;
	}

	public void setShopAssistantNumber(Long shopAssistantNumber) {
		this.shopAssistantNumber = shopAssistantNumber;
	}

	public String getStoreScale() {
		return storeScale;
	}

	public void setStoreScale(String storeScale) {
		this.storeScale = storeScale;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getDemandProduct() {
		return demandProduct;
	}

	public void setDemandProduct(String demandProduct) {
		this.demandProduct = demandProduct;
	}

	public String getIsDelivery() {
		return isDelivery;
	}

	public void setIsDelivery(String isDelivery) {
		this.isDelivery = isDelivery;
	}

	public String getIsSales() {
		return isSales;
	}

	public void setIsSales(String isSales) {
		this.isSales = isSales;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public Date getDealTimeStart() {
		return dealTimeStart;
	}

	public void setDealTimeStart(Date dealTimeStart) {
		this.dealTimeStart = dealTimeStart;
	}

	public Date getDealTimeEnd() {
		return dealTimeEnd;
	}

	public void setDealTimeEnd(Date dealTimeEnd) {
		this.dealTimeEnd = dealTimeEnd;
	}

	public Date getSendTimeStart() {
		return sendTimeStart;
	}

	public void setSendTimeStart(Date sendTimeStart) {
		this.sendTimeStart = sendTimeStart;
	}

	public Date getSendTimeEnd() {
		return sendTimeEnd;
	}

	public void setSendTimeEnd(Date sendTimeEnd) {
		this.sendTimeEnd = sendTimeEnd;
	}

	public String getIsDeliverGoods() {
		return isDeliverGoods;
	}

	public void setIsDeliverGoods(String isDeliverGoods) {
		this.isDeliverGoods = isDeliverGoods;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public String getIntentionDegree() {
		return intentionDegree;
	}

	public void setIntentionDegree(String intentionDegree) {
		this.intentionDegree = intentionDegree;
	}
	
    
    
}

