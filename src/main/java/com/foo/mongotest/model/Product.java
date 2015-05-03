package com.foo.mongotest.model;

import org.joda.money.Money;
import org.springframework.data.annotation.Id;

public final class Product {
    @Id
    private String psid;
    private String varPrice;
    private String b2sPrice;
    private int pointsPrice;

    public String getPsid() {
        return psid;
    }

    public String getVarPrice() {
        return varPrice;
    }

    public String getB2sPrice() {
        return b2sPrice;
    }

    public int getPointsPrice() {
        return pointsPrice;
    }
}
