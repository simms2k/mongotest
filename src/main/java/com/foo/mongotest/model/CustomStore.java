package com.foo.mongotest.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.List;

public final class CustomStore {
    @Id
    private String _id;
    private String storeId;
    private BigDecimal b2sMargin;

    public String getId() {
        return _id;
    }

    public String getStoreId() {
        return storeId;
    }

    public BigDecimal getB2sMargin() {
        return b2sMargin;
    }
}
