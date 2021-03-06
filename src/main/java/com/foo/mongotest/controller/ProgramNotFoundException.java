package com.foo.mongotest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProgramNotFoundException extends RuntimeException {
    private final String varId;
    private final String programId;


    public ProgramNotFoundException(String varId, String programId) {
        this.varId = varId;
        this.programId = programId;
    }

    public String getVarId() {
        return varId;
    }

    public String getProgramId() {
        return programId;
    }
}
