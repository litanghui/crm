package com.zking.crm.model;

// 库存表
public class Storage {
    private Long stkId;//库存ID 主键标识列

    private Long stkProdId;//产品ID 引用外键

    private String stkWarehouse;//仓库

    private String stkWare;//货位

    private Integer stkCount;//件数

    private String stkMemo;//备注

    public Storage(Long stkId, Long stkProdId, String stkWarehouse, String stkWare, Integer stkCount, String stkMemo) {
        this.stkId = stkId;
        this.stkProdId = stkProdId;
        this.stkWarehouse = stkWarehouse;
        this.stkWare = stkWare;
        this.stkCount = stkCount;
        this.stkMemo = stkMemo;
    }

    public Storage() {
        super();
    }

    public Long getStkId() {
        return stkId;
    }

    public void setStkId(Long stkId) {
        this.stkId = stkId;
    }

    public Long getStkProdId() {
        return stkProdId;
    }

    public void setStkProdId(Long stkProdId) {
        this.stkProdId = stkProdId;
    }

    public String getStkWarehouse() {
        return stkWarehouse;
    }

    public void setStkWarehouse(String stkWarehouse) {
        this.stkWarehouse = stkWarehouse;
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare;
    }

    public Integer getStkCount() {
        return stkCount;
    }

    public void setStkCount(Integer stkCount) {
        this.stkCount = stkCount;
    }

    public String getStkMemo() {
        return stkMemo;
    }

    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo;
    }
}