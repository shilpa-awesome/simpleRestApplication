package com.example.allica.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity handleUserNotFoundException(CustomerNotFoundException ex) {
        MultiValueMap<String, String> val = new LinkedMultiValueMap<>();
        val.add("Error", ex.getMessage());
        val.add("Status", HttpStatus.NO_CONTENT+"");
        return new ResponseEntity<>(ex.getMessage(),val, HttpStatus.NO_CONTENT);
    }
}