package com.foo.mongotest.controller;

import com.foo.mongotest.model.Supplier;
import com.foo.mongotest.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @RequestMapping(value = "{varId}/{programId}/{supplierId}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable("varId") final String varId,
                                @PathVariable("programId") final String programId,
                                @PathVariable("supplierId") final String supplierId) {
        return supplierRepository.findOneByVarIdAndProgramIdAndSupplierId(varId, programId, supplierId)
                .orElseThrow(() -> new SupplierNotFoundException(varId, programId, supplierId));
    }
}
