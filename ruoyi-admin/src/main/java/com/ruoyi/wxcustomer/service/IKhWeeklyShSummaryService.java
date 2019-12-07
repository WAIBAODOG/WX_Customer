package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.KhWeeklyShSummary;
import java.util.List;

/**
 * 售后每周工作Service接口
 * 
 * @author ruoyi
 * @date 2019-12-07
 */
public interface IKhWeeklyShSummaryService {
    /**
     * 查询售后每周工作
     * 
     * @param id 售后每周工作ID
     * @return 售后每周工作
     */
    public KhWeeklyShSummary selectKhWeeklyShSummaryById(String id);

    /**
     * 查询售后每周工作列表
     * 
     * @param khWeeklyShSummary 售后每周工作
     * @return 售后每周工作集合
     */
    public List<KhWeeklyShSummary> selectKhWeeklyShSummaryList(KhWeeklyShSummary khWeeklyShSummary);

    /**
     * 新增售后每周工作
     * 
     * @param khWeeklyShSummary 售后每周工作
     * @return 结果
     */
    public int insertKhWeeklyShSummary(KhWeeklyShSummary khWeeklyShSummary);

    /**
     * 修改售后每周工作
     * 
     * @param khWeeklyShSummary 售后每周工作
     * @return 结果
     */
    public int updateKhWeeklyShSummary(KhWeeklyShSummary khWeeklyShSummary);

    /**
     * 批量删除售后每周工作
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKhWeeklyShSummaryByIds(String ids);

    /**
     * 删除售后每周工作信息
     * 
     * @param id 售后每周工作ID
     * @return 结果
     */
    public int deleteKhWeeklyShSummaryById(String id);
}
