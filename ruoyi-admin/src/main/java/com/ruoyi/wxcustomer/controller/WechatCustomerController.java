package com.ruoyi.wxcustomer.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.domain.vo.AfterSaleMemberVO;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IWechatCustomerService;
import com.ruoyi.wxcustomer.service.impl.RoleDataService;

/**
 * 微信客户Controller
 * 
 * @author yzh
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/wxcustomer/WechatCustomer")
public class WechatCustomerController extends BaseController {
	private String prefix = "wxcustomer/WechatCustomer";

	@Autowired
	private IWechatCustomerService wechatCustomerService;
	
	@Autowired
	private RoleDataService roleDataService;

	@RequiresPermissions("wxcustomer:WechatCustomer:view")
	@GetMapping()
	public String WechatCustomer() {
		return prefix + "/WechatCustomer";
	}

	/**
	 * 查询微信客户列表
	 */
	@RequiresPermissions("wxcustomer:WechatCustomer:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(WechatCustomer wechatCustomer) {
		wechatCustomer.setIsDelete("0");//未删除的
		wechatCustomer.setDataRightUserIds(roleDataService.getRoleData());
		startPage();
		List<WechatCustomer> list = wechatCustomerService.selectWechatCustomerList(wechatCustomer);
		return getDataTable(list);
	}

	/**
	 * 导出微信客户列表
	 */
	@RequiresPermissions("wxcustomer:WechatCustomer:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(WechatCustomer wechatCustomer) {
		wechatCustomer.setIsDelete("0");//未删除的
		wechatCustomer.setDataRightUserIds(roleDataService.getRoleData());
		List<WechatCustomer> list = wechatCustomerService.selectWechatCustomerList(wechatCustomer);
		ExcelUtil<WechatCustomer> util = new ExcelUtil<WechatCustomer>(WechatCustomer.class);
		return util.exportExcel(list, "WechatCustomer");
	}

	/**
	 * 新增微信客户
	 */
	@GetMapping("/add")
	@RequiresPermissions("wxcustomer:WechatCustomer:add")
	public String add(Model model) {
		SysUser sysUser = ShiroUtils.getSysUser();
		WechatCustomer wechatCustomer = new WechatCustomer();
		wechatCustomer.setCustomerId(UUID.randomUUID().toString().replaceAll("-", ""));
		wechatCustomer.setCreatorId(sysUser.getUserId().toString());
		wechatCustomer.setCreator(sysUser.getUserName());
		model.addAttribute("wechatCustomer", wechatCustomer);
		model.addAttribute("isAdd", "1");
		return prefix + "/add";
	}

	/**
	 * 新增销售情况
	 */
	@RequiresPermissions("wxcustomer:WechatCustomer:addSaleInfo")
	@GetMapping("/addSaleInfo")
	public String addSaleInfo(Model model, String id, String isView) {
		model.addAttribute("user", ShiroUtils.getSysUser());
		model.addAttribute("id", id);
		model.addAttribute("isView", isView);
		model.addAttribute("createTime", DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		return prefix + "/addSaleInfo";
	}

	/**
	 * 新增售后情况
	 */
	@RequiresPermissions("wxcustomer:WechatCustomer:addPostSale")
	@GetMapping("/addPostSale")
	public String addPostSale(Model model, String id, String isView) {
		model.addAttribute("user", ShiroUtils.getSysUser());
		model.addAttribute("id", id);
		model.addAttribute("isView", isView);
		model.addAttribute("createTime", DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		return prefix + "/addPostSale";
	}

	/**
	 * 新增保存微信客户
	 */
	@RequiresPermissions("wxcustomer:WechatCustomer:add")
	@Log(title = "微信客户", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(WechatCustomer wechatCustomer,String saleInfoStr, String postSaleStr) {
		List<KhDeliverGoods> saleInfoList = StringUtils.isBlank(saleInfoStr) ? null : JSON.parseArray(saleInfoStr, KhDeliverGoods.class);
		List<KhAfterSaleMember> postSaleList = StringUtils.isBlank(postSaleStr) ? null : JSON.parseArray(postSaleStr, KhAfterSaleMember.class);
		return toAjax(wechatCustomerService.addWechatCustomer(wechatCustomer, saleInfoList, postSaleList));
	}

	/**
	 * 修改微信客户
	 */
	@GetMapping("/edit/{customerId}")
	public String edit(@PathVariable("customerId") String customerId, ModelMap mmap) {
		WechatCustomer wechatCustomer = wechatCustomerService.selectWechatCustomerById(customerId);
		List<KhDeliverGoods> khDeliverGoodsList = wechatCustomerService.findKhDeliverGoodsByCustomerId(customerId);
		List<KhAfterSaleMember> khAfterSaleMemberList = wechatCustomerService.findKhAfterSaleMemberByCustomerId(customerId);
		
		mmap.put("khDeliverGoodsDataStr", JSON.toJSONString(khDeliverGoodsList == null? null : khDeliverGoodsList));
		mmap.put("khAfterSaleMemberDataStr", JSON.toJSONString(khAfterSaleMemberList == null? null : khAfterSaleMemberList));
		mmap.put("wechatCustomer", wechatCustomer);
		mmap.addAttribute("isAdd", "0");
		return prefix + "/add";
	}

	/**
	 * 修改保存微信客户
	 */
	@RequiresPermissions("wxcustomer:WechatCustomer:edit")
	@Log(title = "微信客户", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(WechatCustomer wechatCustomer,String saleInfoStr, String postSaleStr) {
		List<KhDeliverGoods> saleInfoList = StringUtils.isBlank(saleInfoStr) ? null : JSON.parseArray(saleInfoStr, KhDeliverGoods.class);
		List<KhAfterSaleMember> postSaleList = StringUtils.isBlank(postSaleStr) ? null : JSON.parseArray(postSaleStr, KhAfterSaleMember.class);
		int i=wechatCustomerService.updateWechatCustomer(wechatCustomer, saleInfoList, postSaleList);
		return toAjax(i);
	}

	/**
	 * 删除微信客户
	 */
	@RequiresPermissions("wxcustomer:WechatCustomer:remove")
	@Log(title = "微信客户", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		String msg = wechatCustomerService.deleteWechatCustomerByIds(ids);
		if(msg == null) {
			return success();
		}
		return error(msg);
	}
	
	/**
	 * 分配业务对接人
	 */
	@PostMapping("/distributionBusinessMan")
	@ResponseBody
	public AjaxResult distributionSale( String businessManId, String businessManName,
			String customerid) {
		WechatCustomer wechatCustomer = new WechatCustomer();
		if (StringUtils.isNotEmpty(customerid)) {
			wechatCustomer.setCustomerId(customerid);
			wechatCustomer.setCreatorId(businessManId);
			wechatCustomer.setCreator(businessManName);
			return toAjax(wechatCustomerService.updateWechatCustomer(wechatCustomer));
		}else {
			return toAjax(false);
		}
		 
	}
}
