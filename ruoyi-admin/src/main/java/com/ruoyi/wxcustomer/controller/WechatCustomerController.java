package com.ruoyi.wxcustomer.controller;

import java.util.List;

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

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.service.IWechatCustomerService;

/**
 * 微信客户Controller
 * 
 * @author yzh
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/wxcustomer/WechatCustomer")
public class WechatCustomerController extends BaseController{
    private String prefix = "wxcustomer/WechatCustomer";

    @Autowired
    private IWechatCustomerService wechatCustomerService;

    @RequiresPermissions("wxcustomer:WechatCustomer:view")
    @GetMapping()
    public String WechatCustomer(){
        return prefix + "/WechatCustomer";
    }

    /**
     * 查询微信客户列表
     */
    @RequiresPermissions("wxcustomer:WechatCustomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WechatCustomer wechatCustomer){
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
    public AjaxResult export(WechatCustomer wechatCustomer){
        List<WechatCustomer> list = wechatCustomerService.selectWechatCustomerList(wechatCustomer);
        ExcelUtil<WechatCustomer> util = new ExcelUtil<WechatCustomer>(WechatCustomer.class);
        return util.exportExcel(list, "WechatCustomer");
    }

    /**
     * 新增微信客户
     */
    @GetMapping("/add")
    public String add(Model model){
    	model.addAttribute("user", ShiroUtils.getSysUser());
        return prefix + "/add";
    }
    
    /**
     * 新增销售情况
     */
    @RequiresPermissions("wxcustomer:WechatCustomer:add")
    @GetMapping("/addSaleInfo")
    public String addSaleInfo(Model model){
    	model.addAttribute("user", ShiroUtils.getSysUser());
    	return prefix + "/addSaleInfo";
    }
    
    /**
     * 新增售后情况
     */
    @RequiresPermissions("wxcustomer:WechatCustomer:add")
    @GetMapping("/addPostSale")
    public String addPostSale(Model model){
    	model.addAttribute("user", ShiroUtils.getSysUser());
    	return prefix + "/addPostSale";
    }

    /**
     * 新增保存微信客户
     */
    @RequiresPermissions("wxcustomer:WechatCustomer:add")
    @Log(title = "微信客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WechatCustomer wechatCustomer){
        return toAjax(wechatCustomerService.insertWechatCustomer(wechatCustomer));
    }

    /**
     * 修改微信客户
     */
    @GetMapping("/edit/{customerId}")
    public String edit(@PathVariable("customerId") String customerId, ModelMap mmap){
        WechatCustomer wechatCustomer = wechatCustomerService.selectWechatCustomerById(customerId);
        mmap.put("wechatCustomer", wechatCustomer);
        return prefix + "/add";
    }

    /**
     * 修改保存微信客户
     */
    @RequiresPermissions("wxcustomer:WechatCustomer:edit")
    @Log(title = "微信客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WechatCustomer wechatCustomer) {
        return toAjax(wechatCustomerService.updateWechatCustomer(wechatCustomer));
    }

    /**
     * 删除微信客户
     */
    @RequiresPermissions("wxcustomer:WechatCustomer:remove")
    @Log(title = "微信客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(wechatCustomerService.deleteWechatCustomerByIds(ids));
    }
}
