package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);

}
