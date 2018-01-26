package com.zking.crm.model;

import java.util.Date;

//营销计划表
public class SalPlan {
    private Long plaId;//计划ID 主键标识列

    private Long plaChcId;//营销机会ID 引用外键

    private Date plaDate;//计划执行日期

    private String plaTodo;//计划内容

    private String plaResult;//计划执行结果

    public SalPlan(Long plaId, Long plaChcId, Date plaDate, String plaTodo, String plaResult) {
        this.plaId = plaId;
        this.plaChcId = plaChcId;
        this.plaDate = plaDate;
        this.plaTodo = plaTodo;
        this.plaResult = plaResult;
    }

    public SalPlan() {
        super();
    }

    public Long getPlaId() {
        return plaId;
    }

    public void setPlaId(Long plaId) {
        this.plaId = plaId;
    }

    public Long getPlaChcId() {
        return plaChcId;
    }

    public void setPlaChcId(Long plaChcId) {
        this.plaChcId = plaChcId;
    }

    public Date getPlaDate() {
        return plaDate;
    }

    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    public String getPlaTodo() {
        return plaTodo;
    }

    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo;
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult;
    }
}