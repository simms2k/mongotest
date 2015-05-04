package com.foo.mongotest.repository;

import com.foo.mongotest.model.Program;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ProgramRepository extends Repository<Program, String> {
    Optional<Program> findOneByVarIdAndProgramId(String varId, String programId);
    List<Program> findAllByVarId(String varId);
}
