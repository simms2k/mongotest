package com.foo.mongotest.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public final class CustomItem {
    @Id
    private String id;
    private BigDecimal varMargin;
    private BigDecimal taxRate;
}
