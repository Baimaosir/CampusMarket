package com.example.campusmarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.campusmarket.entity.User;
import com.example.campusmarket.mapper.UserMapper;
import com.example.campusmarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserseviceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    UserseviceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    @Transactional
    public boolean login(String username, String password) {
        User user = userMapper.selectByUsername(username);
        if (user == null) {
            return false; // 用户名不存在
        }
        if (!user.getPassword().equals(password)) {
            return false; // 密码错误
        }
        return true; // 登录成功
    }


    @Override
    @Transactional
    public void register(User user) {
        // 检查用户名是否已存在
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername()); // 修改字段名称
        User existingUser = userMapper.selectOne(queryWrapper);
        if (existingUser != null) {
            throw new RuntimeException("用户名已存在");
        }
        // 注册新用户
        userMapper.insert(user);
    }




}
