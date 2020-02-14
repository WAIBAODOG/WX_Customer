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
import com.ruoyi.wxcustomer.domain.KhAssets;
import com.ruoyi.wxcustomer.service.IKhAssetsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 资产管理Controller
 * 
 * @author ruoyi
 * @date 2020-02-09
 */
@Controller
@RequestMapping("/wxcustomer/asset")
public class KhAssetsController extends BaseController{
    private String prefix = "wxcustomer/asset";

    @Autowired
    private IKhAssetsService khAssetsService;

    @RequiresPermissions("wxcustomer:asset:view")
    @GetMapping()
    public String asset(){
        return prefix + "/asset";
    }

    /**
     * 查询资产管理列表
     */
    @RequiresPermissions("wxcustomer:asset:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KhAssets khAssets){
        startPage();
        List<KhAssets> list = khAssetsService.selectKhAssetsList(khAssets);
        return getDataTable(list);
    }

    /**
     * 导出资产管理列表
     */
    @RequiresPermissions("wxcustomer:asset:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhAssets khAssets){
        List<KhAssets> list = khAssetsService.selectKhAssetsList(khAssets);
        ExcelUtil<KhAssets> util = new ExcelUtil<KhAssets>(KhAssets.class);
        return util.exportExcel(list, "asset");
    }

    /**
     * 新增资产管理
     */
    @GetMapping("/add")
    public String add(){
        return prefix + "/add";
    }

    /**
     * 新增保存资产管理
     */
    @RequiresPermissions("wxcustomer:asset:add")
    @Log(title = "资产管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhAssets khAssets){
        return toAjax(khAssetsService.insertKhAssets(khAssets));
    }

    /**
     * 修改资产管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap){
        KhAssets khAssets = khAssetsService.selectKhAssetsById(id);
        mmap.put("khAssets", khAssets);
        return prefix + "/edit";
    }

    /**
     * 修改保存资产管理
     */
    @RequiresPermissions("wxcustomer:asset:edit")
    @Log(title = "资产管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhAssets khAssets) {
        return toAjax(khAssetsService.updateKhAssets(khAssets));
    }

    /**
     * 删除资产管理
     */
    @RequiresPermissions("wxcustomer:asset:remove")
    @Log(title = "资产管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(khAssetsService.deleteKhAssetsByIds(ids));
    }
}
