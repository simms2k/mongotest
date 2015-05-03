package com.foo.mongotest.controller;

import com.foo.mongotest.model.Program;
import com.foo.mongotest.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programs")
public class ProgramController {

    @Autowired
    private ProgramRepository programRepository;

    @RequestMapping(value = "{varId}/{programId}", method = RequestMethod.GET)
    public Program getProgram(@PathVariable("varId") final String varId,
                              @PathVariable("programId") final String programId) {
        return programRepository.findOneByVarIdAndProgramId(varId, programId)
                .orElseThrow(() -> new ProgramNotFoundException(varId, programId));
    }
}
