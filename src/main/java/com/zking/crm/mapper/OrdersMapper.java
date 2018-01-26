package com.zking.crm.mapper;

import com.zking.crm.model.Orders;

public interface OrdersMapper {
    int insert(Orders record);

    int insertSelective(Orders record);
}