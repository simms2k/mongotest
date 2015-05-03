package com.foo.mongotest.model;

import org.joda.money.BigMoney;
import org.joda.money.Money;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public final class Supplier {
    @Id
    private String id;
    private String conversionRate;
    private BigDecimal varMargin;
    private BigDecimal b2sMargin;
    private String b2sOnlineFee;
    private String b2sOfflineFee;

    public String getId() {
        return id;
    }

    public String getConversionRate() {
        return conversionRate;
    }

    public BigDecimal getVarMargin() {
        return varMargin;
    }

    public BigDecimal getB2sMargin() {
        return b2sMargin;
    }

    public String getB2sOnlineFee() {
        return b2sOnlineFee;
    }

    public String getB2sOfflineFee() {
        return b2sOfflineFee;
    }
}
