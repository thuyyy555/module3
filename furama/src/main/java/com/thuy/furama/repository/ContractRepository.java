package com.thuy.furama.repository;

import com.thuy.furama.model.Contract;
import com.thuy.furama.model.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository{
    private final String SELECT = "SELECT * FROM hop_dong;";
    private final String INSERT = "INSERT INTO hop_dong (ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu) VALUES (?, ?, ?, ?, ?, ?, ?);";

    @Override
    public List<Contract> displayContract() {
        List<Contract> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int maHopDong = resultSet.getInt("ma_hop_dong");
                String ngayLamHopDong = resultSet.getString("ngay_lam_hop_dong");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                double tienDatCoc = resultSet.getDouble("tien_dat_coc");
                int maNhanVien = resultSet.getInt("ma_nhan_vien");
                int maKhachHang = resultSet.getInt("ma_khach_hang");
                int maDichVu  = resultSet.getInt("ma_dich_vu");
                list.add(new Contract(maHopDong, ngayLamHopDong, ngayKetThuc, tienDatCoc, maNhanVien, maKhachHang, maDichVu));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Contract contract) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setInt(1, contract.getMaHopDong());
            preparedStatement.setString(2, contract.getNgayLamHopDong());
            preparedStatement.setString(3, contract.getNgayKetThuc());
            preparedStatement.setDouble(4, contract.getTienDatCoc());
            preparedStatement.setInt(5, contract.getMaNhanVien());
            preparedStatement.setInt(6, contract.getMaKhachHang());
            preparedStatement.setInt(7, contract.getMaDichVu());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
