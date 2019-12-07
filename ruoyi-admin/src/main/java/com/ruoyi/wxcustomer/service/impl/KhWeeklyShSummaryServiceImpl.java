package com.ruoyi.wxcustomer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wxcustomer.mapper.KhWeeklyShSummaryMapper;
import com.ruoyi.wxcustomer.domain.KhWeeklyShSummary;
import com.ruoyi.wxcustomer.service.IKhWeeklyShSummaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 售后每周工作Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-07
 */
@Service
public class KhWeeklyShSummaryServiceImpl implements IKhWeeklyShSummaryService {
    @Autowired
    private KhWeeklyShSummaryMapper khWeeklyShSummaryMapper;

    /**
     * 查询售后每周工作
     * 
     * @param id 售后每周工作ID
     * @return 售后每周工作
     */
    @Override
    public KhWeeklyShSummary selectKhWeeklyShSummaryById(String id){
        return khWeeklyShSummaryMapper.selectKhWeeklyShSummaryById(id);
    }

    /**
     * 查询售后每周工作列表
     * 
     * @param khWeeklyShSummary 售后每周工作
     * @return 售后每周工作
     */
    @Override
    public List<KhWeeklyShSummary> selectKhWeeklyShSummaryList(KhWeeklyShSummary khWeeklyShSummary){
        return khWeeklyShSummaryMapper.selectKhWeeklyShSummaryList(khWeeklyShSummary);
    }

    /**
     * 新增售后每周工作
     * 
     * @param khWeeklyShSummary 售后每周工作
     * @return 结果
     */
    @Override
    public int insertKhWeeklyShSummary(KhWeeklyShSummary khWeeklyShSummary){
        return khWeeklyShSummaryMapper.insertKhWeeklyShSummary(khWeeklyShSummary);
    }

    /**
     * 修改售后每周工作
     * 
     * @param khWeeklyShSummary 售后每周工作
     * @return 结果
     */
    @Override
    public int updateKhWeeklyShSummary(KhWeeklyShSummary khWeeklyShSummary){
        return khWeeklyShSummaryMapper.updateKhWeeklyShSummary(khWeeklyShSummary);
    }

    /**
     * 删除售后每周工作对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKhWeeklyShSummaryByIds(String ids){
        return khWeeklyShSummaryMapper.deleteKhWeeklyShSummaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除售后每周工作信息
     * 
     * @param id 售后每周工作ID
     * @return 结果
     */
    @Override
    public int deleteKhWeeklyShSummaryById(String id){
        return khWeeklyShSummaryMapper.deleteKhWeeklyShSummaryById(id);
    }
}
