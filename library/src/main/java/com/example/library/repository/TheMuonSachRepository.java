package com.example.library.repository;

import com.example.library.model.Sach;
import com.example.library.model.TheMuonSach;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TheMuonSachRepository implements ITheMuonSachRepository{
    private final String SELECT = "select * from themuonsach;";

    @Override
    public List<TheMuonSach> displayTheMuon() {
        List<TheMuonSach> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                String maMuonSach = resultSet.getString("ma_muon_sach");
                String maSach = resultSet.getString("ma_sach");
                int maHs = resultSet.getInt("ma_hs");
                Boolean trangThai = resultSet.getBoolean("trang_thai");
                Date ngayMuon = resultSet.getDate("ngay_muon");
                Date ngayTra = resultSet.getDate("ngay_tra");
                list.add(new TheMuonSach(maMuonSach, maHs, maSach, trangThai, ngayMuon, ngayTra));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
