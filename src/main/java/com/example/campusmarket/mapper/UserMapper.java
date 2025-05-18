package com.example.campusmarket.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.campusmarket.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // 在这里可以添加自定义的SQL操作方法
    // 例如：
    @Select("SELECT * FROM user WHERE username = #{username}")
    User selectByUsername(String username);


}