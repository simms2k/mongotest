package com.foo.mongotest.repository;

import com.foo.mongotest.model.Var;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface VarRepository extends Repository<Var, String> {
    Optional<Var> findOneByVarId(String varId);

    @Query("{ varId : ?0, programs.programId : ?1 }")
    Optional<Var> findOneProgramByVarIdProgramId(String varId, String programId);
}
