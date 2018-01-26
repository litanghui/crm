package com.zking.crm.mapper;

import com.zking.crm.model.OrdersLine;

public interface OrdersLineMapper {
    int insert(OrdersLine record);

    int insertSelective(OrdersLine record);
}