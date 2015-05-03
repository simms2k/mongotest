package com.foo.mongotest.model;

import org.joda.money.Money;
import org.springframework.data.annotation.Id;

public final class Product {
    @Id
    private String _id;
    private String varId;
    private String programId;
    private String psid;
    private String varPrice;
    private String b2sPrice;
    private int pointsPrice;

    public String getId() {
        return _id;
    }

    public String getVarId() {
        return varId;
    }

    public String getProgramId() {
        return programId;
    }

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
