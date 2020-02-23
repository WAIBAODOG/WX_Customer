package com.ruoyi.wxcustomer.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.framework.web.service.PermissionService;
import com.ruoyi.system.domain.SysRole;
import com.ruoyi.system.service.ISysRoleService;

@Service
public class RoleDataService {
	
	private static String LAST_STR = "_";
	
	@Autowired
	private ISysRoleService sysRoleService;
	
	@Autowired
	private PermissionService permissionService;
	
	/**
	 * 根据用户id获取用户的角色权限用户Id
	 * @param userId
	 * @return
	 */
	public Set<Long> getRoleData(Long userId) {
		List<SysRole> roles = sysRoleService.selectRolesByUid(userId);
		Set<Long> returnUserIds = new HashSet<>();
		for (SysRole sysRole : roles) {
			String roleKey = sysRole.getRoleKey();
			String lastStr = roleKey.substring(roleKey.length() - 1, roleKey.length());
			if(LAST_STR.equals(lastStr)) {
				returnUserIds.add(userId);
			} else {
				returnUserIds.add(userId);
				Set<Long> roleUserIds = sysRoleService.selectLikeRoleKey(roleKey);
				if(roleUserIds != null && roleUserIds.size() != 0) {
					returnUserIds.addAll(roleUserIds);
				}
			}
		}
		return returnUserIds;
	}
	
	/**
	 * 根据当前用户获取用户的角色权限用户Id
	 * @return
	 */
	public Set<Long> getRoleDataByCurrentUser() {
		boolean isAdmin = permissionService.isRole("admin");
		Set<Long> returnUserIds = new HashSet<>();
		if(!isAdmin) {
			Long userId = ShiroUtils.getUserId();
			return getRoleData(userId);
		}
		return returnUserIds;
	}
	
	/**
	 * 根据当前用户获取用户的角色权限用户Id
	 * @return
	 */
	public String getRoleData() {
		Set<Long> set = getRoleDataByCurrentUser();
		if(set == null || set.size() == 0) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for (Long id : set) {
			sb.append("," +  id);
		}
		return sb.toString().replaceFirst(",", "");
	}
}
