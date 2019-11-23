/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: SendVO.java
 * @Package com.ruoyi.wxcustomer.domain.exportvo
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2019年11月22日 下午3:17:20
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.domain.exportvo;

import java.util.Date;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
* @ClassName: SendVO
* @Description: TODO(这里用一句话描述这个类的作用)
* @author HuaSheng
* @date 2019年11月22日 下午3:17:20
*
*/
public class SendVO extends  BaseEntity{
	private static final long serialVersionUID = 1L;
	 /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customerName;
    /** 电话号 */
    @Excel(name = "手机号")
    private String phoneNumber;
    /** 客户地址详细 */
    @Excel(name = "客户地址")
    private String customerAddress;
    /** 对接业务员 */
    @Excel(name = "对接业务员 ")
    private String creator;
    /** 发样/成交清单 */
    @Excel(name = "发样清单")
    private String sendSampleList;
    /** 赠品清单 */
    @Excel(name = " 赠品清单")
    private String giftsList;
    /** 成交日期 */
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dealTime;
    /** 是否发货 */
    @Excel(name = " 是否发货")
    private String isSend;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
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
	public String getIsSend() {
		return isSend;
	}
	public void setIsSend(String isSend) {
		this.isSend = isSend;
	}
    
}
