package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISysUserBiz;
import com.zking.crm.mapper.SysUserMapper;
import com.zking.crm.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserBizImpl implements ISysUserBiz {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override

    public List<SysUser> listSysUser(SysUser sysUser) {
        return sysUserMapper.listSysUser(sysUser);
    }

    @Override
    public void addSysUser(SysUser sysUser) {
        sysUserMapper.insert(sysUser);;

    }

    @Override
    public SysUser loginSysUser(SysUser sysUser) {

        return sysUserMapper.selectByPrimaryKey(sysUser.getUsrId());
    }

    @Override
    public void delSysUser(SysUser sysUser) {
        sysUserMapper.deleteByPrimaryKey(sysUser.getUsrId());

    }

    @Override
    public void updateSysUser(SysUser sysUser) {
        sysUserMapper.updateByPrimaryKey(sysUser);

    }
}
