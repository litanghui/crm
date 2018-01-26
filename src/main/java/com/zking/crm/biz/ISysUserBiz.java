package com.zking.crm.biz;

import com.zking.crm.model.SysUser;

import java.util.List;

/**
 * Created by Asus on 2018/1/25.
 */
public interface ISysUserBiz {

    List<SysUser> listSysUser(SysUser sysUser);

    //用户注册
    void addSysUser(SysUser sysUser);

    //用户登录
    SysUser loginSysUser(SysUser sysUser);

    void delSysUser(SysUser sysUser);

    void updateSysUser(SysUser sysUse);

}
