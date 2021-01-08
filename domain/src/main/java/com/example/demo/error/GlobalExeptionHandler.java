package com.example.demo.error;

public class GlobalExeptionHandler extends Exception {

    private static final long serialVersionUID = 1L;

    public GlobalExeptionHandler(String message, int errCode) {
        super("ERROR: " + message + "with error code: " + errCode);
    }
    
}
