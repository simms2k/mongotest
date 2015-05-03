package com.foo.mongotest.controller;

import com.foo.mongotest.model.CustomStoreItem;
import com.foo.mongotest.repository.CustomStoreItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customStoreItems")
public class CustomStoreItemController {

    @Autowired
    private CustomStoreItemRepository customStoreItemRepository;

    @RequestMapping("{storeId}/{itemId}")
    public CustomStoreItem getItem(@PathVariable("storeId") final String storeId,
                                   @PathVariable("itemId") final String itemId) {
        return customStoreItemRepository.findOneByStoreIdAndItemId(storeId, itemId)
                .orElseThrow(() -> new CustomStoreItemNotFoundException(storeId, itemId));
    }
}
