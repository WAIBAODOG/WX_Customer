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
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.wxcustomer.domain.KhWeeklyShSummary;
import com.ruoyi.wxcustomer.service.IKhWeeklyShSummaryService;
import com.ruoyi.wxcustomer.service.impl.RoleDataService;

/**
 * 售后每周工作Controller
 * 
 * @author ruoyi
 * @date 2019-12-01
 */
@Controller
@RequestMapping("/wxcustomer/weeklyShSummary")
public class KhWeeklyShSummaryController extends BaseController{
    private String prefix = "wxcustomer/weeklyShSummary";
    
    private String[] planFieldArray = {"hairSamplePlan", "clinchDealPlan", "trainingPlan", "promotionalActivitiesPlan", "videoProductionPlan", "customer"};
    private String[] resFieldArray = {"hairBandsRes", "bossMassTextingRes", "giveLikeRes", "hairSampleRes", "clinchDealRes", "trainingRes", "promotionalActivitiesRes", "videoProductionRes"};
    private String[] sumFieldArray = {"problem", "improvedMethod", "tomorrowPlan", "managerWorkSuggestion"};

    @Autowired
    private IKhWeeklyShSummaryService khWeeklyShSummaryService;
    
    @Autowired
   	private RoleDataService roleDataService;

    @RequiresPermissions("wxcustomer:weeklyShSummary:view")
    @GetMapping()
    public String weeklyShSummary(){
        return prefix + "/weeklyShSummary";
    }

    /**
     * 查询售后每周工作列表
     */
    @RequiresPermissions("wxcustomer:weeklyShSummary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KhWeeklyShSummary khWeeklyShSummary){
        startPage();
        khWeeklyShSummary.setDataRightUserIds(roleDataService.getRoleData());
        List<KhWeeklyShSummary> list = khWeeklyShSummaryService.selectKhWeeklyShSummaryList(khWeeklyShSummary);
        return getDataTable(list);
    }

    /**
     * 导出售后每周工作列表
     */
    @RequiresPermissions("wxcustomer:weeklyShSummary:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhWeeklyShSummary khWeeklyShSummary){
    	khWeeklyShSummary.setDataRightUserIds(roleDataService.getRoleData());
        List<KhWeeklyShSummary> list = khWeeklyShSummaryService.selectKhWeeklyShSummaryList(khWeeklyShSummary);
        ExcelUtil<KhWeeklyShSummary> util = new ExcelUtil<KhWeeklyShSummary>(KhWeeklyShSummary.class);
        return util.exportExcel(list, "weeklyShSummary");
    }

    /**
     * 新增售后每周工作
     */
    @GetMapping("/add")
    public String add(ModelMap mmap){
    	SysUser sysUser = ShiroUtils.getSysUser();
    	KhWeeklyShSummary week = new KhWeeklyShSummary();
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
     * 新增保存售后每周工作
     * @throws InvocationTargetException 
     * @throws Exception 
     */
    @RequiresPermissions("wxcustomer:weeklyShSummary:add")
    @Log(title = "售后每周工作", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhWeeklyShSummary khWeeklyShSummary, String weekData) throws Exception{
    	khWeeklyShSummary.setCreationTime(new Date());
    	handleWeekData(khWeeklyShSummary, weekData);
        return toAjax(khWeeklyShSummaryService.insertKhWeeklyShSummary(khWeeklyShSummary));
    }

    public void handleWeekData(KhWeeklyShSummary khWeeklyShSummary, String weekData) throws Exception {
    	if(StringUtils.isNotBlank(weekData)) {
    		List<HashMap<String,String>> mapDataList = JSON.parseObject(weekData, new TypeReference<List<HashMap<String,String>>>(){});
    		for (HashMap<String,String> map : mapDataList) {
    			for (Entry<String, String> me : map.entrySet()) {
    				BeanUtils.setProperty(khWeeklyShSummary, me.getKey(), me.getValue());
				}
			}
    	}
    }
    
    /**
     * 修改售后每周工作
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap) throws Exception{
    	KhWeeklyShSummary khWeeklyShSummary = khWeeklyShSummaryService.selectKhWeeklyShSummaryById(id);
        mmap.put("week", khWeeklyShSummary);
        List<Map<String, String>> result = getWeekData(khWeeklyShSummary);
        mmap.put("isAdd", "0");
        mmap.put("weekDataStr", JSON.toJSONString(result));
        addFieldArray(mmap);
        return prefix + "/add";
    }
    
    
    
	private List<Map<String, String>> getWeekData(KhWeeklyShSummary khWeeklyShSummary)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		List<Map<String, String>> result = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
        	Map<String, String> planMap = new HashMap<>();
        	for (String key : planFieldArray) {
        		planMap.put(key + i, BeanUtils.getProperty(khWeeklyShSummary, key + i));
			}
        	result.add(planMap);
        	
        	Map<String, String> resMap = new HashMap<>();
			for (String key : resFieldArray) {
				resMap.put(key + i, BeanUtils.getProperty(khWeeklyShSummary, key + i));
			}
			result.add(resMap);
			
			for (String key : sumFieldArray) {
				Map<String, String> map = new HashMap<>();
				map.put(key + i, BeanUtils.getProperty(khWeeklyShSummary, key + i));
        		result.add(map);
			}
		}
		return result;
	}

    /**
     * 修改保存售后每周工作
     */
    @RequiresPermissions("wxcustomer:weeklyShSummary:edit")
    @Log(title = "售后每周工作", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhWeeklyShSummary khWeeklyShSummary, String weekData) throws Exception {
    	handleWeekData(khWeeklyShSummary, weekData);
        return toAjax(khWeeklyShSummaryService.updateKhWeeklyShSummary(khWeeklyShSummary));
    }

    /**
     * 删除售后每周工作
     */
    @RequiresPermissions("wxcustomer:weeklyShSummary:remove")
    @Log(title = "售后每周工作", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(khWeeklyShSummaryService.deleteKhWeeklyShSummaryByIds(ids));
    }
}
