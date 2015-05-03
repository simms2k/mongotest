package com.foo.mongotest.controller;

import com.foo.mongotest.model.CustomStore;
import com.foo.mongotest.repository.CustomStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customStores")
public class CustomStoreController {

    @Autowired
    private CustomStoreRepository customStoreRepository;

    @RequestMapping(value = "{storeId}", method = RequestMethod.GET)
    public CustomStore getCustomStore(@PathVariable("storeId") final String storeId) {
        return customStoreRepository.findOneByStoreId(storeId)
                .orElseThrow(() -> new CustomStoreNotFoundException(storeId));
    }
}
