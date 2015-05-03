package com.foo.mongotest.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public final class CustomStoreItem {
    @Id
    private String _id;
    private String storeId;
    private String itemId;
    private BigDecimal varMargin;
    private BigDecimal taxRate;

    public String getId() {
        return _id;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getItemId() {
        return itemId;
    }

    public BigDecimal getVarMargin() {
        return varMargin;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }
}
