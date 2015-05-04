package com.foo.mongotest.controller;

import com.foo.mongotest.model.Var;
import com.foo.mongotest.repository.VarRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(method = RequestMethod.GET)
    public List<Var> getVars() {
        return varRepository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Var getVar(@PathVariable("id") String id) {
        return varRepository.findOneByVarId(id).orElseThrow(() -> new VarNotFoundException(id));
    }
}
