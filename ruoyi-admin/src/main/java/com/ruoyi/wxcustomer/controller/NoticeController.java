/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: NoticeController.java
 * @Package com.ruoyi.wxcustomer.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2019年12月11日 上午10:27:34
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.service.IWechatCustomerService;

/**
* @ClassName: NoticeController
* @Description: 通知
* @author HuaSheng
* @date 2019年12月11日 上午10:27:34
*
*/
@Controller
@RequestMapping("/wxcustomer/notice")
public class NoticeController extends BaseController{
	@Autowired
	private IWechatCustomerService wechatCustomerService;
	/**
	 * 提醒
	 */
	@PostMapping("/notice")
	@ResponseBody
	public TableDataInfo birthdayNotice(){
		WechatCustomer wechatCustomer=new WechatCustomer();
		Calendar calendar=Calendar.getInstance(); 
		wechatCustomer.setCustomerStartbirthday(DateUtils.parseDateToStr("yyyy-MM-dd",calendar.getTime()));//今天
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+7);//让日期加7  
		wechatCustomer.setCustomerEndbirthday(DateUtils.parseDateToStr("yyyy-MM-dd", calendar.getTime()));
		List<WechatCustomer> list=wechatCustomerService.selectWechatCustomerList(wechatCustomer);
		for(int i=0;i<list.size();i++) {//客户生日提醒
			list.get(i).setOperateFlag("B");//生日提醒
		}
		SysUser sysUser = ShiroUtils.getSysUser();
		Long thisUserId=sysUser.getUserId();
		WechatCustomer wc=new WechatCustomer();
		wc.setIsSales("0");
		wc.setNexttime(new Date());
		wc.setCreatorId(String.valueOf(thisUserId));
		List<WechatCustomer> saleList=wechatCustomerService.selectWechatCustomerList(wc);
		wc.setIsSales("1");
		wc.setCreatorId(null);
		wc.setSaleId(String.valueOf(thisUserId));
		List<WechatCustomer> noSaleList=wechatCustomerService.selectWechatCustomerList(wc);
		for(int i=0;i<noSaleList.size();i++) {//跟进计划提醒
			saleList.add(noSaleList.get(i));
		}
		for(int i=0;i<saleList.size();i++) {
			saleList.get(i).setOperateFlag("G");
			list.add(saleList.get(i));
		}
		
		return  getDataTable(list);
	}
	/**
	 * 跟进计划提醒
	 */
	@PostMapping("/planNotice")
	@ResponseBody
	public TableDataInfo planNotice(){
		SysUser sysUser = ShiroUtils.getSysUser();
		Long thisUserId=sysUser.getUserId();
		WechatCustomer wc=new WechatCustomer();
		wc.setIsSales("0");
		wc.setNexttime(new Date());
		wc.setCreatorId(String.valueOf(thisUserId));
		List<WechatCustomer> saleList=wechatCustomerService.selectWechatCustomerList(wc);
		for(int i=0;i<saleList.size();i++) {//跟进计划提醒
			saleList.get(i).setOperateFlag("G");
		}
		wc.setIsSales("1");
		wc.setCreatorId(null);
		wc.setSaleId(String.valueOf(thisUserId));
		List<WechatCustomer> noSaleList=wechatCustomerService.selectWechatCustomerList(wc);
		for(int i=0;i<noSaleList.size();i++) {//跟进计划提醒
			noSaleList.get(i).setOperateFlag("G");
			saleList.add(noSaleList.get(i));
		}
		
		return  getDataTable(saleList);
	}
}
