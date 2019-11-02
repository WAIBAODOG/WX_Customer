package com.ruoyi.wxcustomer.mapper;

import com.ruoyi.wxcustomer.domain.WechatCustomer;
import java.util.List;

/**
 * 微信客户Mapper接口
 * 
 * @author yzh
 * @date 2019-10-23
 */
public interface WechatCustomerMapper {
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
	 * 删除微信客户
	 * 
	 * @param customerId 微信客户ID
	 * @return 结果
	 */
	public int deleteWechatCustomerById(String customerId);

	/**
	 * 批量删除微信客户
	 * 
	 * @param customerIds 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteWechatCustomerByIds(String[] customerIds);
}
