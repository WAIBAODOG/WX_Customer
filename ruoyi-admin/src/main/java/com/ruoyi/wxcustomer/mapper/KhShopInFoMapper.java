package com.ruoyi.wxcustomer.mapper;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhShopInFo;

public interface KhShopInFoMapper {
     
    int deleteByPrimaryKey(String id);

    
    int insert(KhShopInFo record);

    
    int insertSelective(KhShopInFo record);

     
    KhShopInFo selectByPrimaryKey(String id);

     
    int updateByPrimaryKeySelective(KhShopInFo record);
 
    int updateByPrimaryKey(KhShopInFo record);
    
    public List<KhShopInFo> selectList(KhShopInFo record);
}