package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException n(String message) {super(message);}
}