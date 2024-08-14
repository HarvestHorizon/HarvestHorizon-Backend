package com.example.todo.services;
import java.util.List;

import com.example.todo.model.LoginDto;
import com.example.todo.model.Todo;
import com.example.todo.model.UserModel;

public interface UserService {
    List<UserModel>  getusers();

    UserModel getUsersById(Integer id);
    UserModel insert(UserModel usermodel);


    public UserModel validateUser(String email_id, String password) throws Exception;



}
