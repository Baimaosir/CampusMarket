package com.example.campusmarket.mapper;

import com.example.campusmarket.pojo.Product;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    Product selectByPrimaryKey(Long id);

    List<Product> selectAll();

    void updateNobByPrimaryKey(Long id , int nob);

    void updateProductStatusByPrimaryKey(int id, int status);

    void updateProductStatus();

    Object test(String name);

    List<Product> selectByLikeName(String name, String standard, boolean ascending);
}
