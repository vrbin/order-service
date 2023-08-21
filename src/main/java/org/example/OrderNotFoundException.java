package org.example;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String msg) {
        super(msg);
    }
}