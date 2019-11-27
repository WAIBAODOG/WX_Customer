package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.WeixinContext;
import com.ruoyi.wxcustomer.domain.common.FileInfo;

import java.util.List;
import java.util.Map;

/**
 * 微信朋友圈内容Service接口
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
public interface IWeixinContextService {
    /**
     * 查询微信朋友圈内容
     * 
     * @param id 微信朋友圈内容ID
     * @return 微信朋友圈内容
     */
    public WeixinContext selectWeixinContextById(String id);

    /**
     * 查询微信朋友圈内容列表
     * 
     * @param weixinContext 微信朋友圈内容
     * @return 微信朋友圈内容集合
     */
    public List<WeixinContext> selectWeixinContextList(WeixinContext weixinContext);

    /**
     * 新增微信朋友圈内容
     * 
     * @param weixinContext 微信朋友圈内容
     * @return 结果
     */
    public int insertWeixinContext(WeixinContext weixinContext);

    /**
     * 修改微信朋友圈内容
     * 
     * @param weixinContext 微信朋友圈内容
     * @return 结果
     */
    public int updateWeixinContext(WeixinContext weixinContext);

    /**
     * 批量删除微信朋友圈内容
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWeixinContextByIds(String ids);

    /**
     * 删除微信朋友圈内容信息
     * 
     * @param id 微信朋友圈内容ID
     * @return 结果
     */
    public int deleteWeixinContextById(String id);
    
    public int addContext(List<FileInfo> fileList,WeixinContext weixinContext) ;
}
