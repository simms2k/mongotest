package com.foo.mongotest.controller;

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
