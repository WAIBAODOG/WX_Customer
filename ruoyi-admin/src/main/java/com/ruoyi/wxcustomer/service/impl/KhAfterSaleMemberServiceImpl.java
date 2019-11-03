package com.ruoyi.wxcustomer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import com.ruoyi.wxcustomer.domain.vo.AfterSaleMemberVO;
import com.ruoyi.wxcustomer.mapper.KhAfterSaleMemberMapper;
import com.ruoyi.wxcustomer.service.IKhAfterSaleMemberService;

/**
 * 售后情况Service业务层处理
 * 
 * @author WBG
 * @date 2019-10-24
 */
@Service
public class KhAfterSaleMemberServiceImpl implements IKhAfterSaleMemberService  {
    @Autowired
    private KhAfterSaleMemberMapper khAfterSaleMemberMapper;

    /**
     * 查询售后情况
     * 
     * @param id 售后情况ID
     * @return 售后情况
     */
    @Override
    public KhAfterSaleMember selectKhAfterSaleMemberById(String id) {
        return khAfterSaleMemberMapper.selectKhAfterSaleMemberById(id);
    }

    /**
     * 查询售后情况列表
     * 
     * @param khAfterSaleMember 售后情况
     * @return 售后情况
     */
    @Override
    public List<KhAfterSaleMember> selectKhAfterSaleMemberList(KhAfterSaleMember khAfterSaleMember) {
        return khAfterSaleMemberMapper.selectKhAfterSaleMemberList(khAfterSaleMember);
    }

    /**
     * 新增售后情况
     * 
     * @param khAfterSaleMember 售后情况
     * @return 结果
     */
    @Override
    public int insertKhAfterSaleMember(KhAfterSaleMember khAfterSaleMember) {
        return khAfterSaleMemberMapper.insertKhAfterSaleMember(khAfterSaleMember);
    }

    /**
     * 修改售后情况
     * 
     * @param khAfterSaleMember 售后情况
     * @return 结果
     */
    @Override
    public int updateKhAfterSaleMember(KhAfterSaleMember khAfterSaleMember) {
        return khAfterSaleMemberMapper.updateKhAfterSaleMember(khAfterSaleMember);
    }

    /**
     * 删除售后情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKhAfterSaleMemberByIds(String ids) {
        return khAfterSaleMemberMapper.deleteKhAfterSaleMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除售后情况信息
     * 
     * @param id 售后情况ID
     * @return 结果
     */
    @Override
    public int deleteKhAfterSaleMemberById(String id) {
        return khAfterSaleMemberMapper.deleteKhAfterSaleMemberById(id);
    }
    public List<AfterSaleMemberVO> selectList(AfterSaleMemberVO vo){
    	return khAfterSaleMemberMapper.selectList(vo);
    }

	/**
	 * 通过订单号获取
	 */
	public AfterSaleMemberVO selectVOByOrderNumber(String num) {
		return khAfterSaleMemberMapper.selectVOByOrderNumber(num);
	}
	
	/** 改状态，不是物理删除 **/
	public int deleteByIds(String ids) {
		return khAfterSaleMemberMapper.deleteByIds(Convert.toStrArray(ids));
	}
}