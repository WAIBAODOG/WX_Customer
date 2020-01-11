/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: IAmapService.java
 * @Package com.ruoyi.wxcustomer.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月10日 下午9:12:10
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.service;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;

/**
* @ClassName: IAmapService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author HuaSheng
* @date 2020年1月10日 下午9:12:10
*
*/
public interface IAmapService {
	public List<KhShopInFo> search(SearchCondition condition);
}
