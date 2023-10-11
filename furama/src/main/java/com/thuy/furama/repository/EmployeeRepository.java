package com.thuy.furama.repository;

import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Employee;
import com.thuy.furama.model.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String SELECT = "SELECT * FROM nhan_vien;";
    private final String SEARCH = "SELECT * FROM nhan_vien WHERE ho_ten LIKE ?;";

    private final String INSERT = "INSERT INTO nhan_vien (ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private final String SELECT_UP_ID = "SELECT * FROM nhan_vien where ma_nhan_vien = ?;";
    private final String DELETE = "delete from nhan_vien where ma_nhan_vien = ?;";
    private final String UPDATE = "UPDATE nhan_vien SET ho_ten = ?, ngay_sinh = ?, so_cmnd = ?, luong = ?, so_dien_thoai = ?, email = ?, dia_chi = ?, ma_vi_tri = ?, ma_trinh_do = ?, ma_bo_phan = ? WHERE (ma_nhan_vien = ?);";

    @Override
    public List<Employee> displayEmployee() {
        List<Employee> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int maNhanVien = resultSet.getInt("ma_nhan_vien");
                String hoTen = resultSet.getString("ho_ten");
                String ngaySinh = resultSet.getString("ngay_sinh");
                String cmnd = resultSet.getString("so_cmnd");
                Double luong = resultSet.getDouble("luong");
                String sdt = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String diaChi = resultSet.getString("dia_chi");
                int maViTri = resultSet.getInt("ma_vi_tri");
                int maTrinhDo = resultSet.getInt("ma_trinh_do");
                int maBoPhan = resultSet.getInt("ma_bo_phan");
                list.add(new Employee(maNhanVien, hoTen, ngaySinh, cmnd, luong, sdt, email, diaChi, maViTri, maTrinhDo, maBoPhan));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Employee employee) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setInt(1, employee.getMaNhanVien());
            preparedStatement.setString(2, employee.getHoTen());
            preparedStatement.setString(3, employee.getNgaySinh());
            preparedStatement.setString(4, employee.getCmnd());
            preparedStatement.setDouble(5, employee.getLuong());
            preparedStatement.setString(6, employee.getSdt());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setString(8, employee.getDiaChi());
            preparedStatement.setInt(9, employee.getMaViTri());
            preparedStatement.setInt(10, employee.getMaTrinhDo());
            preparedStatement.setInt(11, employee.getMaBoPhan());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(SELECT_UP_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maNhanVien = resultSet.getInt("ma_nhan_vien");
                String hoTen = resultSet.getString("ho_ten");
                String ngaySinh = resultSet.getString("ngay_sinh");
                String cmnd = resultSet.getString("so_cmnd");
                Double luong = resultSet.getDouble("luong");
                String sdt = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String diaChi = resultSet.getString("dia_chi");
                int maViTri = resultSet.getInt("ma_vi_tri");
                int maTrinhDo = resultSet.getInt("ma_trinh_do");
                int maBoPhan = resultSet.getInt("ma_bo_phan");
                return new Employee(maNhanVien, hoTen, ngaySinh, cmnd, luong, sdt, email, diaChi, maViTri, maTrinhDo, maBoPhan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(int maNhanVien, String hoTen, String ngaySinh, String cmnd, Double luong, String sdt, String email, String diaChi, int maViTri, int maTrinhDo, int maBoPhan) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(UPDATE);
            preparedStatement.setString(1, hoTen);
            preparedStatement.setString(2, ngaySinh);
            preparedStatement.setString(3, cmnd);
            preparedStatement.setDouble(4, luong);
            preparedStatement.setString(5, sdt);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, diaChi);
            preparedStatement.setInt(8, maViTri);
            preparedStatement.setInt(9, maTrinhDo);
            preparedStatement.setInt(10, maBoPhan);
            preparedStatement.setInt(11, maNhanVien);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Employee> search(String txtSearch) {
        List<Employee> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(SEARCH);
            preparedStatement.setString(1, "%" + txtSearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maNhanVien = resultSet.getInt("ma_nhan_vien");
                String hoTen = resultSet.getString("ho_ten");
                String ngaySinh = resultSet.getString("ngay_sinh");
                String cmnd = resultSet.getString("so_cmnd");
                Double luong = resultSet.getDouble("luong");
                String sdt = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String diaChi = resultSet.getString("dia_chi");
                int maViTri = resultSet.getInt("ma_vi_tri");
                int maTrinhDo = resultSet.getInt("ma_trinh_do");
                int maBoPhan = resultSet.getInt("ma_bo_phan");
                list.add(new Employee(maNhanVien, hoTen, ngaySinh, cmnd, luong, sdt, email, diaChi, maViTri, maTrinhDo, maBoPhan));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

