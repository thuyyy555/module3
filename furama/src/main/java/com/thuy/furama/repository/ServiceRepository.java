package com.thuy.furama.repository;

import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository implements IServiceRepository{
    private final String SELECT = "SELECT * FROM dich_vu;";
    private final String INSERT = "INSERT INTO dich_vu (ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, so_nguoi_toi_da, ma_kieu_thue, ma_loai_dich_vu, tieu_chuan_phong, mo_ta_tien_nghi_khac, dien_tich_ho_boi, so_tang) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    @Override
    public List<Service> displayService() {
        List<Service> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int maDV = resultSet.getInt("ma_dich_vu");
                String tenDV = resultSet.getString("ten_dich_vu");
                int dienTich = resultSet.getInt("dien_tich");
                double chiPhi = resultSet.getDouble("chi_phi_thue");
                int soNguoiToiDa = resultSet.getInt("so_nguoi_toi_da");
                int maKieuThue = resultSet.getInt("ma_kieu_thue");
                int maLoaiDV  = resultSet.getInt("ma_loai_dich_vu");
                String tieuChuanPhong  = resultSet.getString("tieu_chuan_phong");
                String moTa = resultSet.getString("mo_ta_tien_nghi_khac");
                double dienTichHoBoi = resultSet.getDouble("dien_tich_ho_boi");
                int soTang = resultSet.getInt("so_tang");
                list.add(new Service(maDV, tenDV, dienTich, chiPhi, soNguoiToiDa, maKieuThue, maLoaiDV, tieuChuanPhong, moTa, dienTichHoBoi, soTang));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public void save(Service service) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setInt(1, service.getMaDV());
            preparedStatement.setString(2, service.getTenDV());
            preparedStatement.setDouble(3, service.getDienTich());
            preparedStatement.setDouble(4, service.getChiPhi());
            preparedStatement.setInt(5, service.getSoNguoiToiDa());
            preparedStatement.setInt(6, service.getMaKieuThue());
            preparedStatement.setInt(7, service.getMaLoaiDV());
            preparedStatement.setString(8, service.getTieuChuanPhong());
            preparedStatement.setString(9, service.getMoTa());
            preparedStatement.setInt(10, service.getDienTich());
            preparedStatement.setInt(11, service.getSoTang());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
