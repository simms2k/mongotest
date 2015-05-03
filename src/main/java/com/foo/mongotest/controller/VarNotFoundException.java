package com.foo.mongotest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VarNotFoundException extends RuntimeException {
    private final String id;

    public VarNotFoundException(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
