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

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;
import com.ruoyi.wxcustomer.service.IKhShopInFoService;
import com.ruoyi.wxcustomer.service.ISearchInFoService;

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
	private ISearchInFoService searchInFoService;
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
	public List<KhShopInFo> search(SearchCondition condition) {
		return  searchInFoService.search(condition);
	}
}
