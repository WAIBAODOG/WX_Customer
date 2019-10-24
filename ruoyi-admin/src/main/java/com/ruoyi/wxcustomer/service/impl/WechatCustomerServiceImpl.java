package com.ruoyi.wxcustomer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wxcustomer.mapper.WechatCustomerMapper;
import com.ruoyi.wxcustomer.domain.WechatCustomer;
import com.ruoyi.wxcustomer.service.IWechatCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 微信客户Service业务层处理
 * 
 * @author yzh
 * @date 2019-10-23
 */
@Service
public class WechatCustomerServiceImpl implements IWechatCustomerService {
    @Autowired
    private WechatCustomerMapper wechatCustomerMapper;

    /**
     * 查询微信客户
     * 
     * @param customerId 微信客户ID
     * @return 微信客户
     */
    @Override
    public WechatCustomer selectWechatCustomerById(String customerId){
        return wechatCustomerMapper.selectWechatCustomerById(customerId);
    }

    /**
     * 查询微信客户列表
     * 
     * @param wechatCustomer 微信客户
     * @return 微信客户
     */
    @Override
    public List<WechatCustomer> selectWechatCustomerList(WechatCustomer wechatCustomer){
        return wechatCustomerMapper.selectWechatCustomerList(wechatCustomer);
    }

    /**
     * 新增微信客户
     * 
     * @param wechatCustomer 微信客户
     * @return 结果
     */
    @Override
    public int insertWechatCustomer(WechatCustomer wechatCustomer){
        return wechatCustomerMapper.insertWechatCustomer(wechatCustomer);
    }

    /**
     * 修改微信客户
     * 
     * @param wechatCustomer 微信客户
     * @return 结果
     */
    @Override
    public int updateWechatCustomer(WechatCustomer wechatCustomer){
        return wechatCustomerMapper.updateWechatCustomer(wechatCustomer);
    }

    /**
     * 删除微信客户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWechatCustomerByIds(String ids){
        return wechatCustomerMapper.deleteWechatCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除微信客户信息
     * 
     * @param customerId 微信客户ID
     * @return 结果
     */
    @Override
    public int deleteWechatCustomerById(String customerId){
        return wechatCustomerMapper.deleteWechatCustomerById(customerId);
    }
}
