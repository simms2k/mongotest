package com.foo.mongotest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SupplierNotFoundException extends RuntimeException {
    private final String varId;
    private final String programId;
    private final String supplierId;

    public SupplierNotFoundException(final String varId, final String programId, final String supplierId) {
        this.varId = varId;
        this.programId = programId;
        this.supplierId = supplierId;
    }


    public String getVarId() {
        return varId;
    }

    public String getProgramId() {
        return programId;
    }

    public String getSupplierId() {
        return supplierId;
    }
}
