package com.zking.crm.model;

//角色权限表
public class SysRoleRight {
    private Long rfId;//主键标识列

    private Long rfRoleId;//角色ID,引用外键

    private String rfRightCode;//权限ID,引用外键

    public SysRoleRight(Long rfId, Long rfRoleId, String rfRightCode) {
        this.rfId = rfId;
        this.rfRoleId = rfRoleId;
        this.rfRightCode = rfRightCode;
    }

    public SysRoleRight() {
        super();
    }

    public Long getRfId() {
        return rfId;
    }

    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }

    public Long getRfRoleId() {
        return rfRoleId;
    }

    public void setRfRoleId(Long rfRoleId) {
        this.rfRoleId = rfRoleId;
    }

    public String getRfRightCode() {
        return rfRightCode;
    }

    public void setRfRightCode(String rfRightCode) {
        this.rfRightCode = rfRightCode;
    }
}