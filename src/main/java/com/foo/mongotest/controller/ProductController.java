package com.foo.mongotest.controller;

import com.foo.mongotest.model.Product;
import com.foo.mongotest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "{varId}/{programId}/{psid}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("varId") final String varId,
                              @PathVariable("programId") final String programId,
                              @PathVariable("psid") final String psid) {
        return productRepository.findOneByVarIdAndProgramIdAndPsid(varId, programId, psid)
                .orElseThrow(() -> new ProductNotFoundException(varId, programId, psid));
    }
}
