package com.zking.crm.mapper;

import com.zking.crm.model.CstActivity;

public interface CstActivityMapper {
    int deleteByPrimaryKey(Long atvId);

    int insert(CstActivity record);

    int insertSelective(CstActivity record);

    CstActivity selectByPrimaryKey(Long atvId);

    int updateByPrimaryKeySelective(CstActivity record);

    int updateByPrimaryKey(CstActivity record);
}