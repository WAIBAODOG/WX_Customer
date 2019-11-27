package com.ruoyi.wxcustomer.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wxcustomer.mapper.KhFileMapper;
import com.ruoyi.wxcustomer.domain.KhFile;
import com.ruoyi.wxcustomer.service.IKhFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 文件保存表Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
@Service
public class KhFileServiceImpl implements IKhFileService {
    @Autowired
    private KhFileMapper khFileMapper;

    /**
     * 查询文件保存表
     * 
     * @param id 文件保存表ID
     * @return 文件保存表
     */
    @Override
    public KhFile selectKhFileById(String id){
        return khFileMapper.selectKhFileById(id);
    }

    /**
     * 查询文件保存表列表
     * 
     * @param khFile 文件保存表
     * @return 文件保存表
     */
    @Override
    public List<KhFile> selectKhFileList(KhFile khFile){
        return khFileMapper.selectKhFileList(khFile);
    }

    /**
     * 新增文件保存表
     * 
     * @param khFile 文件保存表
     * @return 结果
     */
    @Override
    public int insertKhFile(KhFile khFile){
        khFile.setCreateTime(DateUtils.getNowDate());
        return khFileMapper.insertKhFile(khFile);
    }

    /**
     * 修改文件保存表
     * 
     * @param khFile 文件保存表
     * @return 结果
     */
    @Override
    public int updateKhFile(KhFile khFile){
        khFile.setUpdateTime(DateUtils.getNowDate());
        return khFileMapper.updateKhFile(khFile);
    }

    /**
     * 删除文件保存表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKhFileByIds(String ids){
        return khFileMapper.deleteKhFileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除文件保存表信息
     * 
     * @param id 文件保存表ID
     * @return 结果
     */
    @Override
    public int deleteKhFileById(String id){
        return khFileMapper.deleteKhFileById(id);
    }
}
