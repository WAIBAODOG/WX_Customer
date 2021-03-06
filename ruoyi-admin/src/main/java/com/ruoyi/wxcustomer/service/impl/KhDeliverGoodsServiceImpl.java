package com.ruoyi.wxcustomer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.wxcustomer.domain.KhDeliverGoods;
import com.ruoyi.wxcustomer.domain.vo.DeliverGoodsVO;
import com.ruoyi.wxcustomer.mapper.KhDeliverGoodsMapper;
import com.ruoyi.wxcustomer.service.IKhDeliverGoodsService;

/**
 * 发样/成交情况Service业务层处理
 * 
 * @author WBG
 * @date 2019-10-24
 */
@Service
public class KhDeliverGoodsServiceImpl implements IKhDeliverGoodsService {
	@Autowired
	private KhDeliverGoodsMapper khDeliverGoodsMapper;

	/**
	 * 查询发样/成交情况
	 * 
	 * @param id 发样/成交情况ID
	 * @return 发样/成交情况
	 */
	@Override
	public KhDeliverGoods selectKhDeliverGoodsById(String id) {
		return khDeliverGoodsMapper.selectKhDeliverGoodsById(id);
	}

	/**
	 * 查询发样/成交情况列表
	 * 
	 * @param khDeliverGoods 发样/成交情况
	 * @return 发样/成交情况
	 */
	@Override
	public List<KhDeliverGoods> selectKhDeliverGoodsList(KhDeliverGoods khDeliverGoods) {
		return khDeliverGoodsMapper.selectKhDeliverGoodsList(khDeliverGoods);
	}

	/**
	 * 新增发样/成交情况
	 * 
	 * @param khDeliverGoods 发样/成交情况
	 * @return 结果
	 */
	@Override
	public int insertKhDeliverGoods(KhDeliverGoods khDeliverGoods) {
		return khDeliverGoodsMapper.insertKhDeliverGoods(khDeliverGoods);
	}

	/**
	 * 修改发样/成交情况
	 * 
	 * @param khDeliverGoods 发样/成交情况
	 * @return 结果
	 */
	@Override
	public int updateKhDeliverGoods(KhDeliverGoods khDeliverGoods) {
		return khDeliverGoodsMapper.updateKhDeliverGoods(khDeliverGoods);
	}

	/**
	 * 删除发样/成交情况对象
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteKhDeliverGoodsByIds(String ids) {
		return khDeliverGoodsMapper.deleteKhDeliverGoodsByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除发样/成交情况信息
	 * 
	 * @param id 发样/成交情况ID
	 * @return 结果
	 */
	@Override
	public int deleteKhDeliverGoodsById(String id) {
		return khDeliverGoodsMapper.deleteKhDeliverGoodsById(id);
	}

	@Override
	public List<DeliverGoodsVO> selectList(DeliverGoodsVO vo) {
		return khDeliverGoodsMapper.selectList(vo);
	}

	public DeliverGoodsVO selectVOByOrderNumber(String num) {
		return khDeliverGoodsMapper.selectVOByOrderNumber(num);
	}

	/** 改状态，不是物理删除 **/
	public int deleteByIds(String ids) {
		return khDeliverGoodsMapper.deleteByIds(Convert.toStrArray(ids));
	}

	@Override
	public int updateKhDeliverGoodList(List<KhDeliverGoods> khDeliverGoods) {
		try {
			for(int i=0;i<khDeliverGoods.size();i++) {
				 this.updateKhDeliverGoods(khDeliverGoods.get(i));
			}
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}
}