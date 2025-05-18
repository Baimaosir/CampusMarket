package com.example.campusmarket.mapper;

import com.example.campusmarket.pojo.ProductComment;

import java.util.List;

public interface ProductCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductComment record);

    ProductComment selectByPrimaryKey(Long id);

    List<ProductComment> selectAll();

    int updateByPrimaryKey(ProductComment record);
}
