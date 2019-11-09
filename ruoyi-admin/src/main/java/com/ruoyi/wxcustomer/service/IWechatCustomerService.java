package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import java.util.List;

/**
 * 微信客户Service接口
 * 
 * @author yzh
 * @date 2019-10-23
 */
public interface IWechatCustomerService {
	/**
	 * 查询微信客户
	 * 
	 * @param customerId 微信客户ID
	 * @return 微信客户
	 */
	public WechatCustomer selectWechatCustomerById(String customerId);

	/**
	 * 查询微信客户列表
	 * 
	 * @param wechatCustomer 微信客户
	 * @return 微信客户集合
	 */
	public List<WechatCustomer> selectWechatCustomerList(WechatCustomer wechatCustomer);

	/**
	 * 新增微信客户
	 * 
	 * @param wechatCustomer 微信客户
	 * @return 结果
	 */
	public int insertWechatCustomer(WechatCustomer wechatCustomer);

	/**
	 * 修改微信客户
	 * 
	 * @param wechatCustomer 微信客户
	 * @return 结果
	 */
	public int updateWechatCustomer(WechatCustomer wechatCustomer);

	/**
	 * 批量删除微信客户
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public String deleteWechatCustomerByIds(String ids);

	/**
	 * 删除微信客户信息
	 * 
	 * @param customerId 微信客户ID
	 * @return 结果
	 */
	public int deleteWechatCustomerById(String customerId);

	/**
	 *   新增客户信息
	 * @param wechatCustomer
	 * @param saleInfoList
	 * @param postSaleList
	 */
	public int addWechatCustomer(WechatCustomer wechatCustomer, List<KhDeliverGoods> saleInfoList,
			List<KhAfterSaleMember> postSaleList);

	/**
	 *    修改客户信息
	 * @param wechatCustomer
	 * @param saleInfoList
	 * @param postSaleList
	 */
	public int updateWechatCustomer(WechatCustomer wechatCustomer, List<KhDeliverGoods> saleInfoList,
			List<KhAfterSaleMember> postSaleList);

	public List<KhDeliverGoods> findKhDeliverGoodsByCustomerId(String customerId);

	public List<KhAfterSaleMember> findKhAfterSaleMemberByCustomerId(String customerId);
}
