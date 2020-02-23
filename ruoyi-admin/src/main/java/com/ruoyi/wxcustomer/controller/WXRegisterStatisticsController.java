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

import org.apache.commons.lang3.StringUtils;
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
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IKhDeliverGoodsService;
import com.ruoyi.wxcustomer.service.impl.RoleDataService;

/**
 * @ClassName: WXRegisterStatisticsController
 * @Description: 业绩统计--每日微信跟进登记表
 * @author HuaSheng
 * @date 2019年11月2日 下午8:29:56
 *
 */
@Controller
@RequestMapping("/wxcustomer/wxRegisterStatistics")
public class WXRegisterStatisticsController extends BaseController {
	private String prefix = "wxcustomer/statistics";
	@Autowired
	private IKhDeliverGoodsService khDeliverGoodsService;
    @Autowired
   	private RoleDataService roleDataService;

	// 每天微信登记
	@RequiresPermissions("wxRegisterStatistics:wxRegister:view")
	@GetMapping()
	public String wxRegister() {
		return prefix + "/wxRegister";
	}

	/**
	 * 业绩统计列表
	 */
	@RequiresPermissions("wxRegisterStatistics:wxRegister:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DeliverGoodsVO vo) {
		startPage();
		vo.setIsDelete("0");
		vo.setDataRightUserIds(roleDataService.getRoleData());
		if (StringUtils.isEmpty(vo.getDealTimeStart()) && StringUtils.isEmpty(vo.getDealTimeEnd())) {
			vo.setDealTime(new Date());
		}
		return getDataTable(khDeliverGoodsService.selectList(vo));
	}

	/**
	 * 导出
	 */
	@RequiresPermissions("wxRegisterStatistics:wxRegister:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(DeliverGoodsVO vo) {
		vo.setIsDelete("0");
		vo.setDataRightUserIds(roleDataService.getRoleData());
		if (StringUtils.isEmpty(vo.getDealTimeStart()) && StringUtils.isEmpty(vo.getDealTimeEnd())) {
			vo.setDealTime(new Date());
		}
		List<DeliverGoodsVO> list = khDeliverGoodsService.selectList(vo);
		ExcelUtil<DeliverGoodsVO> util = new ExcelUtil<DeliverGoodsVO>(DeliverGoodsVO.class);
		return util.exportExcel(list, "每日微信跟进登记表");
	}
}
