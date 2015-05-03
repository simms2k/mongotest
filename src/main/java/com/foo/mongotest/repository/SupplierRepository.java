package com.foo.mongotest.repository;

import com.foo.mongotest.model.Supplier;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface SupplierRepository extends Repository<Supplier, String> {
    Optional<Supplier> findOneByVarIdAndProgramIdAndSupplierId(String varId, String programId, String supplierId);
}
