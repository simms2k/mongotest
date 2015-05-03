package com.foo.mongotest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {
    private final String varId;
    private final String programId;
    private final String psid;

    public ProductNotFoundException(String varId, String programId, String psid) {
        this.varId = varId;
        this.programId = programId;
        this.psid = psid;
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
}
