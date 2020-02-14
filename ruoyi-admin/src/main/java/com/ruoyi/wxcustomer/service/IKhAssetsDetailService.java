package com.ruoyi.wxcustomer.service;

import com.ruoyi.wxcustomer.domain.KhAssetsDetail;

public interface IKhAssetsDetailService {
    
    int deleteByPrimaryKey(String id);
 
    int insert(KhAssetsDetail record);

     
    int insertSelective(KhAssetsDetail record);

   
    KhAssetsDetail selectByPrimaryKey(String id);
 
    int updateByPrimaryKeySelective(KhAssetsDetail record);
     
    int updateByPrimaryKey(KhAssetsDetail record);
}