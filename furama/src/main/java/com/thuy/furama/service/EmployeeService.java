package com.thuy.furama.service;

import com.thuy.furama.model.Employee;
import com.thuy.furama.repository.EmployeeRepository;
import com.thuy.furama.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> displayEmployee() {
        return iEmployeeRepository.displayEmployee();
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> search(String txtSearch) {
        return iEmployeeRepository.search(txtSearch);
    }

    @Override
    public void delete(int id) {
        iEmployeeRepository.delete(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return iEmployeeRepository.getEmployeeById(id);
    }

    @Override
    public void update(int maNhanVien, String hoTen, String ngaySinh, String cmnd, Double luong, String sdt, String email, String diaChi, int maViTri, int maTrinhDo, int maBoPhan) {
        iEmployeeRepository.update(maNhanVien, hoTen, ngaySinh, cmnd, luong, sdt, email, diaChi, maViTri, maTrinhDo, maBoPhan);
    }
}
