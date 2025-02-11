package com.example.allica.demo.exception;

public class CustomerNotFoundException extends RuntimeException {
      public CustomerNotFoundException(String customerNotFound) {
        super(customerNotFound);
    }
}
