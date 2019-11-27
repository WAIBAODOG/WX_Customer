package com.ruoyi.wxcustomer.mapper;

import com.ruoyi.wxcustomer.domain.KhFile;
import java.util.List;

/**
 * 文件保存表Mapper接口
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
public interface KhFileMapper {
    /**
     * 查询文件保存表
     * 
     * @param id 文件保存表ID
     * @return 文件保存表
     */
    public KhFile selectKhFileById(String id);

    /**
     * 查询文件保存表列表
     * 
     * @param khFile 文件保存表
     * @return 文件保存表集合
     */
    public List<KhFile> selectKhFileList(KhFile khFile);

    /**
     * 新增文件保存表
     * 
     * @param khFile 文件保存表
     * @return 结果
     */
    public int insertKhFile(KhFile khFile);

    /**
     * 修改文件保存表
     * 
     * @param khFile 文件保存表
     * @return 结果
     */
    public int updateKhFile(KhFile khFile);

    /**
     * 删除文件保存表
     * 
     * @param id 文件保存表ID
     * @return 结果
     */
    public int deleteKhFileById(String id);

    /**
     * 批量删除文件保存表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKhFileByIds(String[] ids);
}
