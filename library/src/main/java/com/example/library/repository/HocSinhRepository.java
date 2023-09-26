package com.example.library.repository;

import com.example.library.model.HocSinh;
import com.example.library.model.TheMuonSach;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HocSinhRepository implements IHocSinhRepository{
    private final String SELECT = "select * from hocsinh;";
    public List<HocSinh> displayHocSinh() {
        List<HocSinh> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int maHs = resultSet.getInt("ma_hs");
                String tenHs = resultSet.getString("ten_hs");
                String lop = resultSet.getString("lop");
                list.add(new HocSinh(tenHs, maHs, lop));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
