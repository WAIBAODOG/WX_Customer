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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysDeptService;
import com.ruoyi.system.service.ISysUserService;
import com.ruoyi.wxcustomer.domain.KhFile;
import com.ruoyi.wxcustomer.domain.common.FileInfo;
import com.ruoyi.wxcustomer.service.IFileService;
import com.ruoyi.wxcustomer.service.IKhFileService;

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
	@Autowired
	private IFileService fileService;
	@Autowired
	private IKhFileService khFileService;

	@GetMapping("/user")
	public String user(String orderNumber, String requestType, String dealType, String customerId, Model model) {
		model.addAttribute("requestType", requestType);
		model.addAttribute("orderNumber", orderNumber);
		model.addAttribute("dealType", dealType);
		model.addAttribute("customerId", customerId);
		return prefix + "/user";
	}

	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(SysUser user, String requestType) {
		startPage();
		if ("afterSale".equals(requestType)) {
			user.setDeptId(102L);
		}
		List<SysUser> list = userService.selectUserList(user);
		return getDataTable(list);
	}

	/**
	 * 加载部门列表树
	 */
	@GetMapping("/treeData")
	@ResponseBody
	public List<Ztree> treeData(String requestType) {
		SysDept dept = new SysDept();
		if ("afterSale".equals(requestType)) {
			dept.setDeptName("售后");
		}
		List<Ztree> ztrees = deptService.selectDeptTree(dept);
		return ztrees;
	}

	@RequestMapping(value = "fileUpload", method = RequestMethod.POST)
	public Map<String,Object> fileUpload(@RequestParam("file") MultipartFile[] file, String businessType, String businessId,
			HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		Map<String,Object> map=new HashMap<>();
		if(StringUtils.isEmpty(businessId)||StringUtils.isEmpty(businessType)) {
			map.put("status", false);
			map.put("msg", "业务ID或类型为空！");
			return map;
		}
		try {
			String filePath=fileUpload(file[0].getOriginalFilename(), file[1].getBytes());
			if(StringUtils.isEmpty(filePath)) {
				map.put("status", false);
				map.put("msg", "文件上传失败！");
				return map;
			}
			map.put("status", true);
			map.put("msg", "文件上传成功！");
			return map;
		} catch (Exception e) {
		   
		}
		return map;
	}
	/**
	 * 文件上传
	 */
	public String fileUpload(String fileName, byte[] fileBype) {
		FileInfo fileInfo = new FileInfo();
		fileInfo.setExtName(getExtName(fileName));
		fileInfo.setFileName(fileName);
		fileInfo.setBytes(fileBype);
		try {
			String filePath = fileService.upload(fileInfo);
			return filePath;
		} catch (Exception e) {
			return null;
		}

	}

	public String getExtName(String fileName) {
		String prefix = fileName.substring(fileName.lastIndexOf(".") + 1);
		return prefix;
	}
	/**
	 * 加载部门列表树
	 */
	@PostMapping("/delFile")
	@ResponseBody
	public AjaxResult delFile(String fileId) {
		if(StringUtils.isEmpty(fileId)) {
			return AjaxResult.error("附件ID为空！");
		}
		KhFile file=khFileService.selectKhFileById(fileId);
		if(null==file) {
			return AjaxResult.error("找不到附件");
		}
		try {
			khFileService.deleteKhFileById(fileId);
			fileService.delete(file.getFilePath());
		} catch (Exception e) {
			return AjaxResult.error(e.getMessage());
		}
		return AjaxResult.success();
	}

}
