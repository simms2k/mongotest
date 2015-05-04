package com.foo.mongotest.repository;

import com.foo.mongotest.model.Var;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface VarRepository extends Repository<Var, String> {
    List<Var> findAll();
    Optional<Var> findOneByVarId(String varId);
}
