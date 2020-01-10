/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: IMtService.java
 * @Package com.ruoyi.wxcustomer.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月9日 上午11:31:10
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.service;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;

/**
* @ClassName: IMtService
* @Description: 美团
* @author HuaSheng
* @date 2020年1月9日 上午11:31:10
*
*/
public interface IMeituanService {
	public List<KhShopInFo> search(SearchCondition condition);
}
