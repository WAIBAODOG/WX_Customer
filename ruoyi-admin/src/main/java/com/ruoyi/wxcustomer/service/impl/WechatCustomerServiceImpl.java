package com.ruoyi.wxcustomer.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.mapper.KhAfterSaleMemberMapper;
import com.ruoyi.wxcustomer.mapper.KhDeliverGoodsMapper;
import com.ruoyi.wxcustomer.mapper.WechatCustomerMapper;
import com.ruoyi.wxcustomer.service.IWechatCustomerService;

/**
 * 微信客户Service业务层处理
 * 
 * @author yzh
 * @date 2019-10-23
 */
@Service
public class WechatCustomerServiceImpl implements IWechatCustomerService {
	
	private static Map<String, String> orderTypeMap = new HashMap<>();
	
	static {
		orderTypeMap.put("1", "GT");
		orderTypeMap.put("2", "FY");
		orderTypeMap.put("3", "CJ");
		orderTypeMap.put("4", "SH");
	}

	@Autowired
	private WechatCustomerMapper wechatCustomerMapper;

	@Autowired
	private KhAfterSaleMemberMapper khAfterSaleMemberMapper;
	
	@Autowired
	private KhDeliverGoodsMapper khDeliverGoodsMapper;
	
	/**
	 * 查询微信客户
	 * 
	 * @param customerId 微信客户ID
	 * @return 微信客户
	 */
	@Override
	public WechatCustomer selectWechatCustomerById(String customerId) {
		return wechatCustomerMapper.selectWechatCustomerById(customerId);
	}

	/**
	 * 查询微信客户列表
	 * 
	 * @param wechatCustomer 微信客户
	 * @return 微信客户
	 */
	@Override
	public List<WechatCustomer> selectWechatCustomerList(WechatCustomer wechatCustomer) {
		return wechatCustomerMapper.selectWechatCustomerList(wechatCustomer);
	}

	/**
	 * 新增微信客户
	 * 
	 * @param wechatCustomer 微信客户
	 * @return 结果
	 */
	@Override
	public int insertWechatCustomer(WechatCustomer wechatCustomer) {
		return wechatCustomerMapper.insertWechatCustomer(wechatCustomer);
	}

	/**
	 * 修改微信客户
	 * 
	 * @param wechatCustomer 微信客户
	 * @return 结果
	 */
	@Override
	public int updateWechatCustomer(WechatCustomer wechatCustomer) {
		return wechatCustomerMapper.updateWechatCustomer(wechatCustomer);
	}

	/**
	 * 删除微信客户对象
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public String deleteWechatCustomerByIds(String ids) {
		String[] idArray = Convert.toStrArray(ids);
		StringBuilder sb = new StringBuilder();
		boolean hasError = false;
		for (String id : idArray) {
			boolean flag = false;
			WechatCustomer customer = wechatCustomerMapper.selectWechatCustomerById(id);
			if("1".equals(customer.getIsDelivery())) {
				flag = true;
			}
			if("1".equals(customer.getIsSales())) {
				flag = true;
			}
			
			if(flag) {
				sb.append("<br>" + customer.getCustomerName() + ("1".equals(customer.getIsDelivery())? "已经发样, " : "") + ("1".equals(customer.getIsSales())? "已经成交," : "") + "不允许删除");
				hasError = true;
			}
		}
		
		if(hasError) {
			return sb.toString().replaceFirst("<br>", "");
		}
		wechatCustomerMapper.deleteWechatCustomerByIds(Convert.toStrArray(ids));
		return null;
	}

	/**
	 * 删除微信客户信息
	 * 
	 * @param customerId 微信客户ID
	 * @return 结果
	 */
	@Override
	public int deleteWechatCustomerById(String customerId) {
		return wechatCustomerMapper.deleteWechatCustomerById(customerId);
	}
	
	

	@Transactional(rollbackFor=Exception.class)
	@Override
	public int addWechatCustomer(WechatCustomer wechatCustomer, List<KhDeliverGoods> saleInfoList,
			List<KhAfterSaleMember> postSaleList) {
		wechatCustomer.setCreationTime(new Date());
		wechatCustomerMapper.insertWechatCustomer(wechatCustomer);
		if(saleInfoList != null && saleInfoList.size() > 0) {
			for (KhDeliverGoods khDeliverGoods : saleInfoList) {
				khDeliverGoods.setOrderNumber(genOrderNumber(khDeliverGoods.getFollowResultType()));
				khDeliverGoods.setCustomerId(wechatCustomer.getCustomerId());
				khDeliverGoodsMapper.insertKhDeliverGoods(khDeliverGoods);
			}
		}
		
		if(postSaleList != null && postSaleList.size() > 0) {
			for (KhAfterSaleMember khAfterSaleMember : postSaleList) {
				khAfterSaleMember.setOrderNumber(genOrderNumber("4"));
				khAfterSaleMember.setCustomerId(wechatCustomer.getCustomerId());
				khAfterSaleMemberMapper.insertKhAfterSaleMember(khAfterSaleMember);
			}
		}
		return 1;
	}
	
	private String genOrderNumber(String type) {
		return orderTypeMap.get(type) + "_" + DateFormatUtils.format(new Date(), "yyyyMMddHHmmss");   //TODO 暂时没用序列
	}

	@Transactional(rollbackFor=Exception.class)
	@Override
	public int updateWechatCustomer(WechatCustomer wechatCustomer, List<KhDeliverGoods> saleInfoList,
			List<KhAfterSaleMember> postSaleList) {
		wechatCustomerMapper.updateWechatCustomer(wechatCustomer);
		if(saleInfoList != null && saleInfoList.size() > 0) {
			for (KhDeliverGoods khDeliverGoods : saleInfoList) {
				khDeliverGoods.setCustomerId(wechatCustomer.getCustomerId());
				KhDeliverGoods kdg=khDeliverGoodsMapper.selectKhDeliverGoodsById(khDeliverGoods.getId());
				if(null==kdg) {
					khDeliverGoods.setOrderNumber(genOrderNumber(khDeliverGoods.getFollowResultType()));
					khDeliverGoodsMapper.insertKhDeliverGoods(khDeliverGoods);
				}else {
					khDeliverGoodsMapper.updateKhDeliverGoods(khDeliverGoods);
				}
				
			}
		}
		
		if(postSaleList != null && postSaleList.size() > 0) {
			for (KhAfterSaleMember khAfterSaleMember : postSaleList) {
				khAfterSaleMember.setCustomerId(wechatCustomer.getCustomerId());
				KhAfterSaleMember kasm=khAfterSaleMemberMapper.selectKhAfterSaleMemberById(khAfterSaleMember.getId());
				if(null==kasm) {
					khAfterSaleMember.setOrderNumber(genOrderNumber("4"));
					khAfterSaleMemberMapper.insertKhAfterSaleMember(khAfterSaleMember);
				}else {
					khAfterSaleMemberMapper.updateKhAfterSaleMember(khAfterSaleMember);
				}
				
			}
		}
		return 1;
	}

	@Override
	public List<KhDeliverGoods> findKhDeliverGoodsByCustomerId(String customerId) {
		return khDeliverGoodsMapper.findKhDeliverGoodsByCustomerId(customerId);
	}

	@Override
	public List<KhAfterSaleMember> findKhAfterSaleMemberByCustomerId(String customerId) {
		return khAfterSaleMemberMapper.findKhAfterSaleMemberByCustomerId(customerId);
	}
}
