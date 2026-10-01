package com.example.demo.exception;

public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException n(String message) {super(message);}
}
