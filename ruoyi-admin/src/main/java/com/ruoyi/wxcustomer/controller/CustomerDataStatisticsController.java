/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: AchieveStatisticsController.java
 * @Package com.ruoyi.wxcustomer.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2019年11月2日 下午8:29:56
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.controller;


import java.util.Date;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.wxcustomer.domain.vo.AfterSaleMemberVO;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IKhAfterSaleMemberService;

/**
* @ClassName: CustomerDataStatisticsController
* @Description: 业绩统计--跟进顾客资料表
* @author HuaSheng
* @date 2019年11月2日 下午8:29:56
*
*/
@Controller
@RequestMapping("/wxcustomer/customerDataStatistics")
public class CustomerDataStatisticsController extends BaseController{
	 private String prefix = "wxcustomer/statistics";

	 @Autowired
	    private IKhAfterSaleMemberService khAfterSaleMemberService;
	    //用户资料
	    @RequiresPermissions("customerDataStatistics:customerData:view")
	    @GetMapping()
	    public String customerData()
	    {
	        return prefix + "/customerData";
	    }
	    /**
	     * 业绩统计列表
	     */
	    @RequiresPermissions("customerDataStatistics:customerData:list")
	    @PostMapping("/list")
	    @ResponseBody
	    public TableDataInfo list(AfterSaleMemberVO vo ){
	        startPage();
	        vo.setDealTime(new Date());
	        return getDataTable(khAfterSaleMemberService.selectList(vo));
	    }
	    
	    /**
	     * 导出
	     */
	    @RequiresPermissions("customerDataStatistics:customerData:export")
	    @PostMapping("/export")
	    @ResponseBody
	    public AjaxResult export( AfterSaleMemberVO vo)
	    {
	        List<AfterSaleMemberVO> list =khAfterSaleMemberService.selectList(vo);
	        ExcelUtil<AfterSaleMemberVO> util = new ExcelUtil<AfterSaleMemberVO>(AfterSaleMemberVO.class);
	        return util.exportExcel(list, "customerData");
	    }

}
