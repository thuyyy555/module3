package com.example.thuchanh.service;

import com.example.thuchanh.model.Product;
import com.example.thuchanh.repository.IProductRepository;
import com.example.thuchanh.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public Product findProductById(int id) {
        return iProductRepository.findProductById(id);
    }

    @Override
    public List<Product> displayProduct() {
        return iProductRepository.displayProduct();
    }

    @Override
    public void save(Product product, String name) {
        iProductRepository.save(product, name);
    }

    @Override
    public void update(String tenSP, Double gia, int soLuong, String mauSac, String moTa, String danhMuc, int id) {
        iProductRepository.update(tenSP, gia, soLuong, mauSac, moTa, danhMuc, id);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }
}
