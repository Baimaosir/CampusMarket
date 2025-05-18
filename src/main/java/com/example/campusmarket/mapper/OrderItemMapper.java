package com.example.campusmarket.mapper;

import com.example.campusmarket.pojo.OrderItem;

import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderItem record);

    OrderItem selectByPrimaryKey(Long id);

    List<OrderItem> selectAll();

    int updateByPrimaryKey(OrderItem record);
}
