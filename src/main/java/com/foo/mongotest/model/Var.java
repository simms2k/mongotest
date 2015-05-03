package com.foo.mongotest.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public final class Var {

    public enum ConversionRateType { BY_PROGRAM, BY_SUPPLIER }

    @Id
    private String _id;
    private String varId;
    private ConversionRateType conversionRateType;
    private List<Program> programs;

    public String getId() {
        return _id;
    }

    public String getVarId() {
        return varId;
    }

    public ConversionRateType getConversionRateType() {
        return conversionRateType;
    }

    public List<Program> getPrograms() {
        return programs;
    }
}
