package com.example.todo.controller;

import com.example.todo.model.OrderModel;
import com.example.todo.model.UserModel;
import com.example.todo.services.CropService;
import com.example.todo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderservice;
    public OrderController(OrderService orderservice) {
        this.orderservice = orderservice;
    }
    @GetMapping("/order")
    public List<OrderModel> getAllOrders(){
        List<OrderModel> l=orderservice.getAllOrders();
    return l;}
    @GetMapping("/orders/{orderid}")
    public OrderModel getOrderByOrderId(@PathVariable("orderid") Integer id){
        return orderservice.getOrderByOrderId(id);
    }
    @GetMapping("/user/{orderid}")
    public UserModel getCustomerByOrderId(@PathVariable ("orderid") Integer id){
            return orderservice.getCustomerByOrderId(id);

    }
}
