package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import java.util.List;

/**
 * 售后情况Service接口
 * 
 * @author WBG
 * @date 2019-10-28
 */
public interface IKhAfterSaleMemberService {
    /**
     * 查询售后情况
     * 
     * @param id 售后情况ID
     * @return 售后情况
     */
    public KhAfterSaleMember selectKhAfterSaleMemberById(String id);

    /**
     * 查询售后情况列表
     * 
     * @param khAfterSaleMember 售后情况
     * @return 售后情况集合
     */
    public List<KhAfterSaleMember> selectKhAfterSaleMemberList(KhAfterSaleMember khAfterSaleMember);

    /**
     * 新增售后情况
     * 
     * @param khAfterSaleMember 售后情况
     * @return 结果
     */
    public int insertKhAfterSaleMember(KhAfterSaleMember khAfterSaleMember);

    /**
     * 修改售后情况
     * 
     * @param khAfterSaleMember 售后情况
     * @return 结果
     */
    public int updateKhAfterSaleMember(KhAfterSaleMember khAfterSaleMember);

    /**
     * 批量删除售后情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKhAfterSaleMemberByIds(String ids);

    /**
     * 删除售后情况信息
     * 
     * @param id 售后情况ID
     * @return 结果
     */
    public int deleteKhAfterSaleMemberById(String id);
}
