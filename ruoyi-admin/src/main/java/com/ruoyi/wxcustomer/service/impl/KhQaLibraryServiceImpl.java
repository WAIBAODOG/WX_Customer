package com.ruoyi.wxcustomer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wxcustomer.mapper.KhQaLibraryMapper;
import com.ruoyi.wxcustomer.domain.KhQaLibrary;
import com.ruoyi.wxcustomer.service.IKhQaLibraryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 问答库Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-20
 */
@Service
public class KhQaLibraryServiceImpl implements IKhQaLibraryService {
    @Autowired
    private KhQaLibraryMapper khQaLibraryMapper;

    /**
     * 查询问答库
     * 
     * @param id 问答库ID
     * @return 问答库
     */
    @Override
    public KhQaLibrary selectKhQaLibraryById(String id){
        return khQaLibraryMapper.selectKhQaLibraryById(id);
    }

    /**
     * 查询问答库列表
     * 
     * @param khQaLibrary 问答库
     * @return 问答库
     */
    @Override
    public List<KhQaLibrary> selectKhQaLibraryList(KhQaLibrary khQaLibrary){
        return khQaLibraryMapper.selectKhQaLibraryList(khQaLibrary);
    }

    /**
     * 新增问答库
     * 
     * @param khQaLibrary 问答库
     * @return 结果
     */
    @Override
    public int insertKhQaLibrary(KhQaLibrary khQaLibrary){
        return khQaLibraryMapper.insertKhQaLibrary(khQaLibrary);
    }

    /**
     * 修改问答库
     * 
     * @param khQaLibrary 问答库
     * @return 结果
     */
    @Override
    public int updateKhQaLibrary(KhQaLibrary khQaLibrary){
        return khQaLibraryMapper.updateKhQaLibrary(khQaLibrary);
    }

    /**
     * 删除问答库对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKhQaLibraryByIds(String ids){
        return khQaLibraryMapper.deleteKhQaLibraryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除问答库信息
     * 
     * @param id 问答库ID
     * @return 结果
     */
    @Override
    public int deleteKhQaLibraryById(String id){
        return khQaLibraryMapper.deleteKhQaLibraryById(id);
    }
}
