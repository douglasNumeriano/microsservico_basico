package com.numeriano.productcatolog.controller;

import com.numeriano.productcatolog.modal.Product;
import com.numeriano.productcatolog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}")
    Optional<Product> findById(@PathVariable("id") Long id) {
        return productRepository.findById(id);
    }
}
