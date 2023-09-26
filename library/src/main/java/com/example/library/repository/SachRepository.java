package com.example.library.repository;

import com.example.library.model.Sach;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SachRepository implements ISachRepository{
    private final String SELECT = "select * from sach;";

    @Override
    public List<Sach> displayBook() {
        List<Sach> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                String maSach = resultSet.getString("ma_sach");
                String tenSach = resultSet.getString("ten_sach");
                String tacGia = resultSet.getString("tac_gia");
                String moTa = resultSet.getString("mo_ta");
                int soLuong = resultSet.getInt("so_luong");
                list.add(new Sach(maSach, tenSach, tacGia, moTa, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
