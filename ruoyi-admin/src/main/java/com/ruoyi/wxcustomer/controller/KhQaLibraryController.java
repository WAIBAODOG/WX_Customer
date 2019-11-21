package com.ruoyi.wxcustomer.controller;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
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
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.wxcustomer.domain.KhQaLibrary;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IKhQaLibraryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.framework.web.service.PermissionService;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 问答库Controller
 * 
 * @author ruoyi
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/wxcustomer/qalibrary")
public class KhQaLibraryController extends BaseController{
    private String prefix = "wxcustomer/qalibrary";

    @Autowired
    private IKhQaLibraryService khQaLibraryService;
    
	@Autowired
	private PermissionService permissionService;

    @RequiresPermissions("wxcustomer:qalibrary:view")
    @GetMapping()
    public String qalibrary(){
        return prefix + "/qalibrary";
    }

    /**
     * 查询问答库列表
     */
    @RequiresPermissions("wxcustomer:qalibrary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KhQaLibrary khQaLibrary){
        startPage();
        List<KhQaLibrary> list = khQaLibraryService.selectKhQaLibraryList(khQaLibrary);
        return getDataTable(list);
    }

    /**
     * 导出问答库列表
     */
    @RequiresPermissions("wxcustomer:qalibrary:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhQaLibrary khQaLibrary){
        List<KhQaLibrary> list = khQaLibraryService.selectKhQaLibraryList(khQaLibrary);
        ExcelUtil<KhQaLibrary> util = new ExcelUtil<KhQaLibrary>(KhQaLibrary.class);
        return util.exportExcel(list, "qalibrary");
    }

    /**
     * 新增问答库
     */
    @GetMapping("/add")
    public String add(){
        return prefix + "/add";
    }

    /**
     * 新增保存问答库
     */
    @RequiresPermissions("wxcustomer:qalibrary:add")
    @Log(title = "问答库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhQaLibrary khQaLibrary){
    	SysUser sysUser = ShiroUtils.getSysUser();
		khQaLibrary.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		khQaLibrary.setCreatorId(sysUser.getUserId().toString());
		khQaLibrary.setCreator(sysUser.getUserName());
        return toAjax(khQaLibraryService.insertKhQaLibrary(khQaLibrary));
    }

    /**
     * 修改问答库
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap){
        KhQaLibrary khQaLibrary = khQaLibraryService.selectKhQaLibraryById(id);
        mmap.put("khQaLibrary", khQaLibrary);
        return prefix + "/edit";
    }

    /**
     * 修改保存问答库
     */
    @RequiresPermissions("wxcustomer:qalibrary:edit")
    @Log(title = "问答库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhQaLibrary khQaLibrary) {
        return toAjax(khQaLibraryService.updateKhQaLibrary(khQaLibrary));
    }

    /**
     * 删除问答库
     */
    @RequiresPermissions("wxcustomer:qalibrary:remove")
    @Log(title = "问答库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(khQaLibraryService.deleteKhQaLibraryByIds(ids));
    }
    
    
	/**
	 * 明细
	 */
	@GetMapping("/detail")
	public String detail(String id, Model model) {
		KhQaLibrary vo = khQaLibraryService.selectKhQaLibraryById(id);
		model.addAttribute("vo", vo);
		return prefix + "/detail";

	}
}
