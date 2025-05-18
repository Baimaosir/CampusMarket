//package com.example.campusmarket.controller;
//
//import com.example.campusmarket.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController("/api/order")
//public class OrderController {
//    private final OrderService orderService;
//    @Autowired
//    OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @GetMapping("/oderStatus")
//    public Integer getOrderStatus(@RequestParam int id) {
//        return orderService.getOrderStatus(id);
//    }
//}
