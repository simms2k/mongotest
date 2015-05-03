package com.foo.mongotest.repository;

import com.foo.mongotest.model.CustomStoreItem;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CustomStoreItemRepository extends Repository<CustomStoreItem, String> {
    Optional<CustomStoreItem> findOneByStoreIdAndItemId(String storeId, String itemId);
}
