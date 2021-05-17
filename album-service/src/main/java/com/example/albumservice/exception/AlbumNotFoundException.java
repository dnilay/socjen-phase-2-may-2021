package com.example.albumservice.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class AlbumNotFoundException extends RuntimeException {

    private String message;

    public AlbumNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
