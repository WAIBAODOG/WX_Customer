package com.ruoyi.wxcustomer.mapper;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhAfterSaleMember;
import com.ruoyi.wxcustomer.domain.vo.AfterSaleMemberVO;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;

/**
 * 售后情况Mapper接口
 * 
 * @author WBG
 * @date 2019-10-24
 */
public interface KhAfterSaleMemberMapper {
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
	 * 删除售后情况
	 * 
	 * @param id 售后情况ID
	 * @return 结果
	 */
	public int deleteKhAfterSaleMemberById(String id);

	/**
	 * 批量删除售后情况
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteKhAfterSaleMemberByIds(String[] ids);

	public List<KhAfterSaleMember> findKhAfterSaleMemberByCustomerId(String customerId);
	
	public List<AfterSaleMemberVO> selectList(AfterSaleMemberVO vo);

	/**
	 * 通过订单号获取
	 */
	public AfterSaleMemberVO selectVOByOrderNumber(String num);

	/** 改状态，不是物理删除 **/
	public int deleteByIds(String[] ids);
}
