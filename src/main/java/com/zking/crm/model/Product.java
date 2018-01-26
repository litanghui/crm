package com.zking.crm.model;

import java.math.BigDecimal;

//产品信息表
public class Product {
    private Long prodId;//产品ID 主键，标识列

    private String prodName;//产品名称

    private String prodType;//产品型号

    private String prodBatch;//等级/批次

    private String prodUnit;//单位

    private BigDecimal prodPrice;//单价

    private String prodMemo;//备注

    public Product(Long prodId, String prodName, String prodType, String prodBatch, String prodUnit, BigDecimal prodPrice, String prodMemo) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodBatch = prodBatch;
        this.prodUnit = prodUnit;
        this.prodPrice = prodPrice;
        this.prodMemo = prodMemo;
    }

    public Product() {
        super();
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdBatch() {
        return prodBatch;
    }

    public void setProdBatch(String prodBatch) {
        this.prodBatch = prodBatch;
    }

    public String getProdUnit() {
        return prodUnit;
    }

    public void setProdUnit(String prodUnit) {
        this.prodUnit = prodUnit;
    }

    public BigDecimal getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdMemo() {
        return prodMemo;
    }

    public void setProdMemo(String prodMemo) {
        this.prodMemo = prodMemo;
    }
}