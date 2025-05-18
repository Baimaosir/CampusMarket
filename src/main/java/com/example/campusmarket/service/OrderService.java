package com.example.campusmarket.service;

import com.example.campusmarket.pojo.Order;

public interface OrderService {

    Integer getOrderStatus(int id);

    Order getById(String id);

}
