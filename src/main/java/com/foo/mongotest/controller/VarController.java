package com.foo.mongotest.controller;

import com.foo.mongotest.model.Program;
import com.foo.mongotest.model.Var;
import com.foo.mongotest.repository.VarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vars")
public class VarController {

    @Autowired
    private VarRepository varRepository;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Var getVar(@PathVariable("id") String id) {
        return varRepository.findOneByVarId(id).orElseThrow(() -> new VarNotFoundException(id));
    }

    @RequestMapping(value = "{varId}/{programId}", method = RequestMethod.GET)
    Program getProgram(@PathVariable("varId") final String varId,
                       @PathVariable("programId") final String programId) {
        return varRepository.findOneProgramByVarIdProgramId(varId, programId)
                .flatMap(var -> var.getPrograms().stream().findAny())
                .orElseThrow(() -> new ProgramNotFoundException(varId, programId));
    }
}
