package com.thuy.furama.service;

import com.thuy.furama.model.Customer;
import com.thuy.furama.repository.CustomerRepository;
import com.thuy.furama.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> displayCustomer() {
        return iCustomerRepository.displayCustomer();
    }

    @Override
    public List<Customer> displayCustomerUsingService() {
        return iCustomerRepository.displayCustomerUsingService();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public List<Customer> search(String txtSearch) {
        return iCustomerRepository.search(txtSearch);
    }

    @Override
    public void delete(int id) {
        iCustomerRepository.delete(id);
    }

    @Override
    public Customer getCustomerById(int id) {
        return iCustomerRepository.getCustomerById(id);
    }

    @Override
    public void update(int maKhachHang, int maLoaiKhach, String hoTenKhachHang, String ngaySinhKH, Boolean gioiTinh, String chungMinh, String soDienThoai, String email, String diaChi) {
        iCustomerRepository.update(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi);
    }
}
