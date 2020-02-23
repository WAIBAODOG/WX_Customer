package com.ruoyi.wxcustomer.mapper;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhAssetsDetail;

public interface KhAssetsDetailMapper {

	int deleteByPrimaryKey(String id);

	int insert(KhAssetsDetail record);

	int insertSelective(KhAssetsDetail record);

	KhAssetsDetail selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(KhAssetsDetail record);

	int updateByPrimaryKey(KhAssetsDetail record);

	List<KhAssetsDetail> selectByAssetId(String id);

	void deleteByKhAssetIds(String[] ids);

	void deleteByKhAssetId(String id);
}