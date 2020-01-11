/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: NoticeController.java
 * @Package com.ruoyi.wxcustomer.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2019年12月11日 上午10:27:34
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;
import com.ruoyi.wxcustomer.service.IAmapService;
import com.ruoyi.wxcustomer.service.IKhShopInFoService;
import com.ruoyi.wxcustomer.service.IMeituanService;

/**
* @ClassName: ShopInfoController
* @Description: 通知
* @author HuaSheng
* @date 2019年12月11日 上午10:27:34
*
*/
@Controller
@RequestMapping("/wxcustomer/shopInfo")
public class ShopInfoController extends BaseController{
	private String prefix = "wxcustomer/shopInfo";
	@Autowired
	private IMeituanService meituanService;
	@Autowired
	private IAmapService amapService;
	@Autowired
	private IKhShopInFoService khShopInFoService;
	@RequiresPermissions("shopInfo:shopInfo:view")
	@GetMapping()
	public String WechatCustomer() {
		return prefix + "/manage";
	}
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(KhShopInFo inFo) {
		startPage();
		return getDataTable(khShopInFoService.selectList(inFo));
	}
	@PostMapping("/search")
	@ResponseBody
	public Map<String, Object> search(SearchCondition condition) {
		Map<String, Object> map=new HashMap<String, Object>();
		List<KhShopInFo> list= new ArrayList<KhShopInFo>();
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String batchCode=format.format(new Date());
		if (condition == null) {
			map.put("data", list);
			map.put("batchCode", batchCode);
			return map;
		}
		SysUser sysUser = ShiroUtils.getSysUser();
		
		condition.setBatchCode(batchCode);
		condition.setOperatorId(String.valueOf(sysUser.getUserId()));
		condition.setOperatorName(sysUser.getUserName());
		try {
			switch (condition.getOs()) {
			case "MT":  list=meituanService.search(condition);break;
			case "AMAP":  list=amapService.search(condition);break;
			default:  list=meituanService.search(condition);break;
			}
			 
		} catch (Exception e) {
		 
		}
		map.put("data", list);
		map.put("batchCode", batchCode);
		return map;
	}
	@RequestMapping("/export")
	@ResponseBody
	public AjaxResult export(KhShopInFo inFo) {
		List<KhShopInFo>  list=khShopInFoService.selectList(inFo);
		ExcelUtil<KhShopInFo> util = new ExcelUtil<KhShopInFo>(KhShopInFo.class);
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String version=format.format(new Date());
		return util.exportExcel(list, "店家数据-v-"+version);
	}
}
