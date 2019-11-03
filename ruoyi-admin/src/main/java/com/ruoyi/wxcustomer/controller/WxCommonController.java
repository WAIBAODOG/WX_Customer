/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: CommonController.java
 * @Package com.ruoyi.wxcustomer.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2019年11月3日 上午10:04:27
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysDeptService;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.system.service.ISysUserService;

/**
* @ClassName: CommonController
* @Description: TODO(这里用一句话描述这个类的作用)
* @author HuaSheng
* @date 2019年11月3日 上午10:04:27
*
*/
@Controller
@RequestMapping("/wxcustomer/common")
public class WxCommonController extends BaseController {
	  private String prefix = "wxcustomer/common";
	  @Autowired
	    private ISysDeptService deptService;
	    @Autowired
	    private ISysUserService userService;
	    
	    @GetMapping("/user")
	    public String user(String orderNumber,String requestType,Model model)
	    {
	    	model.addAttribute("requestType", requestType);
	    	model.addAttribute("orderNumber", orderNumber);
	        return prefix + "/user";
	    }

	    @PostMapping("/list")
	    @ResponseBody
	    public TableDataInfo list(SysUser user)
	    {
	        startPage();
	        List<SysUser> list = userService.selectUserList(user);
	        return getDataTable(list);
	    }
	    /**
	     * 加载部门列表树
	     */
	    @GetMapping("/treeData")
	    @ResponseBody
	    public List<Ztree> treeData()
	    {
	        List<Ztree> ztrees = deptService.selectDeptTree(new SysDept());
	        return ztrees;
	    }
}
