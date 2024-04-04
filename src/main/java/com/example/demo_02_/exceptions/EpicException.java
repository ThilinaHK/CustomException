package com.example.demo_02_.exceptions;

public class EpicException extends Exception {

    private final int port;

    public EpicException(int port) {
        this.port = port;
    }

    public EpicException(String message, int port) {
        super(message);
        this.port = port;
    }
}
