package com.example.todo.services;

import com.example.todo.model.UserModel;
import com.example.todo.repositories.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class Harvest {
    UserRepo userepo;
    public  UserModel insert (UserModel us){
    return userepo.save(us);}
}