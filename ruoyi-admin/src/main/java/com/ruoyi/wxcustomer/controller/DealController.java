package com.ruoyi.wxcustomer.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.framework.web.service.PermissionService;
import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.domain.exportvo.SendVO;
import com.ruoyi.wxcustomer.domain.vo.AfterSaleMemberVO;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IKhAfterSaleMemberService;
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
public class DealController extends BaseController {
	private String prefix = "wxcustomer/deal";

	@Autowired
	private IKhDeliverGoodsService khDeliverGoodsService;
	@Autowired
	private IWechatCustomerService wechatCustomerService;
	@Autowired
	private IKhAfterSaleMemberService khAfterSaleMemberService;
	@Autowired
	private PermissionService permissionService;
	@RequiresPermissions("deal:deal:view")
	@GetMapping()
	public String deal(Model model) {
		boolean isSHZZ= permissionService.isRole("SHZZZ")|| permissionService.isRole("admin");
		model.addAttribute("isSHZZ", isSHZZ);
		return prefix + "/dealManage";
	}

	/**
	 * 查询售后情况列表
	 */
	@RequiresPermissions("deal:deal:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DeliverGoodsVO vo) {
		startPage();
		boolean isFYRY = permissionService.isRole("FYCJZZY");
		if (isFYRY) {
			vo.setIsFYRY(ShiroUtils.getUserId().toString());
		}
		boolean isFYSH = permissionService.isRole("SHZZY");
		if ( isFYSH) {
			vo.setIsSHRY(ShiroUtils.getUserId().toString());
		}
		vo.setIsDelete("0");// 未删除
		if ("2".equals(vo.getDealType())) {// 售后成交
			AfterSaleMemberVO saleVo = new AfterSaleMemberVO();
			BeanUtils.copyProperties(vo, saleVo);
			List<AfterSaleMemberVO> list = khAfterSaleMemberService.selectList(saleVo);
			for(int i=0;i<list.size();i++) {
				if(StringUtils.isEmpty(list.get(i).getSaleName())) {
					list.get(i).setSaleName(list.get(i).getCreator());
				}
			}
			return getDataTable(list);
		} else {
			vo.setFollowResultType("3");
			List<DeliverGoodsVO> list = khDeliverGoodsService.selectList(vo);
			return getDataTable(list);
		}

	}

	/**
	 * 明细
	 */
	@GetMapping("/detail")
	public String detail(String orderNumber, Model model,String dealType) {
		if("1".equals(dealType)) {
			DeliverGoodsVO vo = khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
			model.addAttribute("vo", vo);
		}else {
			AfterSaleMemberVO vo = khAfterSaleMemberService.selectVOByOrderNumber(orderNumber);
			model.addAttribute("vo", vo);
		}
		
		return prefix + "/dealDetail";
	}

	/**
	 * 删除 
	 */
	@RequiresPermissions("deal:deal:remove")
	@Log(title = " ", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids,String dealType) {
		if("1".equals(dealType)) {
			return toAjax(khDeliverGoodsService.deleteByIds(ids));
		}else {
			return toAjax(khAfterSaleMemberService.deleteByIds(ids));
		}
		
	}

	/**
	 * 快递单
	 */
	@GetMapping("/expressBill")
	public String expressBill(String orderNumber, Model model,String dealType) {
		if("1".equals(dealType)) {
			DeliverGoodsVO vo = khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
			model.addAttribute("vo", vo);
		}else {
			AfterSaleMemberVO vo = khAfterSaleMemberService.selectVOByOrderNumber(orderNumber);
			model.addAttribute("vo", vo);
		}
		 
		return "wxcustomer/common/expressOrder";
	}

	/**
	 * 修改售后情况
	 */
	@RequiresPermissions("deal:deal:edit")
	@Log(title = "售后情况", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(KhDeliverGoods KhDeliverGoods) {
		return toAjax(khDeliverGoodsService.updateKhDeliverGoods(KhDeliverGoods));
	}

	/**
	 * 分配售后人员
	 */
	@PostMapping("/distributionSale")
	@ResponseBody
	public AjaxResult distributionSale(String orderNumber, String saleId, String saleName,String dealType,String customerid) {
		WechatCustomer wechatCustomer = new WechatCustomer();
		wechatCustomer.setSaleId(saleId);
		wechatCustomer.setSaleName(saleName);
		if(StringUtils.isNotEmpty(customerid)) {
			wechatCustomer.setCustomerId(customerid);
			return toAjax(wechatCustomerService.updateWechatCustomer(wechatCustomer));
		}
		String customerId="";
		if("1".equals(dealType)) {
			DeliverGoodsVO vo = khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
			if (null == vo) {
				return AjaxResult.error("操作失败！");
			}
			customerId=vo.getCustomerId();
		}else {
			AfterSaleMemberVO vo = khAfterSaleMemberService.selectVOByOrderNumber(orderNumber);
			if (null == vo) {
				return AjaxResult.error("操作失败！");
			}
			customerId=vo.getCustomerId();
			
		}
		wechatCustomer.setCustomerId(customerId);
		return toAjax(wechatCustomerService.updateWechatCustomer(wechatCustomer));
	}

	/**
	 * 导出售后情况列表
	 */
	@RequiresPermissions("deal:deal:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(DeliverGoodsVO vo) {
		String title="发样";
		List<SendVO> listData = new ArrayList<SendVO>();
		boolean isFYRY = permissionService.isRole("FYCJZZY");
		if (isFYRY) {
			vo.setIsFYRY(ShiroUtils.getUserId().toString());
		}
		boolean isFYSH = permissionService.isRole("SHZZY");
		if ( isFYSH) {
			vo.setIsSHRY(ShiroUtils.getUserId().toString());
		}
		vo.setIsDelete("0");// 未删除
		if ("2".equals(vo.getDealType())) {// 售后成交
			 title="售后";
			AfterSaleMemberVO saleVo = new AfterSaleMemberVO();
			BeanUtils.copyProperties(vo, saleVo);
			List<AfterSaleMemberVO> list = khAfterSaleMemberService.selectList(saleVo);
			for(int i=0;i<list.size();i++) {
				if(StringUtils.isEmpty(list.get(i).getSaleName())) {
					list.get(i).setSaleName(list.get(i).getCreator());
				}
				SendVO s=new SendVO();
				BeanUtils.copyProperties(list.get(i), s);
				if(StringUtils.isNotEmpty(list.get(i).getCourierNumber())) {
					s.setIsSend("是");
				}else {
					s.setIsSend("否");
				}
				listData.add(s);
			}
		} else {
			vo.setFollowResultType("3");
			List<DeliverGoodsVO> list = khDeliverGoodsService.selectList(vo);
			for(int i=0;i<list.size();i++) {
				SendVO s=new SendVO();
				BeanUtils.copyProperties(list.get(i), s);
				listData.add(s);
			}
		}
		
		ExcelUtil<SendVO> util = new ExcelUtil<SendVO>(SendVO.class);
		return util.exportExcel(listData, title+"成交客户信息");
	}

	/**
	 * 新增售后情况
	 */
	@GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

	/**
	 * 新增保存售后情况
	 */
	@RequiresPermissions("deal:deal:add")
	@Log(title = "售后情况", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(KhDeliverGoods KhDeliverGoods) {
		return toAjax(khDeliverGoodsService.insertKhDeliverGoods(KhDeliverGoods));
	}

	/**
	 * 修改售后情况
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		KhDeliverGoods KhDeliverGoods = khDeliverGoodsService.selectKhDeliverGoodsById(id);
		mmap.put("KhDeliverGoods", KhDeliverGoods);
		return prefix + "/edit";
	}

}
