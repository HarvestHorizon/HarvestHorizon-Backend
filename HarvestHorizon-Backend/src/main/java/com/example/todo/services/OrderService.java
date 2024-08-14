package com.example.todo.services;
import com.example.todo.model.OrderModel;
import com.example.todo.model.UserModel;

import java.util.List;
public interface OrderService {
    public OrderModel getOrderByOrderId(Integer id);
    public List<OrderModel> getAllOrders();
    public UserModel getCustomerByOrderId(Integer id);


}
