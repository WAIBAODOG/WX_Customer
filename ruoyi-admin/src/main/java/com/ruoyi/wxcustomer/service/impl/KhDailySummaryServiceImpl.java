package com.ruoyi.wxcustomer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wxcustomer.mapper.KhDailySummaryMapper;
import com.ruoyi.wxcustomer.domain.KhDailySummary;
import com.ruoyi.wxcustomer.service.IKhDailySummaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作总结Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-19
 */
@Service
public class KhDailySummaryServiceImpl implements IKhDailySummaryService {
    @Autowired
    private KhDailySummaryMapper khDailySummaryMapper;

    /**
     * 查询工作总结
     * 
     * @param id 工作总结ID
     * @return 工作总结
     */
    @Override
    public KhDailySummary selectKhDailySummaryById(String id){
        return khDailySummaryMapper.selectKhDailySummaryById(id);
    }

    /**
     * 查询工作总结列表
     * 
     * @param khDailySummary 工作总结
     * @return 工作总结
     */
    @Override
    public List<KhDailySummary> selectKhDailySummaryList(KhDailySummary khDailySummary){
        return khDailySummaryMapper.selectKhDailySummaryList(khDailySummary);
    }

    /**
     * 新增工作总结
     * 
     * @param khDailySummary 工作总结
     * @return 结果
     */
    @Override
    public int insertKhDailySummary(KhDailySummary khDailySummary){
        return khDailySummaryMapper.insertKhDailySummary(khDailySummary);
    }

    /**
     * 修改工作总结
     * 
     * @param khDailySummary 工作总结
     * @return 结果
     */
    @Override
    public int updateKhDailySummary(KhDailySummary khDailySummary){
        return khDailySummaryMapper.updateKhDailySummary(khDailySummary);
    }

    /**
     * 删除工作总结对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKhDailySummaryByIds(String ids){
        return khDailySummaryMapper.deleteKhDailySummaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工作总结信息
     * 
     * @param id 工作总结ID
     * @return 结果
     */
    @Override
    public int deleteKhDailySummaryById(String id){
        return khDailySummaryMapper.deleteKhDailySummaryById(id);
    }
}
