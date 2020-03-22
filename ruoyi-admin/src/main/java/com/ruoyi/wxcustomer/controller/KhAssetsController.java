package com.ruoyi.wxcustomer.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
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
import com.ruoyi.wxcustomer.domain.KhAssets;
import com.ruoyi.wxcustomer.domain.KhAssetsDetail;
import com.ruoyi.wxcustomer.service.IKhAssetsService;
import com.ruoyi.wxcustomer.service.impl.RoleDataService;

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
    @Autowired
    private RoleDataService roleDataService;

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
        SysUser sysUser = ShiroUtils.getSysUser();
        khAssets.setUserId(sysUser.getUserId()+"");
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
    	 SysUser sysUser = ShiroUtils.getSysUser();
    	 khAssets.setDataRightUserIds(roleDataService.getRoleData());
         khAssets.setUserId(sysUser.getUserId()+"");
        List<KhAssets> list = khAssetsService.selectKhAssetsList(khAssets);
        ExcelUtil<KhAssets> util = new ExcelUtil<KhAssets>(KhAssets.class);
        return util.exportExcel(list, "asset");
    }

    /**
     * 新增资产管理
     */
    @GetMapping("/add")
    public String add(Model model) {
    	KhAssets asset=new KhAssets();
		SysUser sysUser = ShiroUtils.getSysUser();
		asset.setUserId(String.valueOf(sysUser.getUserId()));
		asset.setUserName(sysUser.getUserName());
		model.addAttribute("vo", asset);
		model.addAttribute("flag", "1");
		model.addAttribute("isAdd", "1");
        return prefix + "/add";
    }
    /**
	 * 新增明细项
	 */
	@RequiresPermissions("wxcustomer:asset:AddDetail")
	@GetMapping("/addDetail")
	public String addDetail(Model model, String id, String isView) {
		model.addAttribute("id", id);
		model.addAttribute("isView", isView);
		return prefix + "/addDetail";
	}
    /**
     * 新增保存资产管理
     */
    @RequiresPermissions("wxcustomer:asset:add")
    @Log(title = "资产管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhAssets khAssets,String detailInfo){
    	List<KhAssetsDetail> detailList = StringUtils.isBlank(detailInfo) ? null : JSON.parseArray(detailInfo, KhAssetsDetail.class);
    	khAssets.setDetailList(detailList);
    	return toAjax(khAssetsService.insertKhAssets(khAssets));
    }

    /**
     * 修改资产管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap){
        KhAssets khAssets = khAssetsService.selectKhAssetsById(id);
        mmap.put("vo", khAssets);
        List<KhAssetsDetail> detailList = khAssets.getDetailList();
		mmap.put("detailList", JSON.toJSONString(detailList == null? null : detailList));
		mmap.addAttribute("isAdd", "0");
		mmap.addAttribute("flag", "1");
        return prefix + "/add";
    }
    /**
     * 查看资产管理
     */
    @GetMapping("/show/{id}")
    public String show(@PathVariable("id") String id, ModelMap mmap){
        KhAssets khAssets = khAssetsService.selectKhAssetsById(id);
        mmap.put("vo", khAssets);
        List<KhAssetsDetail> detailList = khAssets.getDetailList();
		mmap.put("detailList", JSON.toJSONString(detailList == null? null : detailList));
		mmap.addAttribute("flag", "0");
        return prefix + "/add";
    }
    /**
     * 修改保存资产管理
     */
    @RequiresPermissions("wxcustomer:asset:edit")
    @Log(title = "资产管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhAssets khAssets,String detailInfo){
    	List<KhAssetsDetail> detailList = StringUtils.isBlank(detailInfo) ? null : JSON.parseArray(detailInfo, KhAssetsDetail.class);
    	khAssets.setDetailList(detailList);
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
