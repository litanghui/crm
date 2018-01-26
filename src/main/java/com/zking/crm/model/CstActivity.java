package com.zking.crm.model;

import java.util.Date;


//交往记录表
public class CstActivity {
    private Long atvId;//交往记录ID

    private String atvCustNo;//客户编号，外键

    private String atvCustName;//客户名称

    private Date atvDate;//交往日期

    private String atvPlace;//交往地点

    private String atvTitle;//概要

    private String atvRemark;//备注

    private String atvDesc;//详细

    public CstActivity(Long atvId, String atvCustNo, String atvCustName, Date atvDate, String atvPlace, String atvTitle, String atvRemark, String atvDesc) {
        this.atvId = atvId;
        this.atvCustNo = atvCustNo;
        this.atvCustName = atvCustName;
        this.atvDate = atvDate;
        this.atvPlace = atvPlace;
        this.atvTitle = atvTitle;
        this.atvRemark = atvRemark;
        this.atvDesc = atvDesc;
    }

    public CstActivity() {
        super();
    }

    public Long getAtvId() {
        return atvId;
    }

    public void setAtvId(Long atvId) {
        this.atvId = atvId;
    }

    public String getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(String atvCustNo) {
        this.atvCustNo = atvCustNo;
    }

    public String getAtvCustName() {
        return atvCustName;
    }

    public void setAtvCustName(String atvCustName) {
        this.atvCustName = atvCustName;
    }

    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace;
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle;
    }

    public String getAtvRemark() {
        return atvRemark;
    }

    public void setAtvRemark(String atvRemark) {
        this.atvRemark = atvRemark;
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc;
    }
}