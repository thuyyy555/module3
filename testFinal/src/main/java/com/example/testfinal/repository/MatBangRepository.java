package com.example.testfinal.repository;

import com.example.testfinal.model.MatBang;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatBangRepository implements IMatBangRepository{
    private final String SELECT = "select * from mat_bang;";
    private final String DELETE = "delete from mat_bang where id = ?;";
    public List<MatBang> displayMatBang() {
        List<MatBang> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                Double dienTich = resultSet.getDouble("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                int tang = resultSet.getInt("tang");
                String loaiVp = resultSet.getString("loai_vp");
                String moTa = resultSet.getString("mo_ta");
                Double gia = resultSet.getDouble("gia");
                String ngayBd = resultSet.getString("ngay_bd");
                String ngayKt = resultSet.getString("ngay_kt");
                list.add(new MatBang(id, dienTich, trangThai, tang, loaiVp, moTa, gia, ngayBd, ngayKt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public void save(MatBang matBang) {
        Connection con = BaseRepository.getConnection();
        String INSERT = "insert into mat_bang(id, dien_tich, trang_thai, tang, loai_vp, mo_ta, gia, ngay_bd, ngay_kt)\n" +
                "values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setString(1, matBang.getId());
            preparedStatement.setDouble(2, matBang.getDienTich());
            preparedStatement.setString(3, matBang.getTrangThai());
            preparedStatement.setInt(4, matBang.getTang());
            preparedStatement.setString(5, matBang.getLoaiVp());
            preparedStatement.setString(6, matBang.getMoTa());
            preparedStatement.setDouble(7, matBang.getGia());
            preparedStatement.setString(8, matBang.getNgayBd());
            preparedStatement.setString(9, matBang.getNgayKt());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //    @Override
//    public int selectID(String name) {
//        Connection con = BaseRepository.getConnection();
//        String query = "SELECT id FROM category WHERE category_name = ?";
//        int id = 0;
//        try {
//            PreparedStatement preparedStatement = con.prepareStatement(query);
//            preparedStatement.setString(1, name);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                id = resultSet.getInt("id");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return id;
//    }

//    public Product findProductById(int id) {
//        Connection con = BaseRepository.getConnection();
//        String query = "select product.id, product_name, product_price, product_quantity, product_color, product_des, category_name\n" +
//                "from product\n" +
//                "join category\n" +
//                "on category.id = product.category_id\n" +
//                "where product.id=?;";
//        try {
//            PreparedStatement preparedStatement = con.prepareStatement(query);
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                id = resultSet.getInt("id");
//                String tenSP = resultSet.getString("product_name");
//                Double gia = resultSet.getDouble("product_price");
//                int soLuong = resultSet.getInt("product_quantity");
//                String mauSac = resultSet.getString("product_color");
//                String moTa = resultSet.getString("product_des");
//                String danhMuc= resultSet.getString("category_name");
//                return new Product(id, tenSP, gia, soLuong, mauSac, moTa, danhMuc);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    @Override
    public void delete(String id) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(DELETE);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    @Override
//    public boolean findId(int id) {
//        boolean flag = false;
//        String query = "select * from product where ma_sp = ?";
//        Connection con = BaseRepository.getConnection();
//        try {
//            Statement statement = con.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            if(resultSet.getRow()>0){
//                flag=true;
//            }
//            else flag=false;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return flag;
//    }
//    @Override
//    public void update(String tenSP, Double gia, int soLuong, String mauSac, String moTa, String danhMuc, int id) {
//        Connection con = BaseRepository.getConnection();
//        try {
//            PreparedStatement preparedStatement = con.prepareStatement(UPDATE);
//            preparedStatement.setString(1, tenSP);
//            preparedStatement.setDouble(2, gia);
//            preparedStatement.setInt(3, soLuong);
//            preparedStatement.setString(4, mauSac);
//            preparedStatement.setString(5, moTa);
//            preparedStatement.setInt(6, selectID(danhMuc));
//            preparedStatement.setInt(7, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}

