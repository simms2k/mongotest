package com.foo.mongotest.repository;

import com.foo.mongotest.model.Product;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface ProductRepository extends Repository<Product, String> {
    Optional<Product> findOneByVarIdAndProgramIdAndPsid(String varId, String programId, String psid);
}
