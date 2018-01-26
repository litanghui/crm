package com.zking.crm.model;

//数据字典表
public class BasDict {
    private Long dictId;//字典ID，主键，标识列

    private String dictType;//字典类型

    private String dictItem;//字典条目：一般用来生成下拉框的文本

    private String dictValue;//字典值:一般用来生成下拉框的值

    private Boolean dictIsEditable;//能否编辑 1可以 0不可以

    public BasDict(Long dictId, String dictType, String dictItem, String dictValue, Boolean dictIsEditable) {
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictItem = dictItem;
        this.dictValue = dictValue;
        this.dictIsEditable = dictIsEditable;
    }

    public BasDict() {
        super();
    }

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Boolean getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Boolean dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }
}