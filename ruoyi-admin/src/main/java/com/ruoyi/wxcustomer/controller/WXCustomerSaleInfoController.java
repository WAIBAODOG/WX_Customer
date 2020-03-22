package com.ruoyi.wxcustomer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.service.IWechatCustomerService;

/**
 * 微信客户Controller
 * 
 * @author yzh
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/wxcustomer/saleInfo")
public class WXCustomerSaleInfoController extends BaseController {
	private String prefix = "wxcustomer/saleInfo";

	@Autowired
	private IWechatCustomerService wechatCustomerService;

	@RequiresPermissions("wxcustomer:saleInfo:view")
	@GetMapping()
	public String index() {
		return prefix + "/index";
	}
	
	@GetMapping("/findByPhone")
	@ResponseBody
	public List<WechatCustomer> findByPhone(String phone) {
		return wechatCustomerService.findByPhone(phone);
	}
	
	@GetMapping("/getSaleInfoById")
	@ResponseBody
	public Map<String, Object> getSaleInfoById(String customerId) {
		Map<String, Object> result = new HashMap<>();
		WechatCustomer  wechatCustomer =wechatCustomerService.selectWechatCustomerById(customerId);
		List<KhAfterSaleMember> khAfterSaleMemberList = wechatCustomerService.findKhAfterSaleMemberByCustomerId(customerId);
		List<KhDeliverGoods> khDeliverGoodsList = wechatCustomerService.findKhDeliverGoodsByCustomerId(customerId);
		result.put("sh", khAfterSaleMemberList);
		result.put("fy", khDeliverGoodsList);
		result.put("info", wechatCustomer);
		return result;
	}
}
