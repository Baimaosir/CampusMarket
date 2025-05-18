package com.example.campusmarket.service;

import com.example.campusmarket.pojo.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(int id);

    void updateProductNob(int id);

    List<Product> getProductByLike(String name, String standard, boolean ascending);

    void updateProductStatus(int id, int status);
    void updateProductStatus();
    Object test(String name);
}
