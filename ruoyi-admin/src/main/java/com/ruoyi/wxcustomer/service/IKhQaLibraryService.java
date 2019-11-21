package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.KhQaLibrary;
import java.util.List;

/**
 * 问答库Service接口
 * 
 * @author ruoyi
 * @date 2019-11-20
 */
public interface IKhQaLibraryService {
    /**
     * 查询问答库
     * 
     * @param id 问答库ID
     * @return 问答库
     */
    public KhQaLibrary selectKhQaLibraryById(String id);

    /**
     * 查询问答库列表
     * 
     * @param khQaLibrary 问答库
     * @return 问答库集合
     */
    public List<KhQaLibrary> selectKhQaLibraryList(KhQaLibrary khQaLibrary);

    /**
     * 新增问答库
     * 
     * @param khQaLibrary 问答库
     * @return 结果
     */
    public int insertKhQaLibrary(KhQaLibrary khQaLibrary);

    /**
     * 修改问答库
     * 
     * @param khQaLibrary 问答库
     * @return 结果
     */
    public int updateKhQaLibrary(KhQaLibrary khQaLibrary);

    /**
     * 批量删除问答库
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKhQaLibraryByIds(String ids);

    /**
     * 删除问答库信息
     * 
     * @param id 问答库ID
     * @return 结果
     */
    public int deleteKhQaLibraryById(String id);
}
