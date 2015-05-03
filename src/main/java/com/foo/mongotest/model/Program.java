package com.foo.mongotest.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.List;

public final class Program {
    @Id
    private String _id;
    private String varId;
    private String programId;
    private String conversionRate;
    private BigDecimal varMargin;
    private BigDecimal b2sMargin;
    private BigDecimal varTaxRate;
    private BigDecimal b2sTaxRate;
    private List<Supplier> suppliers;
    private List<Product> products;

    public String getId() {
        return _id;
    }

    public String getVarId() {
        return varId;
    }

    public String getProgramId() {
        return programId;
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

    public BigDecimal getVarTaxRate() {
        return varTaxRate;
    }

    public BigDecimal getB2sTaxRate() {
        return b2sTaxRate;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public List<Product> getProducts() {
        return products;
    }
}
