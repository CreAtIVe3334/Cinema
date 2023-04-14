package com.example.cinema.exceptions;

public class BuyException extends RuntimeException{
    String message;

    public BuyException(String message){
        super(message);
        this.message=message;
    }
}
