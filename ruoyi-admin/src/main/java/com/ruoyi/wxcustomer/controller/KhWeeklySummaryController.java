package com.ruoyi.wxcustomer.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.framework.web.service.PermissionService;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.wxcustomer.domain.KhWeeklySummary;
import com.ruoyi.wxcustomer.service.IKhWeeklySummaryService;

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
    
    private String[] planFieldArray = {"callDurationPlan", "blindAddPlan", "addWechatPlan", "deliverGoodsPlan", "intentionFollowPlan", "clinchDealPlan", "totalWechatNumberPlan", "customer"};
    private String[] resFieldArray = {"hairBandsRes", "bossMassTextingRes", "giveLikeRes", "callDurationRes", "blindAddRes", "addWechatRes", "deliverGoodsRes", "intentionFollowRes", "clinchDealRes", "totalWechatNumberRes"};
    private String[] sumFieldArray = {"problem", "improvedMethod", "tomorrowPlan", "managerWorkSuggestion"};

    @Autowired
    private IKhWeeklySummaryService khWeeklySummaryService;
    
	@Autowired
	private PermissionService permissionService;

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
        
        boolean isAdmin = permissionService.isRole("admin");
		if(!isAdmin) {
			String isFyUserRoleStr = permissionService.hasAnyRoles("FYCJZZY");
			if(StringUtils.isBlank(isFyUserRoleStr)) {
				khWeeklySummary.setCreatorId(ShiroUtils.getUserId() + "");
			}
		}
        
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
    public String add(ModelMap mmap){
    	SysUser sysUser = ShiroUtils.getSysUser();
    	KhWeeklySummary week = new KhWeeklySummary();
    	week.setId(UUID.randomUUID().toString().replaceAll("-", ""));
    	week.setCreatorId(sysUser.getUserId().toString());
    	week.setCreator(sysUser.getUserName());
    	mmap.put("week", week);
    	mmap.put("isAdd", "1");
    	addFieldArray(mmap);
        return prefix + "/add";
    }
    
    public void addFieldArray(ModelMap mmap) {
    	mmap.put("planFieldArray", JSON.toJSONString(planFieldArray));
    	mmap.put("resFieldArray", JSON.toJSONString(resFieldArray));
    	mmap.put("sumFieldArray", JSON.toJSONString(sumFieldArray));
    }

    /**
     * 新增保存发样每周工作
     * @throws InvocationTargetException 
     * @throws Exception 
     */
    @RequiresPermissions("wxcustomer:weeklySummary:add")
    @Log(title = "发样每周工作", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhWeeklySummary khWeeklySummary, String weekData) throws Exception{
    	khWeeklySummary.setCreationTime(new Date());
    	handleWeekData(khWeeklySummary, weekData);
        return toAjax(khWeeklySummaryService.insertKhWeeklySummary(khWeeklySummary));
    }

    public void handleWeekData(KhWeeklySummary khWeeklySummary, String weekData) throws Exception {
    	if(StringUtils.isNotBlank(weekData)) {
    		List<HashMap<String,String>> mapDataList = JSON.parseObject(weekData, new TypeReference<List<HashMap<String,String>>>(){});
    		for (HashMap<String,String> map : mapDataList) {
    			for (Entry<String, String> me : map.entrySet()) {
    				BeanUtils.setProperty(khWeeklySummary, me.getKey(), me.getValue());
				}
			}
    	}
    }
    
    /**
     * 修改发样每周工作
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap) throws Exception{
        KhWeeklySummary khWeeklySummary = khWeeklySummaryService.selectKhWeeklySummaryById(id);
        mmap.put("week", khWeeklySummary);
        List<Map<String, String>> result = getWeekData(khWeeklySummary);
        mmap.put("isAdd", "0");
        mmap.put("weekDataStr", JSON.toJSONString(result));
        addFieldArray(mmap);
        return prefix + "/add";
    }
    
    
    
	private List<Map<String, String>> getWeekData(KhWeeklySummary khWeeklySummary)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		List<Map<String, String>> result = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
        	Map<String, String> planMap = new HashMap<>();
        	for (String key : planFieldArray) {
        		planMap.put(key + i, BeanUtils.getProperty(khWeeklySummary, key + i));
			}
        	result.add(planMap);
        	
        	Map<String, String> resMap = new HashMap<>();
			for (String key : resFieldArray) {
				resMap.put(key + i, BeanUtils.getProperty(khWeeklySummary, key + i));
			}
			result.add(resMap);
			
			for (String key : sumFieldArray) {
				Map<String, String> map = new HashMap<>();
				map.put(key + i, BeanUtils.getProperty(khWeeklySummary, key + i));
        		result.add(map);
			}
		}
		return result;
	}

    /**
     * 修改保存发样每周工作
     */
    @RequiresPermissions("wxcustomer:weeklySummary:edit")
    @Log(title = "发样每周工作", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhWeeklySummary khWeeklySummary, String weekData) throws Exception {
    	handleWeekData(khWeeklySummary, weekData);
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
