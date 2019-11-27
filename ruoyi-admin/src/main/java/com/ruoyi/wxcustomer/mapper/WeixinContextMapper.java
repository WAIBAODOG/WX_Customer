package com.ruoyi.wxcustomer.mapper;

import com.ruoyi.wxcustomer.domain.WeixinContext;
import java.util.List;

/**
 * 微信朋友圈内容Mapper接口
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
public interface WeixinContextMapper {
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
     * 删除微信朋友圈内容
     * 
     * @param id 微信朋友圈内容ID
     * @return 结果
     */
    public int deleteWeixinContextById(String id);

    /**
     * 批量删除微信朋友圈内容
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWeixinContextByIds(String[] ids);
}
