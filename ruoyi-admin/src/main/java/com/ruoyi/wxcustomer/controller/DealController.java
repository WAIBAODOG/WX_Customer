package  com.ruoyi.wxcustomer.controller;

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
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IKhDeliverGoodsService;
import com.ruoyi.wxcustomer.service.IWechatCustomerService;

/**
 * 成交客户管理Controller
 * 
 * @author WBG
 * @date 2019-10-24
 */
@Controller
@RequestMapping("/wxcustomer/deal")
public class DealController extends BaseController
{
    private String prefix = "wxcustomer/deal";

    @Autowired
    private IKhDeliverGoodsService khDeliverGoodsService;
    @Autowired
    private IWechatCustomerService wechatCustomerService;

    @RequiresPermissions("deal:deal:view")
    @GetMapping()
    public String afterSale()
    {
    	return prefix + "/dealManage";
    }

    /**
     * 查询售后情况列表
     */
    @RequiresPermissions("deal:deal:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeliverGoodsVO vo)
    {
        startPage();
        vo.setIsDelete("0");//未删除
        //vo.setIsSales("1");//成交
        vo.setFollowResultType("3");
        List<DeliverGoodsVO> list = khDeliverGoodsService.selectList(vo);
        return getDataTable(list);
    }
    
    /**
     * 明细
     */
    @GetMapping("/detail")
    public String detail(String orderNumber,Model model)
    {
    	DeliverGoodsVO vo=khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
    	model.addAttribute("vo",vo);
    	return prefix + "/dealDetail";
    }
    
    

    /**
     * 删除售后情况
     */
    @RequiresPermissions("deal:deal:remove")
    @Log(title = "售后情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(khDeliverGoodsService.deleteByIds(ids));
    }
    /**
     * 快递单
     */
    @GetMapping( "/expressBill")
    public String expressBill(String orderNumber,Model model)
    {
    	DeliverGoodsVO vo=khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
    	model.addAttribute("vo",vo);
    	return  "wxcustomer/common/expressOrder";
    }
    /**
     * 修改售后情况
     */
    @RequiresPermissions("deal:deal:edit")
    @Log(title = "售后情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KhDeliverGoods KhDeliverGoods)
    {
        return toAjax(khDeliverGoodsService.updateKhDeliverGoods(KhDeliverGoods));
    }
    /**
     * 分配售后人员
    */
    @PostMapping("/distributionSale")
    @ResponseBody
    public AjaxResult distributionSale(String orderNumber,String saleId,String saleName)
    {
    	DeliverGoodsVO vo=khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
    	if(null==vo) {
    		return  AjaxResult.error("操作失败！");
    	}
    	WechatCustomer wechatCustomer=new WechatCustomer();
    	wechatCustomer.setCustomerId(vo.getCustomerId());
    	wechatCustomer.setSaleId(saleId);
    	wechatCustomer.setSaleName(saleName);
    	return toAjax(wechatCustomerService.updateWechatCustomer(wechatCustomer));
    }
    
    
    
    
    
    
    
    
    
    
    
    /**
     * 导出售后情况列表
     */
    @RequiresPermissions("deal:deal:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KhDeliverGoods KhDeliverGoods)
    {
        List<KhDeliverGoods> list = khDeliverGoodsService.selectKhDeliverGoodsList(KhDeliverGoods);
        ExcelUtil<KhDeliverGoods> util = new ExcelUtil<KhDeliverGoods>(KhDeliverGoods.class);
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
    @RequiresPermissions("deal:deal:add")
    @Log(title = "售后情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KhDeliverGoods KhDeliverGoods)
    {
        return toAjax(khDeliverGoodsService.insertKhDeliverGoods(KhDeliverGoods));
    }

    /**
     * 修改售后情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        KhDeliverGoods KhDeliverGoods = khDeliverGoodsService.selectKhDeliverGoodsById(id);
        mmap.put("KhDeliverGoods", KhDeliverGoods);
        return prefix + "/edit";
    }

    
}
