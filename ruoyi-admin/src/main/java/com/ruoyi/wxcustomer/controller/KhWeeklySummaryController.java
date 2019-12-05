package com.ruoyi.wxcustomer.controller;

import java.util.List;
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
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.wxcustomer.domain.KhWeeklySummary;
import com.ruoyi.wxcustomer.service.IKhWeeklySummaryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 发样每周工作Controller
 * 
 * @author ruoyi
 * @date 2019-12-01
 */
@Controller
@RequestMapping("/wxcustomer/weeklySummary")
public class KhWeeklySummaryController extends BaseController{
    private String prefix = "wxcustomer/weeklySummary";

    @Autowired
    private IKhWeeklySummaryService khWeeklySummaryService;

    @RequiresPermissions("wxcustomer:weeklySummary:view")
    @GetMapping()
    public String weeklySummary(){
        return prefix + "/weeklySummary";
    }

    /**
     * 查询发样每周工作列表
     */
    @RequiresPermissions("wxcustomer:weeklySummary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KhWeeklySummary khWeeklySummary){
        startPage();
        List<KhWeeklySummary> list = khWeeklySummaryService.selectKhWeeklySummaryList(khWeeklySummary);
        return getDataTable(list);
    }

    /**
     * 导出发样每周工作列表
     */
    @RequiresPermissions("wxcustomer:weeklySummary:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhWeeklySummary khWeeklySummary){
        List<KhWeeklySummary> list = khWeeklySummaryService.selectKhWeeklySummaryList(khWeeklySummary);
        ExcelUtil<KhWeeklySummary> util = new ExcelUtil<KhWeeklySummary>(KhWeeklySummary.class);
        return util.exportExcel(list, "weeklySummary");
    }

    /**
     * 新增发样每周工作
     */
    @GetMapping("/add")
    public String add(){
        return prefix + "/add";
    }

    /**
     * 新增保存发样每周工作
     */
    @RequiresPermissions("wxcustomer:weeklySummary:add")
    @Log(title = "发样每周工作", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhWeeklySummary khWeeklySummary){
        return toAjax(khWeeklySummaryService.insertKhWeeklySummary(khWeeklySummary));
    }

    /**
     * 修改发样每周工作
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap){
        KhWeeklySummary khWeeklySummary = khWeeklySummaryService.selectKhWeeklySummaryById(id);
        mmap.put("khWeeklySummary", khWeeklySummary);
        return prefix + "/edit";
    }

    /**
     * 修改保存发样每周工作
     */
    @RequiresPermissions("wxcustomer:weeklySummary:edit")
    @Log(title = "发样每周工作", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhWeeklySummary khWeeklySummary) {
        return toAjax(khWeeklySummaryService.updateKhWeeklySummary(khWeeklySummary));
    }

    /**
     * 删除发样每周工作
     */
    @RequiresPermissions("wxcustomer:weeklySummary:remove")
    @Log(title = "发样每周工作", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(khWeeklySummaryService.deleteKhWeeklySummaryByIds(ids));
    }
}
