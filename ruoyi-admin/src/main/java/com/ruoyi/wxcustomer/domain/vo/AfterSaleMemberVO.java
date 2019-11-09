package com.ruoyi.wxcustomer.domain.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 售后情况对象 kh_after_sale_member
 * 
 * @author WBG
 * @date 2019-10-28
 */
public class AfterSaleMemberVO extends BaseEntity{
    private static final long serialVersionUID = 1L;

    //客户表
    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customerName;

    /** 电话号 */
    @Excel(name = "电话号")
    private String phoneNumber;

    /** 微信号 */
    @Excel(name = "微信号 ")
    private String weixinNumber;

  

    /** 性别 */
    @Excel(name = "性别 ", readConverterExp = "0=女,1=男")
    private String gender;

    /** 性格 */
    @Excel(name = "性格")
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
    @Excel(name = "客户地址")
    private String customerAddress;

    /**店名  */
    @Excel(name = "店名")
    private String shopName;

    /** 预约沟通时间 */
    private Date appointmentTime;

    /** 客户类型（0：日化店  1：母婴店  2：美容院） */
    private String customerType;

    /** 店员数 */
    @Excel(name = "店员数")
    private Long shopAssistantNumber;
    /** 店铺数 */
    private int customerNum;

    /** 店铺规模 */
    @Excel(name = "店铺规模")
    private String storeScale;

    /** 创建时间 */
    private Date creationTime;

    /** 需求产品 */
    @Excel(name = "需求产品")
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

    
    /**
     * 售后表
     */
    
    /** 对接业务员 */
    @Excel(name = "对接业务员")
    private String creator;
    /** ID */
    private String id;
    /** orderNumber */
    private String orderNumber;

    /** 客户编号 */
    private String customerId;

    /** 跟进结果类型 */
    private String followResultType;

    /** 成交金额 */
    @Excel(name = "订单总金额")
    private Double dealAmount;

    /** 发样/成交清单 */
    @Excel(name = "成交清单")
    private String sendSampleList;

    /** 赠品清单 */
    @Excel(name = "赠品清单")
    private String giftsList;

    /** 成交日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Excel(name = "成交日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dealTime;
    /** 成交日期 */
    private String dealTimeStart;
    private String dealTimeEnd;

    /** 问题点 */
    @Excel(name = "问题点")
    private String troubleSpots;

    /** 意向点 */
    @Excel(name = "意向点")
    private String intentionPoint;

    /** 跟进次数 */
    private Long followTimes;

    /** 跟进情况 */
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

   

    /** 发件人 */
    private String sender;

    /** 发件人电话 */
    private String senderPhone;

    /** 发件人地址 */
    private String senderAddress;

    /** 发货日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sendTime;
    private String sendTimeStart;
    private String sendTimeEnd;

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
    private String isDeal;
   
    /**意向度**/
    private String intentionDegree;
    /**返单次数**///客户成交次数
    @Excel(name = "返单次数")
    private String countDealOrder;
    @Excel(name = "返单次数")
    private String countAfterOrder;
    private String selfData;    
    private String allData;  
    private String isFYRY;  
    private String isSHRY;  
    
  
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setFollowResultType(String followResultType) {
        this.followResultType = followResultType;
    }

    public String getFollowResultType() {
        return followResultType;
    }
    public void setDealAmount(Double dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Double getDealAmount() {
        return dealAmount;
    }
    public void setSendSampleList(String sendSampleList) {
        this.sendSampleList = sendSampleList;
    }

    public String getSendSampleList() {
        return sendSampleList;
    }
    public void setGiftsList(String giftsList) {
        this.giftsList = giftsList;
    }

    public String getGiftsList() {
        return giftsList;
    }
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Date getDealTime() {
        return dealTime;
    }
    public void setTroubleSpots(String troubleSpots) {
        this.troubleSpots = troubleSpots;
    }

    public String getTroubleSpots() {
        return troubleSpots;
    }
    public void setIntentionPoint(String intentionPoint) {
        this.intentionPoint = intentionPoint;
    }

    public String getIntentionPoint() {
        return intentionPoint;
    }
    public void setFollowTimes(Long followTimes) {
        this.followTimes = followTimes;
    }

    public Long getFollowTimes() {
        return followTimes;
    }
    public void setFollowResult(String followResult) {
        this.followResult = followResult;
    }

    public String getFollowResult() {
        return followResult;
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

	public void setNextFollowTime(Date nextFollowTime) {
        this.nextFollowTime = nextFollowTime;
    }

    public Date getNextFollowTime() {
        return nextFollowTime;
    }
    public void setNextFollowMentality(String nextFollowMentality) {
        this.nextFollowMentality = nextFollowMentality;
    }

    public String getNextFollowMentality() {
        return nextFollowMentality;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }
    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderPhone() {
        return senderPhone;
    }
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderAddress() {
        return senderAddress;
    }
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getSendTime() {
        return sendTime;
    }
    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public String getCourierNumber() {
        return courierNumber;
    }
    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }
    public void setCollectingAmount(Double collectingAmount) {
        this.collectingAmount = collectingAmount;
    }

    public Double getCollectingAmount() {
        return collectingAmount;
    }
    public void setInsuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Double getInsuranceAmount() {
        return insuranceAmount;
    }
    public void setPostage(Long postage) {
        this.postage = postage;
    }

    public Long getPostage() {
        return postage;
    }
    public void setIsDeal(String isDeal) {
        this.isDeal = isDeal;
    }

    public String getIsDeal() {
        return isDeal;
    }

    public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

	public int getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
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

	public String getIsDeliverGoods() {
		return isDeliverGoods;
	}

	public void setIsDeliverGoods(String isDeliverGoods) {
		this.isDeliverGoods = isDeliverGoods;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getDealTimeStart() {
		return dealTimeStart;
	}

	public void setDealTimeStart(String dealTimeStart) {
		this.dealTimeStart = dealTimeStart;
	}

	public String getDealTimeEnd() {
		return dealTimeEnd;
	}

	public void setDealTimeEnd(String dealTimeEnd) {
		this.dealTimeEnd = dealTimeEnd;
	}

	public String getSendTimeStart() {
		return sendTimeStart;
	}

	public void setSendTimeStart(String sendTimeStart) {
		this.sendTimeStart = sendTimeStart;
	}

	public String getSendTimeEnd() {
		return sendTimeEnd;
	}

	public void setSendTimeEnd(String sendTimeEnd) {
		this.sendTimeEnd = sendTimeEnd;
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

	public String getCountDealOrder() {
		return countDealOrder;
	}

	public void setCountDealOrder(String countDealOrder) {
		this.countDealOrder = countDealOrder;
	}

	public String getCountAfterOrder() {
		return countAfterOrder;
	}

	public void setCountAfterOrder(String countAfterOrder) {
		this.countAfterOrder = countAfterOrder;
	}

	public String getSelfData() {
		return selfData;
	}

	public void setSelfData(String selfData) {
		this.selfData = selfData;
	}

	public String getAllData() {
		return allData;
	}

	public void setAllData(String allData) {
		this.allData = allData;
	}

	public String getIsFYRY() {
		return isFYRY;
	}

	public void setIsFYRY(String isFYRY) {
		this.isFYRY = isFYRY;
	}

	public String getIsSHRY() {
		return isSHRY;
	}

	public void setIsSHRY(String isSHRY) {
		this.isSHRY = isSHRY;
	}

	 
	 
}
