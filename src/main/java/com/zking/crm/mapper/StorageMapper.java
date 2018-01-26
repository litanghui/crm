package com.zking.crm.mapper;

import com.zking.crm.model.Storage;

public interface StorageMapper {
    int insert(Storage record);

    int insertSelective(Storage record);
}