package  com.ruoyi.wxcustomer.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import com.ruoyi.wxcustomer.service.IKhAfterSaleMemberService;

/**
 * 售后情况Controller
 * 
 * @author WBG
 * @date 2019-10-24
 */
@Controller
@RequestMapping("/wxcustomer/afterSale")
public class KhAfterSaleMemberController extends BaseController
{
    private String prefix = "wxcustomer/afterSale";

    @Autowired
    private IKhAfterSaleMemberService khAfterSaleMemberService;

    @RequiresPermissions("afterSaleMember:afterSale:view")
    @GetMapping()
    public String afterSale()
    {
        return prefix + "/afterSale";
    }

    /**
     * 查询售后情况列表
     */
    @RequiresPermissions("afterSaleMember:afterSale:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KhAfterSaleMember khAfterSaleMember)
    {
        startPage();
        List<KhAfterSaleMember> list = khAfterSaleMemberService.selectKhAfterSaleMemberList(khAfterSaleMember);
        return getDataTable(list);
    }

    /**
     * 导出售后情况列表
     */
    @RequiresPermissions("afterSaleMember:afterSale:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhAfterSaleMember khAfterSaleMember)
    {
        List<KhAfterSaleMember> list = khAfterSaleMemberService.selectKhAfterSaleMemberList(khAfterSaleMember);
        ExcelUtil<KhAfterSaleMember> util = new ExcelUtil<KhAfterSaleMember>(KhAfterSaleMember.class);
        return util.exportExcel(list, "afterSale");
    }

    /**
     * 新增售后情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存售后情况
     */
    @RequiresPermissions("afterSaleMember:afterSale:add")
    @Log(title = "售后情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhAfterSaleMember khAfterSaleMember)
    {
        return toAjax(khAfterSaleMemberService.insertKhAfterSaleMember(khAfterSaleMember));
    }

    /**
     * 修改售后情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        KhAfterSaleMember khAfterSaleMember = khAfterSaleMemberService.selectKhAfterSaleMemberById(id);
        mmap.put("khAfterSaleMember", khAfterSaleMember);
        return prefix + "/edit";
    }

    /**
     * 修改保存售后情况
     */
    @RequiresPermissions("afterSaleMember:afterSale:edit")
    @Log(title = "售后情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhAfterSaleMember khAfterSaleMember)
    {
        return toAjax(khAfterSaleMemberService.updateKhAfterSaleMember(khAfterSaleMember));
    }

    /**
     * 删除售后情况
     */
    @RequiresPermissions("afterSaleMember:afterSale:remove")
    @Log(title = "售后情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(khAfterSaleMemberService.deleteKhAfterSaleMemberByIds(ids));
    }
}
