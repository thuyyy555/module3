package com.example.thuchanh.service;

import com.example.thuchanh.model.Product;

import java.util.List;

public interface IProductService {
    Product findProductById(int id);
    List<Product> displayProduct();
    void save(Product product, String name);
    void update(String tenSP, Double gia, int soLuong, String mauSac, String moTa, String danhMuc, int id);
    void delete(int id);
}
