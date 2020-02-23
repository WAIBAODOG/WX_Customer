package com.ruoyi.wxcustomer.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.wxcustomer.domain.KhDailySummary;
import com.ruoyi.wxcustomer.service.IKhDailySummaryService;
import com.ruoyi.wxcustomer.service.impl.RoleDataService;

/**
 * 工作总结Controller
 * 
 * @author ruoyi
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/wxcustomer/summary")
public class KhDailySummaryController extends BaseController{
    private String prefix = "wxcustomer/summary";

    @Autowired
    private IKhDailySummaryService khDailySummaryService;
    
    @Autowired
	private RoleDataService roleDataService;

    @RequiresPermissions("wxcustomer:summary:view")
    @GetMapping()
    public String summary(){
        return prefix + "/summary";
    }

    /**
     * 查询工作总结列表
     */
    @RequiresPermissions("wxcustomer:summary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KhDailySummary khDailySummary){
        startPage();
        khDailySummary.setDataRightUserIds(roleDataService.getRoleData());
        List<KhDailySummary> list = khDailySummaryService.selectKhDailySummaryList(khDailySummary);
        return getDataTable(list);
    }

    /**
     * 导出工作总结列表
     */
    @RequiresPermissions("wxcustomer:summary:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhDailySummary khDailySummary){
    	khDailySummary.setDataRightUserIds(roleDataService.getRoleData());
        List<KhDailySummary> list = khDailySummaryService.selectKhDailySummaryList(khDailySummary);
        ExcelUtil<KhDailySummary> util = new ExcelUtil<KhDailySummary>(KhDailySummary.class);
        return util.exportExcel(list, "summary");
    }

    /**
     * 新增工作总结
     */
    @GetMapping("/add")
    public String add(){
        return prefix + "/add";
    }

    /**
     * 新增保存工作总结
     */
    @RequiresPermissions("wxcustomer:summary:add")
    @Log(title = "工作总结", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhDailySummary khDailySummary){
    	SysUser sysUser = ShiroUtils.getSysUser();
    	khDailySummary.setId(UUID.randomUUID().toString().replaceAll("-", ""));
    	khDailySummary.setCreatorId(sysUser.getUserId().toString());
    	khDailySummary.setCreator(sysUser.getUserName());
    	khDailySummary.setCreationTime(new Date());
        return toAjax(khDailySummaryService.insertKhDailySummary(khDailySummary));
    }

    /**
     * 修改工作总结
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap){
        KhDailySummary khDailySummary = khDailySummaryService.selectKhDailySummaryById(id);
        mmap.put("khDailySummary", khDailySummary);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作总结
     */
    @RequiresPermissions("wxcustomer:summary:edit")
    @Log(title = "工作总结", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhDailySummary khDailySummary) {
        return toAjax(khDailySummaryService.updateKhDailySummary(khDailySummary));
    }

    /**
     * 删除工作总结
     */
    @RequiresPermissions("wxcustomer:summary:remove")
    @Log(title = "工作总结", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(khDailySummaryService.deleteKhDailySummaryByIds(ids));
    }
}
