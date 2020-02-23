package com.ruoyi.wxcustomer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.wxcustomer.domain.KhAssetsDetail;
import com.ruoyi.wxcustomer.mapper.KhAssetsDetailMapper;
import com.ruoyi.wxcustomer.service.IKhAssetsDetailService;

@Service
public class KhAssetsDetailServiceImpl implements IKhAssetsDetailService {
	@Autowired
	private KhAssetsDetailMapper khAssetsDetailMapper;

	public int deleteByPrimaryKey(String id) {
		return khAssetsDetailMapper.deleteByPrimaryKey(id);
	}

	public int insert(KhAssetsDetail record) {
		return khAssetsDetailMapper.insert(record);
	}

	public int insertSelective(KhAssetsDetail record) {
		return khAssetsDetailMapper.insertSelective(record);
	}

	public KhAssetsDetail selectByPrimaryKey(String id) {
		return khAssetsDetailMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(KhAssetsDetail record) {
		return 0;
	}

	public int updateByPrimaryKey(KhAssetsDetail record) {
		return 0;
	}
}