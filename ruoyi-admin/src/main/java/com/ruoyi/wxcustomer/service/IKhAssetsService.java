package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.KhAssets;
import java.util.List;

/**
 * 资产管理Service接口
 * 
 * @author ruoyi
 * @date 2020-02-09
 */
public interface IKhAssetsService {
    /**
     * 查询资产管理
     * 
     * @param id 资产管理ID
     * @return 资产管理
     */
    public KhAssets selectKhAssetsById(String id);

    /**
     * 查询资产管理列表
     * 
     * @param khAssets 资产管理
     * @return 资产管理集合
     */
    public List<KhAssets> selectKhAssetsList(KhAssets khAssets);

    /**
     * 新增资产管理
     * 
     * @param khAssets 资产管理
     * @return 结果
     */
    public int insertKhAssets(KhAssets khAssets);

    /**
     * 修改资产管理
     * 
     * @param khAssets 资产管理
     * @return 结果
     */
    public int updateKhAssets(KhAssets khAssets);

    /**
     * 批量删除资产管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKhAssetsByIds(String ids);

    /**
     * 删除资产管理信息
     * 
     * @param id 资产管理ID
     * @return 结果
     */
    public int deleteKhAssetsById(String id);
}
