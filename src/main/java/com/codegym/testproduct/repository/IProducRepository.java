package com.codegym.testproduct.repository;

import com.codegym.testproduct.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProducRepository extends PagingAndSortingRepository<Product, Long> {
    Optional<Product> findByName();
}
