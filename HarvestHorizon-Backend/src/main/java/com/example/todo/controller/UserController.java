package com.example.todo.controller;


import com.example.todo.model.LoginDto;
import com.example.todo.model.UserModel;

import com.example.todo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userservice;
    @PostMapping("/register")
    public ResponseEntity<UserModel> saveuser(@RequestBody UserModel users) {

        UserModel usermodel1 = userservice.insert(users);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("User", "/api/v1/user");
        return new ResponseEntity<>(usermodel1, httpHeaders, HttpStatus.CREATED);

    }

    @GetMapping("/users")
    public ResponseEntity<List<UserModel>> getAllUsers() {
        List<UserModel> use = userservice.getusers();
        return new ResponseEntity<>(use, HttpStatus.ACCEPTED);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<UserModel> updateusers(@PathVariable("id") Integer id, @RequestBody UserModel users) {
//        userservice.updateUserModel(id, users);
//        return new ResponseEntity<>(userservice.getUsersById(id), HttpStatus.OK);
//    }





    @PostMapping("/login")
    public ResponseEntity<UserModel> login(@RequestBody LoginDto loginDto) throws Exception {
        UserModel user = userservice.validateUser(loginDto.getEmail_id(), loginDto.getPassword());
//        return user;
//        if (user) {
//           return "login succesfull";
//
//        } else {
//            return "Invalid username or password";
//        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Login", "/api/v1/user/login");
        return new ResponseEntity<>(user, httpHeaders, HttpStatus.ACCEPTED); //ACCEPTED
    }
}



