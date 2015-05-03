package com.foo.mongotest.repository;

import com.foo.mongotest.model.CustomStore;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CustomStoreRepository extends Repository<CustomStore, String> {
    Optional<CustomStore> findOneByStoreId(String storeId);
}
