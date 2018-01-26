package com.zking.crm.mapper;

import com.zking.crm.model.SysRoleRight;

public interface SysRoleRightMapper {
    int deleteByPrimaryKey(Long rfId);

    int insert(SysRoleRight record);

    int insertSelective(SysRoleRight record);

    SysRoleRight selectByPrimaryKey(Long rfId);

    int updateByPrimaryKeySelective(SysRoleRight record);

    int updateByPrimaryKey(SysRoleRight record);
}