package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 微信客户对象 kh_wechat_customer
 * 
 * @author yzh
 * @date 2019-10-23
 */
public class WechatCustomer extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** 客户ID */
    private String customerId;

    /** 电话号 */
    @Excel(name = "电话号")
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

    /** 创建人id（对接业务员） */
    private String creatorId;

    /** 对接业务员 */
    @Excel(name = "对接业务员")
    private String creator;

    /** 客户地址-省id */
    private String provinceId;

    /** 客户地址-省 */
    @Excel(name = "客户地址-省")
    private String province;

    /** 客户地址-市id */
    private String cityId;

    /** 客户地址-市 */
    @Excel(name = "客户地址-市")
    private String city;

    /** 客户地址-区id */
    private String areaId;

    /** 客户地址-区 */
    @Excel(name = "客户地址-区")
    private String area;

    /** 客户地址详细 */
    private String customerAddress;

    /** 店名 */
    @Excel(name = "店名")
    private String shopName;

    /** 预约沟通时间 */
    @Excel(name = "预约沟通时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date appointmentTime;

    /** 客户类型（0：日化店  1：母婴店  2：美容院） */
    @Excel(name = "客户类型", readConverterExp = "0=日化店,1=母婴店,2=美容院")
    private String customerType;

    /** 店员数 */
    private Long shopAssistantNumber;

    /**
     * 店铺数
     */
    private Long customerNum;
    
    /** 店铺规模 */
    private String storeScale;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 需求产品 */
    private String demandProduct;

    /** 是否发样（0：否 1：是） 默认0 */
    @Excel(name = "是否发样", readConverterExp = "0=否,1=是")
    private String isDelivery;

    /** 是否销售（0：否 1：是）默认0 */
    @Excel(name = "是否销售", readConverterExp = "0=否,1=是")
    private String isSales;
    /**是否删除**/
    private String isDelete;
    /**售后人员**/
    private String saleId;
    /**售后人员**/
    private String saleName;
    
    private String isFyUser;   //是否发样成交人员, 不持久化
    private String shUserId;   //售后人员Id, 不持久化
    private String customerStartbirthday;
    private String customerEndbirthday;
    private String operateFlag;
    private String status;   //客户状态
    
    /** 客户生日 */
    @Excel(name = "客户生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date customerbirthday;

    /** 预计下次跟进时间 */
    @Excel(name = "预计下次跟进时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nexttime;

    /** 预计库存 */
    @Excel(name = "预计库存")
    private String expectedinventory;
    
    @Excel(name = "客户等级")
    private String customerLevel;

    @Excel(name = "已合作产品")
    private String coopProduct;
    
    /**
     	* 权限用户ids
     */
    private String dataRightUserIds;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setWeixinNumber(String weixinNumber) {
        this.weixinNumber = weixinNumber;
    }

    public String getWeixinNumber() {
        return weixinNumber;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setKhCharacter(String khCharacter) {
        this.khCharacter = khCharacter;
    }

    public String getKhCharacter() {
        return khCharacter;
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
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceId() {
        return provinceId;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityId() {
        return cityId;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaId() {
        return areaId;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }
    public void setShopAssistantNumber(Long shopAssistantNumber) {
        this.shopAssistantNumber = shopAssistantNumber;
    }

    public Long getShopAssistantNumber() {
        return shopAssistantNumber;
    }
    public void setStoreScale(String storeScale) {
        this.storeScale = storeScale;
    }

    public String getStoreScale() {
        return storeScale;
    }
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() {
        return creationTime;
    }
    public void setDemandProduct(String demandProduct) {
        this.demandProduct = demandProduct;
    }

    public String getDemandProduct() {
        return demandProduct;
    }
    public void setIsDelivery(String isDelivery) {
        this.isDelivery = isDelivery;
    }

    public String getIsDelivery() {
        return isDelivery;
    }
    public void setIsSales(String isSales) {
        this.isSales = isSales;
    }

    public String getIsSales() {
        return isSales;
    }

    public Long getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(Long customerNum) {
		this.customerNum = customerNum;
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
	

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getIsFyUser() {
		return isFyUser;
	}

	public void setIsFyUser(String isFyUser) {
		this.isFyUser = isFyUser;
	}

	public String getShUserId() {
		return shUserId;
	}

	public void setShUserId(String shUserId) {
		this.shUserId = shUserId;
	}

    public void setCustomerbirthday(Date customerbirthday) {
        this.customerbirthday = customerbirthday;
    }

    public Date getCustomerbirthday() {
        return customerbirthday;
    }
    public void setNexttime(Date nexttime) {
        this.nexttime = nexttime;
    }

    public Date getNexttime() {
        return nexttime;
    }
    public void setExpectedinventory(String expectedinventory) {
        this.expectedinventory = expectedinventory;
    }

    public String getExpectedinventory() {
        return expectedinventory;
    }


    public String getCustomerStartbirthday() {
		return customerStartbirthday;
	}

	public void setCustomerStartbirthday(String customerStartbirthday) {
		this.customerStartbirthday = customerStartbirthday;
	}

	public String getCustomerEndbirthday() {
		return customerEndbirthday;
	}

	public void setCustomerEndbirthday(String customerEndbirthday) {
		this.customerEndbirthday = customerEndbirthday;
	}
	
	public String getOperateFlag() {
		return operateFlag;
	}

	public void setOperateFlag(String operateFlag) {
		this.operateFlag = operateFlag;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	public String getCoopProduct() {
		return coopProduct;
	}

	public void setCoopProduct(String coopProduct) {
		this.coopProduct = coopProduct;
	}

	public String getDataRightUserIds() {
		return dataRightUserIds;
	}

	public void setDataRightUserIds(String dataRightUserIds) {
		this.dataRightUserIds = dataRightUserIds;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerId", getCustomerId())
            .append("phoneNumber", getPhoneNumber())
            .append("weixinNumber", getWeixinNumber())
            .append("customerName", getCustomerName())
            .append("gender", getGender())
            .append("khCharacter", getKhCharacter())
            .append("creatorId", getCreatorId())
            .append("creator", getCreator())
            .append("provinceId", getProvinceId())
            .append("province", getProvince())
            .append("cityId", getCityId())
            .append("city", getCity())
            .append("areaId", getAreaId())
            .append("area", getArea())
            .append("customerAddress", getCustomerAddress())
            .append("shopName", getShopName())
            .append("appointmentTime", getAppointmentTime())
            .append("customerType", getCustomerType())
            .append("shopAssistantNumber", getShopAssistantNumber())
            .append("storeScale", getStoreScale())
            .append("creationTime", getCreationTime())
            .append("demandProduct", getDemandProduct())
            .append("remark", getRemark())
            .append("isDelivery", getIsDelivery())
            .append("isSales", getIsSales())
            .append("customerNum", getCustomerNum())
            .append("saleName", getSaleName())
            .append("saleId", getSaleId())
            .append("isDelete", getIsDelete())
            .append("customerbirthday", getCustomerbirthday())
            .append("nexttime", getNexttime())
            .append("expectedinventory", getExpectedinventory())
            .append("customerLevel", getCustomerLevel())
            .append("coopProduct", getCoopProduct())
            .toString();
    }
}
