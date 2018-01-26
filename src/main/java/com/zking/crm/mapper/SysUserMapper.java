package com.zking.crm.mapper;

import com.zking.crm.model.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {

    //删除用户
    int deleteByPrimaryKey(Long usrId);

    //注册
    int insert(SysUser record);

    int insertSelective(SysUser record);

    //登陆，查单个
    SysUser selectByPrimaryKey(Long usrId);

    int updateByPrimaryKeySelective(SysUser record);

    //更新用户
    int updateByPrimaryKey(SysUser record);

    List<SysUser> listSysUser(SysUser sysUser);

}