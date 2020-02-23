package com.ruoyi.wxcustomer.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.wxcustomer.domain.KhAssets;
import com.ruoyi.wxcustomer.domain.KhAssetsDetail;
import com.ruoyi.wxcustomer.mapper.KhAssetsDetailMapper;
import com.ruoyi.wxcustomer.mapper.KhAssetsMapper;
import com.ruoyi.wxcustomer.service.IKhAssetsService;

/**
 * 资产管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-09
 */
@Service
public class KhAssetsServiceImpl implements IKhAssetsService {
    @Autowired
    private KhAssetsMapper khAssetsMapper;
    @Autowired
    private KhAssetsDetailMapper khAssetsDetailMapper;

    /**
     * 查询资产管理
     * 
     * @param id 资产管理ID
     * @return 资产管理
     */
    @Override
    public KhAssets selectKhAssetsById(String id){
    	KhAssets assets=khAssetsMapper.selectKhAssetsById(id);
    	List<KhAssetsDetail> detailList=khAssetsDetailMapper.selectByAssetId(id);
    	assets.setDetailList(detailList);
    	return assets;
    }

    /**
     * 查询资产管理列表
     * 
     * @param khAssets 资产管理
     * @return 资产管理
     */
    @Override
    public List<KhAssets> selectKhAssetsList(KhAssets khAssets){
        return khAssetsMapper.selectKhAssetsList(khAssets);
    }

    /**
     * 新增资产管理
     * 
     * @param khAssets 资产管理
     * @return 结果
     */
    @Override
    @Transactional
    public int insertKhAssets(KhAssets khAssets){
    	String assetId=UUID.randomUUID().toString().replace("-", "");
    	try {
    		khAssets.setId(assetId);
        	khAssetsMapper.insertKhAssets(khAssets);
        	List<KhAssetsDetail> recordList=khAssets.getDetailList();
        	for(int i=0;i<recordList.size();i++) {
        		String dId=UUID.randomUUID().toString().replace("-", "");
        		recordList.get(i).setId(dId);
        		recordList.get(i).setAssetsId(assetId);
        		khAssetsDetailMapper.insert(recordList.get(i));
        	}
		} catch (Exception e) {
			return 0;
		}
        return 1;
    }

    /**
     * 修改资产管理
     * 
     * @param khAssets 资产管理
     * @return 结果
     */
    @Override
    @Transactional
    public int updateKhAssets(KhAssets khAssets){
    	List<KhAssetsDetail> recordList=khAssets.getDetailList();
    	for(int i=0;i<recordList.size();i++) {
    		khAssetsDetailMapper.updateByPrimaryKey(recordList.get(i));
    	}
        return khAssetsMapper.updateKhAssets(khAssets);
    }

    /**
     * 删除资产管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    @Transactional
    public int deleteKhAssetsByIds(String ids){
    	 
    	khAssetsDetailMapper.deleteByKhAssetIds(Convert.toStrArray(ids));
        return khAssetsMapper.deleteKhAssetsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除资产管理信息
     * 
     * @param id 资产管理ID
     * @return 结果
     */
    @Override
    @Transactional
    public int deleteKhAssetsById(String id){
    	khAssetsDetailMapper.deleteByKhAssetId(id);
        return khAssetsMapper.deleteKhAssetsById(id);
    }
}
