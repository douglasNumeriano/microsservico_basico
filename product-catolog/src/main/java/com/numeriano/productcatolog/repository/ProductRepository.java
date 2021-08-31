package com.numeriano.productcatolog.repository;

import com.numeriano.productcatolog.modal.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
