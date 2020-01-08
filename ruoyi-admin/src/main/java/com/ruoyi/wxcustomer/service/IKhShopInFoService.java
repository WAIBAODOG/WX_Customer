/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: Snippet.java
 * @Package com.ruoyi.wxcustomer.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月8日 下午3:10:26
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.service;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhShopInFo;

/**
 * 商家信息
 */
public interface IKhShopInFoService {
	int deleteByPrimaryKey(String id);

	int insert(KhShopInFo record);

	int insertSelective(KhShopInFo record);

	KhShopInFo selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(KhShopInFo record);

	int updateByPrimaryKey(KhShopInFo record);
	
	List<KhShopInFo> selectList(KhShopInFo record);
}
