/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: ISearchInFoService.java
 * @Package com.ruoyi.wxcustomer.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月7日 下午4:01:35
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.service;

import java.util.List;

import com.ruoyi.wxcustomer.domain.KhShopInFo;
import com.ruoyi.wxcustomer.domain.common.SearchCondition;

/**
* @ClassName: ISearchInFoService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author HuaSheng
* @date 2020年1月7日 下午4:01:35
*
*/
public interface ISearchInFoService {
	/**
	 * 抓取信息
	 */
	public List<KhShopInFo>  search(SearchCondition condition);
}
