package com.foo.mongotest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomStoreItemNotFoundException extends RuntimeException {
    private final String storeId;
    private final String itemId;

    public CustomStoreItemNotFoundException(String storeId, String itemId) {
        this.storeId = storeId;
        this.itemId = itemId;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getItemId() {
        return itemId;
    }
}
