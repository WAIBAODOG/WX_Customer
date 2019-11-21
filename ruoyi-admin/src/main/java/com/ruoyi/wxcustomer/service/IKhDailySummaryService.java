package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.KhDailySummary;
import java.util.List;

/**
 * 工作总结Service接口
 * 
 * @author ruoyi
 * @date 2019-11-19
 */
public interface IKhDailySummaryService {
    /**
     * 查询工作总结
     * 
     * @param id 工作总结ID
     * @return 工作总结
     */
    public KhDailySummary selectKhDailySummaryById(String id);

    /**
     * 查询工作总结列表
     * 
     * @param khDailySummary 工作总结
     * @return 工作总结集合
     */
    public List<KhDailySummary> selectKhDailySummaryList(KhDailySummary khDailySummary);

    /**
     * 新增工作总结
     * 
     * @param khDailySummary 工作总结
     * @return 结果
     */
    public int insertKhDailySummary(KhDailySummary khDailySummary);

    /**
     * 修改工作总结
     * 
     * @param khDailySummary 工作总结
     * @return 结果
     */
    public int updateKhDailySummary(KhDailySummary khDailySummary);

    /**
     * 批量删除工作总结
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKhDailySummaryByIds(String ids);

    /**
     * 删除工作总结信息
     * 
     * @param id 工作总结ID
     * @return 结果
     */
    public int deleteKhDailySummaryById(String id);
}
