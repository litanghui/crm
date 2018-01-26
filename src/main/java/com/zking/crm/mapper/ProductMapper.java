package com.zking.crm.mapper;

import com.zking.crm.model.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}