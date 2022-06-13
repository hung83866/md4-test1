package com.codegym.testproduct.service.product;

import com.codegym.testproduct.model.Product;
import com.codegym.testproduct.repository.IProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService{
    @Autowired
    private IProducRepository productRepository;
    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Iterable<Product> findByName(String name) {
        return productRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable<Product> sortByPrice() {
        return productRepository.findAllByOrderByPrice();
    }

    @Override
    public Iterable<Product> getTop4() {
        return productRepository.getTop4();
    }
}
