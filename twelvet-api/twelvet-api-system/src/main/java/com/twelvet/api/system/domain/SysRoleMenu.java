package com.twelvet.api.system.domain;

import io.swagger.v3.oas.annotations.media.Schema;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author twelvet
 * @WebSite www.twelvet.cn
 * @Description: 角色和菜单关联 sys_role_menu
 */
@Schema(description = "角色和菜单关联")
public class SysRoleMenu {

	/** 角色ID */
	@Schema(description = "角色ID")
	private Long roleId;

	/** 菜单ID */
	@Schema(description = "菜单ID")
	private Long menuId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("roleId", getRoleId())
				.append("menuId", getMenuId()).toString();
	}

}