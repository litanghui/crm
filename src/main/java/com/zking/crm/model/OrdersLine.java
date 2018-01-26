package com.zking.crm.model;

import java.math.BigDecimal;

//订单明细表
public class OrdersLine {
    private Long oddId;//订单明细ID,主键标识列

    private Long oddOrderId;//订单ID orders

    private Long oddProdId;//产品ID product

    private Integer oddCount;//数量

    private String oddUnit;//单位

    private BigDecimal oddPrice;//单价

    private BigDecimal sum;//总金额



    public OrdersLine(Long oddId, Long oddOrderId, Long oddProdId, Integer oddCount, String oddUnit, BigDecimal oddPrice, BigDecimal sum) {
        this.oddId = oddId;
        this.oddOrderId = oddOrderId;
        this.oddProdId = oddProdId;
        this.oddCount = oddCount;
        this.oddUnit = oddUnit;
        this.oddPrice = oddPrice;
        this.sum = sum;
    }

    public OrdersLine() {
        super();
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Long getOddId() {
        return oddId;
    }

    public void setOddId(Long oddId) {
        this.oddId = oddId;
    }

    public Long getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(Long oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public Long getOddProdId() {
        return oddProdId;
    }

    public void setOddProdId(Long oddProdId) {
        this.oddProdId = oddProdId;
    }

    public Integer getOddCount() {
        return oddCount;
    }

    public void setOddCount(Integer oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit;
    }

    public BigDecimal getOddPrice() {
        return oddPrice;
    }

    public void setOddPrice(BigDecimal oddPrice) {
        this.oddPrice = oddPrice;
    }
}