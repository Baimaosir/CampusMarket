package com.example.campusmarket.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;
    private String name;
//    private String phone;
//    private String email;
//    private String city;
//    private Integer gender;
//    private String bankAccount;
//    private Integer role; // 0-普通用户,1-商家,2-管理员
//    private Integer status; // 0-未审核,1-已审核
//    private String businessLicense;
//    private String idCard;
//    private Integer level; // 商家等级
//    private BigDecimal wallet;
//    private Integer points;
}
