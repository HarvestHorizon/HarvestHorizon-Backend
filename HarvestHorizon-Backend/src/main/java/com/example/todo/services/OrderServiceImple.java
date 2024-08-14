package com.example.todo.services;

import com.example.todo.Exception.OrderException;
import com.example.todo.model.OrderModel;
import com.example.todo.model.UserModel;
import com.example.todo.repositories.OrderRepo;
import com.example.todo.repositories.CropRepo;
import com.example.todo.repositories.TodoRepository;
import com.example.todo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImple implements OrderService{
    OrderRepo orderrepo;
    public OrderServiceImple(OrderRepo orderrepo ){
        this.orderrepo=orderrepo;
    }
//   private UserModel userModel;
//   @Autowired
//   private OrderModel ordermodel;

    @Override
    public List<OrderModel> getAllOrders() {
        List<OrderModel> o=orderrepo.findAll();
        if(o.size()>0)
            return o;
        else
            throw new OrderException("No orders exists on your account") ;
    }

    @Override
    public UserModel getCustomerByOrderId(Integer id) {
        return null;
    }
    @Override
    public OrderModel getOrderByOrderId(Integer id){
        return orderrepo.findById(id).orElseThrow(()-> new OrderException("No order Exists in this orderid"));
    }
}
