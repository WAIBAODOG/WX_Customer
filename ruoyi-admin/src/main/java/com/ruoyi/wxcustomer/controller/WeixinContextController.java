package com.ruoyi.wxcustomer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
import com.ruoyi.system.service.ISysUserService;
import com.ruoyi.wxcustomer.domain.KhFile;
import com.ruoyi.wxcustomer.domain.WeixinContext;
import com.ruoyi.wxcustomer.domain.common.FileInfo;
import com.ruoyi.wxcustomer.domain.common.PicData;
import com.ruoyi.wxcustomer.service.IKhFileService;
import com.ruoyi.wxcustomer.service.IWeixinContextService;

import sun.misc.BASE64Decoder;

/**
 * 微信朋友圈内容Controller
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/wxcustomer/weixincontext")
public class WeixinContextController extends BaseController{
    private String prefix = "wxcustomer/weixincontext";
    @Value("${fileHost}")
    private String fileHost;
    
    @Autowired
    private IWeixinContextService weixinContextService;
    @Autowired
    private IKhFileService fileService;
    @Autowired
    private ISysUserService userService;
    @RequiresPermissions("wxcustomer:weixincontext:view")
    @GetMapping()
    public String weixincontext(){
        return prefix + "/weixincontext";
    }

    /**
     * 查询微信朋友圈内容列表
     */
    @RequiresPermissions("wxcustomer:weixincontext:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WeixinContext weixinContext){
        startPage();
        List<WeixinContext> list = weixinContextService.selectWeixinContextList(weixinContext);
        return getDataTable(list);
    }

    /**
     * 导出微信朋友圈内容列表
     */
    @RequiresPermissions("wxcustomer:weixincontext:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WeixinContext weixinContext){
        List<WeixinContext> list = weixinContextService.selectWeixinContextList(weixinContext);
        ExcelUtil<WeixinContext> util = new ExcelUtil<WeixinContext>(WeixinContext.class);
        return util.exportExcel(list, "weixincontext");
    }

    /**
     * 新增微信朋友圈内容
     */
    @GetMapping("/add")
    public String add(Model model){
    	SysUser sysUser = ShiroUtils.getSysUser();
    	model.addAttribute("user", sysUser);
        return prefix + "/add";
    }

    /**
     * 新增保存微信朋友圈内容
     */
    @RequiresPermissions("wxcustomer:weixincontext:add")
    @Log(title = "微信朋友圈内容", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HttpServletRequest request){
    	String picData=request.getParameter("picData");
    	String weixinContext=request.getParameter("weixinContext");
    	List<PicData> dataList = JSON.parseArray(picData, PicData.class);
    	WeixinContext wic = JSON.parseObject(weixinContext, WeixinContext.class);
    	List<FileInfo> fileList=new ArrayList<FileInfo>();
    	try {
    		for(int i=0;i<dataList.size();i++) {
        		FileInfo e=new FileInfo();
        		String fileName=dataList.get(i).getName();
        		String prefix = fileName.substring(fileName.lastIndexOf(".") + 1);
        		e.setExtName(prefix);
        		e.setFileName(fileName);
        		BASE64Decoder decoder = new BASE64Decoder();
        	    byte[] bytes = decoder.decodeBuffer(dataList.get(i).getData());
        		e.setBytes(bytes);
        		fileList.add(e);
        	}
		} catch (Exception e) {
			
		}
        return toAjax(weixinContextService.addContext(fileList, wic));
    }

    /**
     * 修改微信朋友圈内容
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap){
        WeixinContext weixinContext = weixinContextService.selectWeixinContextById(id);
        KhFile khFile=new KhFile();
        khFile.setBusinessId(id);
        khFile.setBusinessYype("WXC");
       List<KhFile> fileList= fileService.selectKhFileList(khFile);
       for(int i=0;i<fileList.size();i++) {
    	   String filePath= fileList.get(i).getFilePath().replace(",", "/");
    	   fileList.get(i).setFilePath(fileHost+filePath);
    	   if(StringUtils.isNotEmpty(fileList.get(i).getCreatorId())) {
    		   SysUser user= userService.selectUserById(Long.valueOf(fileList.get(i).getCreatorId()));
    		   if(null!=user)
    		   fileList.get(i).setCreatorId(user.getUserName());
    	   }
    	  
       }
        mmap.put("weixinContext", weixinContext);
        mmap.put("fileList", fileList);
        return prefix + "/edit";
    }

    /**
     * 修改保存微信朋友圈内容
     */
    @RequiresPermissions("wxcustomer:weixincontext:edit")
    @Log(title = "微信朋友圈内容", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WeixinContext weixinContext) {
        return toAjax(weixinContextService.updateWeixinContext(weixinContext));
    }

    /**
     * 删除微信朋友圈内容
     */
    @RequiresPermissions("wxcustomer:weixincontext:remove")
    @Log(title = "微信朋友圈内容", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(weixinContextService.deleteWeixinContextByIds(ids));
    }
    
}
