package com.ruoyi.wxcustomer.service;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;

/**
 * 发样/成交情况Service接口
 * 
 * @author WBG
 * @date 2019-10-24
 */
public interface IKhDeliverGoodsService {
	/**
	 * 查询发样/成交情况
	 * 
	 * @param id 发样/成交情况ID
	 * @return 发样/成交情况
	 */
	public KhDeliverGoods selectKhDeliverGoodsById(String id);

	/**
	 * 查询发样/成交情况列表
	 * 
	 * @param khDeliverGoods 发样/成交情况
	 * @return 发样/成交情况集合
	 */
	public List<KhDeliverGoods> selectKhDeliverGoodsList(KhDeliverGoods khDeliverGoods);

	/**
	 * 新增发样/成交情况
	 * 
	 * @param khDeliverGoods 发样/成交情况
	 * @return 结果
	 */
	public int insertKhDeliverGoods(KhDeliverGoods khDeliverGoods);

	/**
	 * 修改发样/成交情况
	 * 
	 * @param khDeliverGoods 发样/成交情况
	 * @return 结果
	 */
	public int updateKhDeliverGoods(KhDeliverGoods khDeliverGoods);

	/**
	 * 批量删除发样/成交情况
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteKhDeliverGoodsByIds(String ids);

	/**
	 * 删除发样/成交情况信息
	 * 
	 * @param id 发样/成交情况ID
	 * @return 结果
	 */
	public int deleteKhDeliverGoodsById(String id);

	public List<DeliverGoodsVO> selectList(DeliverGoodsVO vo);

	/** 通过订单号获取 **/
	public DeliverGoodsVO selectVOByOrderNumber(String num);

	/** 改状态，不是物理删除 **/
	public int deleteByIds(String ids);
}