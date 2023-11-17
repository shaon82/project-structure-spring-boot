package com.shaon.highscalatondemo.exceptionHandle;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
