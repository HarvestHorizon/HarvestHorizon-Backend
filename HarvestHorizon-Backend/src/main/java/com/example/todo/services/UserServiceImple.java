package com.example.todo.services;

import com.example.todo.model.Todo;
import com.example.todo.model.UserModel;
import com.example.todo.repositories.TodoRepository;
import com.example.todo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImple implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public UserModel insert(UserModel user) {
        return userRepo.save(user);
    }

    public List<UserModel> findAll(Integer id) {
        return null;
    }

    @Override
    public List<UserModel> getusers() {
        List<UserModel> us = new ArrayList<>();
        userRepo.findAll().forEach(us::add);
        return us;
    }

    @Override
    public UserModel getUsersById(Integer id) {

        return userRepo.findById(id).get();
    }

    @Override
    public UserModel validateUser(String email_id, String password) throws Exception {
        UserModel user = userRepo.findUserByEmail(email_id);
        if (user == null) {
            throw new Exception("User not found");
        }
        if (user.getPassword().equals(password)) {
            return user;
        } else {
            throw new Exception("User not found");
        }
    }
}

