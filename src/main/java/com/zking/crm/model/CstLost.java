package com.zking.crm.model;

import java.util.Date;

//客户流失表
public class CstLost {
    private Long lstId;

    private String lstCustNo;//客户编号

    private String lstCustName;//客户名称

    private Long lstCustManagerId;//客户经理编号

    private String lstCustManagerName;//客户经理名称

    private Date lstLastOrderDate;//上次下单时间

    private Date lstLostDate;//流失时间

    private String lstDelay;//暂缓措施

    private String lstReason;//流失原因

    private String lstStatus;//状态：1预警 2暂缓流失 3确认流失

    public CstLost(Long lstId, String lstCustNo, String lstCustName, Long lstCustManagerId, String lstCustManagerName, Date lstLastOrderDate, Date lstLostDate, String lstDelay, String lstReason, String lstStatus) {
        this.lstId = lstId;
        this.lstCustNo = lstCustNo;
        this.lstCustName = lstCustName;
        this.lstCustManagerId = lstCustManagerId;
        this.lstCustManagerName = lstCustManagerName;
        this.lstLastOrderDate = lstLastOrderDate;
        this.lstLostDate = lstLostDate;
        this.lstDelay = lstDelay;
        this.lstReason = lstReason;
        this.lstStatus = lstStatus;
    }

    public CstLost() {
        super();
    }

    public Long getLstId() {
        return lstId;
    }

    public void setLstId(Long lstId) {
        this.lstId = lstId;
    }

    public String getLstCustNo() {
        return lstCustNo;
    }

    public void setLstCustNo(String lstCustNo) {
        this.lstCustNo = lstCustNo;
    }

    public String getLstCustName() {
        return lstCustName;
    }

    public void setLstCustName(String lstCustName) {
        this.lstCustName = lstCustName;
    }

    public Long getLstCustManagerId() {
        return lstCustManagerId;
    }

    public void setLstCustManagerId(Long lstCustManagerId) {
        this.lstCustManagerId = lstCustManagerId;
    }

    public String getLstCustManagerName() {
        return lstCustManagerName;
    }

    public void setLstCustManagerName(String lstCustManagerName) {
        this.lstCustManagerName = lstCustManagerName;
    }

    public Date getLstLastOrderDate() {
        return lstLastOrderDate;
    }

    public void setLstLastOrderDate(Date lstLastOrderDate) {
        this.lstLastOrderDate = lstLastOrderDate;
    }

    public Date getLstLostDate() {
        return lstLostDate;
    }

    public void setLstLostDate(Date lstLostDate) {
        this.lstLostDate = lstLostDate;
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay;
    }

    public String getLstReason() {
        return lstReason;
    }

    public void setLstReason(String lstReason) {
        this.lstReason = lstReason;
    }

    public String getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(String lstStatus) {
        this.lstStatus = lstStatus;
    }
}