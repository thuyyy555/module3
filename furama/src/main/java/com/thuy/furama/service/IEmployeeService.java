package com.thuy.furama.service;

import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Employee;
import com.thuy.furama.model.Service;

import java.util.List;

public interface IEmployeeService {
    List<Employee> displayEmployee();
    void save(Employee employee);
    List<Employee> search(String txtSearch);
    void delete(int id);
    Employee getEmployeeById(int id);
    void update(int maNhanVien, String hoTen, String ngaySinh, String cmnd, Double luong, String sdt, String email, String diaChi, int maViTri, int maTrinhDo, int maBoPhan);
}
