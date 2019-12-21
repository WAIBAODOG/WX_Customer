package com.ruoyi.wxcustomer.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
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
import com.ruoyi.wxcustomer.domain.exportvo.SendVO;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.service.IKhDeliverGoodsService;

/**
 * 发样情况Controller
 * 
 * @author WBG
 * @date 2019-10-24
 */
@Controller
@RequestMapping("/wxcustomer/deliverGoods")
public class KhDeliverGoodsController extends BaseController {
	private String prefix = "wxcustomer/deliverGoods";

	@Autowired
	private IKhDeliverGoodsService khDeliverGoodsService;
	@Autowired
	private PermissionService permissionService;

	@RequiresPermissions("deliverGoods:deliverGoods:view")
	@GetMapping()
	public String deliverGoods() {
		return prefix + "/hairManage";

	}

	/**
	 * 查询发样情况列表
	 */
	@RequiresPermissions("deliverGoods:deliverGoods:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DeliverGoodsVO vo) {
		boolean isFYRY = permissionService.isRole("FYCJZZY");
		if (isFYRY) {
			vo.setIsFYRY(ShiroUtils.getUserId().toString());
		}
		boolean isFYSH = permissionService.isRole("SHZZY");
		if (isFYSH) {
			vo.setIsSHRY(ShiroUtils.getUserId().toString());
		}
		vo.setIsDelete("0");// 未删除
		vo.setFollowResultType("2");// 发样
		startPage();
		List<DeliverGoodsVO> list = khDeliverGoodsService.selectList(vo);
		return getDataTable(list);
	}

	/**
	 * 明细
	 */
	@GetMapping("/detail")
	public String detail(String orderNumber, Model model) {
		DeliverGoodsVO vo = khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
		if(vo.getDurationHour()==null) {
			vo.setDurationHour(0L);
		}
		if(vo.getDurationMinute()==null) {
			vo.setDurationMinute(0L);
		}
		if(vo.getDurationSecond()==null) {
			vo.setDurationSecond(0L);
		}
		model.addAttribute("vo", vo);
		return prefix + "/hairDetail";

	}

	/**
	 * 删除发样情况
	 */
	@RequiresPermissions("deliverGoods:deliverGoods:remove")
	@Log(title = " 删除发样情况", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(khDeliverGoodsService.deleteByIds(ids));
	}

	/**
	 * 快递单
	 */
	@GetMapping("/expressBill")
	public String expressBill(String orderNumber, Model model) {
		DeliverGoodsVO vo = khDeliverGoodsService.selectVOByOrderNumber(orderNumber);
		model.addAttribute("vo", vo);
		return "wxcustomer/common/expressOrder";
	}

	/**
	 * 修改保存发样情况
	 */
	@RequiresPermissions("deliverGoods:deliverGoods:edit")
	@Log(title = "发样情况", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(KhDeliverGoods khDeliverGoods) {
		return toAjax(khDeliverGoodsService.updateKhDeliverGoods(khDeliverGoods));
	}

	/**
	 * 导出发样情况列表
	 */
	@RequiresPermissions("deliverGoods:deliverGoods:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(DeliverGoodsVO vo) {
		List<SendVO> listData = new ArrayList<SendVO>();
		boolean isFYRY = permissionService.isRole("FYCJZZY");
		if (isFYRY) {
			vo.setIsFYRY(ShiroUtils.getUserId().toString());
		}
		boolean isFYSH = permissionService.isRole("SHZZY");
		if (isFYSH) {
			vo.setIsSHRY(ShiroUtils.getUserId().toString());
		}
		vo.setIsDelete("0");// 未删除
		vo.setFollowResultType("2");// 发样
		List<DeliverGoodsVO> list = khDeliverGoodsService.selectList(vo);
		for(int i=0;i<list.size();i++) {
			SendVO s=new SendVO();
			BeanUtils.copyProperties(list.get(i), s);
			if(StringUtils.isNotEmpty(list.get(i).getCourierNumber())) {
				s.setIsSend("是");
			}else {
				s.setIsSend("否");
			}
			listData.add(s);
		}
		ExcelUtil<SendVO> util = new ExcelUtil<SendVO>(SendVO.class);
		return util.exportExcel(listData, "发样客户信息");
	}
	/**
	 *快速导入发货
	 */
	@SuppressWarnings("resource")
	@RequiresPermissions("deliverGoods:deliverGoods:import")
	@PostMapping("/importExcel")
	@ResponseBody
	public String importExcel(@RequestParam("file") MultipartFile file, HttpServletResponse response)
			throws IOException, Exception {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		JSONObject result = new JSONObject();
		try {
			List<KhDeliverGoods> detailList = new ArrayList<KhDeliverGoods>();
			Workbook workbook = null;
			try {
				workbook = new HSSFWorkbook(file.getInputStream());
			} catch (Exception e) {
				workbook = new XSSFWorkbook(file.getInputStream());// 获得工作簿
			}

			Sheet sheet = workbook.getSheetAt(0); // 获得工作表
			int rows = sheet.getPhysicalNumberOfRows();
			Set<String> set=new HashSet<String>();
			for (int i = 2; i < rows; i++) {
				Row sheetRow = sheet.getRow(i); // 获取第i行数据
				Cell orderNum = sheetRow.getCell(0); //订单号
				Cell courierNumber = sheetRow.getCell(1); //快递订单号
				Cell logisticsCompany = sheetRow.getCell(2); //物流公司
				DeliverGoodsVO vo=khDeliverGoodsService.selectVOByOrderNumber(orderNum.toString());
				if(null!=vo) {
					KhDeliverGoods dg=new KhDeliverGoods();
					BeanUtils.copyProperties(vo, dg);
					dg.setCourierNumber(courierNumber.toString());
					dg.setLogisticsCompany(logisticsCompany.toString());
					detailList.add(dg);
				}else {
					set.add(orderNum.toString());
				}
			}
			khDeliverGoodsService.updateKhDeliverGoodList(detailList);
			if(set.size()>0) {
				result.put("msg", "操作成功!其中订单号"+set.toString()+"没有找到!");
			}else {
				result.put("msg", "操作成功!");
			}
			result.put("state", "true");
		} catch (Exception e) {
			result.put("state", "false");
			result.put("msg", "操作失败");

		}
		return result.toString();
	}


	/**
	 * 新增发样情况
	 */
	@GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

	/**
	 * 新增保存发样情况
	 */
	@RequiresPermissions("deliverGoods:deliverGoods:add")
	@Log(title = "发样情况", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(KhDeliverGoods khDeliverGoods) {
		return toAjax(khDeliverGoodsService.insertKhDeliverGoods(khDeliverGoods));
	}

	/**
	 * 修改发样情况
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		KhDeliverGoods khDeliverGoods = khDeliverGoodsService.selectKhDeliverGoodsById(id);
		mmap.put("khDeliverGoods", khDeliverGoods);
		return prefix + "/edit";
	}

}
