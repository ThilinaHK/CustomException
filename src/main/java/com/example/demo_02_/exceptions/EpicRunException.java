package com.example.demo_02_.exceptions;

public class EpicRunException extends RuntimeException{

    private final int port;

    public EpicRunException(int port) {
        this.port = port;
    }

    public EpicRunException(String message, int port) {
        super(message);
        this.port = port;
    }
}
