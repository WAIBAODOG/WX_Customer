package com.ruoyi.wxcustomer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wxcustomer.mapper.KhAssetsMapper;
import com.ruoyi.wxcustomer.domain.KhAssets;
import com.ruoyi.wxcustomer.service.IKhAssetsService;
import com.ruoyi.common.core.text.Convert;

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

    /**
     * 查询资产管理
     * 
     * @param id 资产管理ID
     * @return 资产管理
     */
    @Override
    public KhAssets selectKhAssetsById(String id){
        return khAssetsMapper.selectKhAssetsById(id);
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
    public int insertKhAssets(KhAssets khAssets){
        return khAssetsMapper.insertKhAssets(khAssets);
    }

    /**
     * 修改资产管理
     * 
     * @param khAssets 资产管理
     * @return 结果
     */
    @Override
    public int updateKhAssets(KhAssets khAssets){
        return khAssetsMapper.updateKhAssets(khAssets);
    }

    /**
     * 删除资产管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKhAssetsByIds(String ids){
        return khAssetsMapper.deleteKhAssetsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除资产管理信息
     * 
     * @param id 资产管理ID
     * @return 结果
     */
    @Override
    public int deleteKhAssetsById(String id){
        return khAssetsMapper.deleteKhAssetsById(id);
    }
}
