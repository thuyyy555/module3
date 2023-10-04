package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> list;
    static {
        list = new ArrayList<>();
        list.add(new Product(1,"pepsi01",10000.0,"none", "NSX01"));
        list.add(new Product(2,"pepsi02",10000.0,"none", "NSX02"));
        list.add(new Product(3,"pepsi03",10000.0,"none", "NSX03"));
        list.add(new Product(4,"pepsi04",10000.0,"none", "NSX04"));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public void save(Product product) {
        list.add(product);
    }
}
