package com.twelvet.api.system.domain;

import io.swagger.v3.oas.annotations.media.Schema;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author twelvet
 * @WebSite www.twelvet.cn
 * @Description: 角色和部门关联 sys_role_dept
 */
@Schema(description = "角色和部门关联")
public class SysRoleDept {

	/** 角色ID */
	@Schema(description = "角色ID")
	private Long roleId;

	/** 部门ID */
	@Schema(description = "部门ID")
	private Long deptId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("roleId", getRoleId())
				.append("deptId", getDeptId()).toString();
	}

}