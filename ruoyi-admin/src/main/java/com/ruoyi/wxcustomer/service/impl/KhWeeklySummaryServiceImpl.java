package com.ruoyi.wxcustomer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wxcustomer.mapper.KhWeeklySummaryMapper;
import com.ruoyi.wxcustomer.domain.KhWeeklySummary;
import com.ruoyi.wxcustomer.service.IKhWeeklySummaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 发样每周工作Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-01
 */
@Service
public class KhWeeklySummaryServiceImpl implements IKhWeeklySummaryService {
    @Autowired
    private KhWeeklySummaryMapper khWeeklySummaryMapper;

    /**
     * 查询发样每周工作
     * 
     * @param id 发样每周工作ID
     * @return 发样每周工作
     */
    @Override
    public KhWeeklySummary selectKhWeeklySummaryById(String id){
        return khWeeklySummaryMapper.selectKhWeeklySummaryById(id);
    }

    /**
     * 查询发样每周工作列表
     * 
     * @param khWeeklySummary 发样每周工作
     * @return 发样每周工作
     */
    @Override
    public List<KhWeeklySummary> selectKhWeeklySummaryList(KhWeeklySummary khWeeklySummary){
        return khWeeklySummaryMapper.selectKhWeeklySummaryList(khWeeklySummary);
    }

    /**
     * 新增发样每周工作
     * 
     * @param khWeeklySummary 发样每周工作
     * @return 结果
     */
    @Override
    public int insertKhWeeklySummary(KhWeeklySummary khWeeklySummary){
        return khWeeklySummaryMapper.insertKhWeeklySummary(khWeeklySummary);
    }

    /**
     * 修改发样每周工作
     * 
     * @param khWeeklySummary 发样每周工作
     * @return 结果
     */
    @Override
    public int updateKhWeeklySummary(KhWeeklySummary khWeeklySummary){
        return khWeeklySummaryMapper.updateKhWeeklySummary(khWeeklySummary);
    }

    /**
     * 删除发样每周工作对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKhWeeklySummaryByIds(String ids){
        return khWeeklySummaryMapper.deleteKhWeeklySummaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除发样每周工作信息
     * 
     * @param id 发样每周工作ID
     * @return 结果
     */
    @Override
    public int deleteKhWeeklySummaryById(String id){
        return khWeeklySummaryMapper.deleteKhWeeklySummaryById(id);
    }
}
