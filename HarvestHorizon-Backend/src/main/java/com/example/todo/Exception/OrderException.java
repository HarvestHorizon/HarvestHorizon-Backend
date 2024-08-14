package com.example.todo.Exception;

public class OrderException extends RuntimeException{
    public OrderException(){

    }
    public OrderException(String message){
        super(message);
    }
}
