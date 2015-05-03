package com.foo.mongotest.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.List;

public final class CustomStore {
    @Id
    private String id;
    private BigDecimal b2sMargin;
    private List<CustomItem> items;
}
