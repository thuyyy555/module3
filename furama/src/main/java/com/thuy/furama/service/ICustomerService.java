package com.thuy.furama.service;

import com.thuy.furama.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> displayCustomer();
    List<Customer> displayCustomerUsingService();
    void save(Customer customer);
    List<Customer> search(String txtSearch);
    void delete(int id);
    Customer getCustomerById(int id);
    void update(int maKhachHang, int maLoaiKhach, String hoTenKhachHang, String ngaySinhKH, Boolean gioiTinh, String chungMinh, String soDienThoai, String email, String diaChi);

}
