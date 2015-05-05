package com.foo.mongotest.controller;

import com.foo.mongotest.model.Program;
import com.foo.mongotest.model.Var;
import com.foo.mongotest.repository.VarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vars")
public class VarController {

    @Autowired
    private VarRepository varRepository;

    @Autowired
    private MongoOperations mongoOperations;

    @RequestMapping(method = RequestMethod.GET)
    public List<Var> getVars() {
        return varRepository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Var getVar(@PathVariable("id") String id) {
        return varRepository.findOneByVarId(id).orElseThrow(() -> new VarNotFoundException(id));
    }

    @RequestMapping(value = "{varId}/{programId}", method = RequestMethod.GET)
    public Program getProgram(@PathVariable("varId") final String varId,
                              @PathVariable("programId") final String programId) {
        Criteria varCriteria = Criteria.where("varId").is(varId);
        Criteria programCriteria = Criteria.where("programs")
                .elemMatch(Criteria.where("programId").is(programId));
        BasicQuery query = new BasicQuery(varCriteria.getCriteriaObject(), programCriteria.getCriteriaObject());
        Var var = mongoOperations.find(query, Var.class).stream().findAny()
                .orElseThrow(() -> new VarNotFoundException(varId));
        if(var.getPrograms() == null || var.getPrograms().isEmpty()) {
            throw new ProgramNotFoundException(varId, programId);
        } else {
            return var.getPrograms().get(0);
        }
    }
}
