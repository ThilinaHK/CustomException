package com.example.demo_02_.exceptions.rest;

import com.example.demo_02_.exceptions.EpicRunException;
import lombok.Getter;

@Getter
public class ForeingKeyNotFound extends EpicRunException {
    private final String fk;

    public ForeingKeyNotFound(int port, String fk) {
        super(port);
        this.fk = fk;
    }

    public ForeingKeyNotFound(String message, int port, String fk) {
        super(message, port);
        this.fk = fk;
    }


}
