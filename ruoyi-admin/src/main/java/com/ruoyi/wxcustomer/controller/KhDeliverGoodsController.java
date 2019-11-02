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
import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IKhDeliverGoodsService;

/**
 * 发样/成交情况Controller
 * 
 * @author WBG
 * @date 2019-10-24
 */
@Controller
@RequestMapping("/wxcustomer/deliverGoods")
public class KhDeliverGoodsController extends BaseController
{
    private String prefix = "wxcustomer/deliverGoods";

    @Autowired
    private IKhDeliverGoodsService khDeliverGoodsService;

    @RequiresPermissions("deliverGoods:deliverGoods:view")
    @GetMapping()
    public String deliverGoods(String requestType)
    {
    	if("1".equals(requestType)) {//发样
    		return prefix + "/hairManage";
    	}else if("2".equals(requestType)) {//成交
    		return prefix + "/dealManage";
    	}
    	return"";
        
    }

    /**
     * 查询发样/成交情况列表
     */
    @RequiresPermissions("deliverGoods:deliverGoods:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeliverGoodsVO vo)
    {
        startPage();
        List<DeliverGoodsVO> list = khDeliverGoodsService.selectList(vo);
        return getDataTable(list);
    }

    /**
     * 明细
     */
    @GetMapping("/detail")
    public String detail(String requestType,String orderNumber,Model model)
    {
    	if("1".equals(requestType)) {//发样
    		DeliverGoodsVO vo=khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
    		model.addAttribute("vo",vo);
    		return prefix + "/hairDetail";
    	}else if("2".equals(requestType)) {//成交
    		return prefix + "/dealDetail";
    	}
    	return"";
        
    }
    
    
    
    
    
    
    
    
    /**
     * 导出发样/成交情况列表
     */
    @RequiresPermissions("deliverGoods:deliverGoods:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhDeliverGoods khDeliverGoods)
    {
        List<KhDeliverGoods> list = khDeliverGoodsService.selectKhDeliverGoodsList(khDeliverGoods);
        ExcelUtil<KhDeliverGoods> util = new ExcelUtil<KhDeliverGoods>(KhDeliverGoods.class);
        return util.exportExcel(list, "deliverGoods");
    }

    /**
     * 新增发样/成交情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }
  
    /**
     * 新增保存发样/成交情况
     */
    @RequiresPermissions("deliverGoods:deliverGoods:add")
    @Log(title = "发样/成交情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhDeliverGoods khDeliverGoods)
    {
        return toAjax(khDeliverGoodsService.insertKhDeliverGoods(khDeliverGoods));
    }

    /**
     * 修改发样/成交情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        KhDeliverGoods khDeliverGoods = khDeliverGoodsService.selectKhDeliverGoodsById(id);
        mmap.put("khDeliverGoods", khDeliverGoods);
        return prefix + "/edit";
    }

    /**
     * 修改保存发样/成交情况
     */
    @RequiresPermissions("deliverGoods:deliverGoods:edit")
    @Log(title = "发样/成交情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhDeliverGoods khDeliverGoods)
    {
        return toAjax(khDeliverGoodsService.updateKhDeliverGoods(khDeliverGoods));
    }

    /**
     * 删除发样/成交情况
     */
    @RequiresPermissions("deliverGoods:deliverGoods:remove")
    @Log(title = "发样/成交情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(khDeliverGoodsService.deleteKhDeliverGoodsByIds(ids));
    }
}
