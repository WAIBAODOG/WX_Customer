/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: KhShopInFoServiceImpl.java
 * @Package com.ruoyi.wxcustomer.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月8日 下午3:12:28
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.mapper.KhShopInFoMapper;
import com.ruoyi.wxcustomer.service.IKhShopInFoService;

/**
* 商家信息
*/
@Service
public class KhShopInFoServiceImpl implements IKhShopInFoService{
	@Autowired
	private KhShopInFoMapper khShopInFoMapper;
	@Override
	public int deleteByPrimaryKey(String id) {
		return khShopInFoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(KhShopInFo record) {
		return khShopInFoMapper.insert(record);
	}

	@Override
	public int insertSelective(KhShopInFo record) {
		return khShopInFoMapper.insertSelective(record);
	}

	@Override
	public KhShopInFo selectByPrimaryKey(String id) {
		return khShopInFoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(KhShopInFo record) {
		return khShopInFoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(KhShopInFo record) {
		return khShopInFoMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<KhShopInFo> selectList(KhShopInFo record) {
		return khShopInFoMapper.selectList(record);
	}

}
