package com.example.demo_02_.exceptions.rest;

import com.example.demo_02_.exceptions.EpicException;
import lombok.Getter;

@Getter
public class UserNameInvalidException extends EpicException {

    private String username = null;

    public UserNameInvalidException(int port, String username) {
        super(port);
        this.username = username;
    }

    public UserNameInvalidException(String message, int port, String username) {
        super(message, port);
        this.username = username;
    }
}
