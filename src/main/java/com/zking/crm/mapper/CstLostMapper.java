package com.zking.crm.mapper;

import com.zking.crm.model.CstLost;

public interface CstLostMapper {
    int deleteByPrimaryKey(Long lstId);

    int insert(CstLost record);

    int insertSelective(CstLost record);

    CstLost selectByPrimaryKey(Long lstId);

    int updateByPrimaryKeySelective(CstLost record);

    int updateByPrimaryKey(CstLost record);
}