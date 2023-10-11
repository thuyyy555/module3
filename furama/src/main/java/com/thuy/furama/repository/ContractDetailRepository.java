package com.thuy.furama.repository;

import com.thuy.furama.model.Contract;
import com.thuy.furama.model.ContractDetail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository implements IContractDetailRepository{
    private final String SELECT = "SELECT * FROM hop_dong_chi_tiet;";
    private final String INSERT = "INSERT INTO hop_dong_chi_tiet (ma_hop_dong_chi_tiet, ma_hop_dong, ma_dich_vu_di_kem, so_luong) VALUES (?, ?, ?, ?);";
    @Override
    public List<ContractDetail> displayContractDetail() {
        List<ContractDetail> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int maHopDongChiTiet = resultSet.getInt("ma_hop_dong_chi_tiet");
                int maHopDong = resultSet.getInt("ma_hop_dong");
                int maDichVuDiKem = resultSet.getInt("ma_dich_vu_di_kem");
                int soLuong  = resultSet.getInt("so_luong");
                list.add(new ContractDetail(maHopDongChiTiet, maHopDong, maDichVuDiKem, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(ContractDetail contractDetail) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setInt(1, contractDetail.getMaHopDongChiTiet());
            preparedStatement.setInt(2, contractDetail.getMaHopDong());
            preparedStatement.setInt(3, contractDetail.getMaDichVuDiKem());
            preparedStatement.setInt(4, contractDetail.getSoLuong());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
