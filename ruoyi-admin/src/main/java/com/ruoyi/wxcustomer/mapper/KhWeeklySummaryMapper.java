package com.ruoyi.wxcustomer.mapper;

import com.ruoyi.wxcustomer.domain.KhWeeklySummary;
import java.util.List;

/**
 * 发样每周工作Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-01
 */
public interface KhWeeklySummaryMapper {
    /**
     * 查询发样每周工作
     * 
     * @param id 发样每周工作ID
     * @return 发样每周工作
     */
    public KhWeeklySummary selectKhWeeklySummaryById(String id);

    /**
     * 查询发样每周工作列表
     * 
     * @param khWeeklySummary 发样每周工作
     * @return 发样每周工作集合
     */
    public List<KhWeeklySummary> selectKhWeeklySummaryList(KhWeeklySummary khWeeklySummary);

    /**
     * 新增发样每周工作
     * 
     * @param khWeeklySummary 发样每周工作
     * @return 结果
     */
    public int insertKhWeeklySummary(KhWeeklySummary khWeeklySummary);

    /**
     * 修改发样每周工作
     * 
     * @param khWeeklySummary 发样每周工作
     * @return 结果
     */
    public int updateKhWeeklySummary(KhWeeklySummary khWeeklySummary);

    /**
     * 删除发样每周工作
     * 
     * @param id 发样每周工作ID
     * @return 结果
     */
    public int deleteKhWeeklySummaryById(String id);

    /**
     * 批量删除发样每周工作
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKhWeeklySummaryByIds(String[] ids);
}
