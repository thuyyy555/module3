package com.example.thuchanh.repository;

import com.example.thuchanh.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private final String SELECT = "select * from product;";
    private final String INSERT = "insert into product(product_name, product_price, product_quantity, product_color, product_des, category_id)\n" +
            "values(?,?,?,?,?,?)";
    private final String DELETE = "delete from product where id = ?;";
    private final String SELECT_ID = "select id from category\n" +
            "where category_name=?;";

    private final String SELECT_JOIN = "select product.id, product_name, product_price, product_quantity, product_color, product_des, category_name\n" +
            "from product \n" +
            "join category\n" +
            "on category.id = product.category_id;";

    private final String UPDATE = "update product\n" +
            "SET product_name = ?, product_price = ?, product_quantity = ?, product_color = ?, product_des = ?, category_id = ?\n" +
            "WHERE id = ?;";
    public List<Product> displayProduct() {
        List<Product> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_JOIN);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String tenSP = resultSet.getString("product_name");
                Double gia = resultSet.getDouble("product_price");
                int soLuong = resultSet.getInt("product_quantity");
                String mauSac = resultSet.getString("product_color");
                String moTa = resultSet.getString("product_des");
                String danhMuc= resultSet.getString("category_name");
                list.add(new Product(id, tenSP, gia, soLuong, mauSac, moTa, danhMuc));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public void save(Product product, String name) {
        Connection con = BaseRepository.getConnection();
        String INSERT = "insert into product(product_name, product_price, product_quantity, product_color, product_des, category_id)\n" +
                "values(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setString(1, product.getTenSP());
            preparedStatement.setDouble(2, product.getGia());
            preparedStatement.setInt(3, product.getSoLuong());
            preparedStatement.setString(4, product.getMauSac());
            preparedStatement.setString(5, product.getMoTa());
            preparedStatement.setInt(6, selectID(name));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    @Override
    public int selectID(String name) {
        Connection con = BaseRepository.getConnection();
        String query = "SELECT id FROM category WHERE category_name = ?";
        int id = 0;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public Product findProductById(int id) {
        Connection con = BaseRepository.getConnection();
        String query = "select product.id, product_name, product_price, product_quantity, product_color, product_des, category_name\n" +
                "from product\n" +
                "join category\n" +
                "on category.id = product.category_id\n" +
                "where product.id=?;";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt("id");
                String tenSP = resultSet.getString("product_name");
                Double gia = resultSet.getDouble("product_price");
                int soLuong = resultSet.getInt("product_quantity");
                String mauSac = resultSet.getString("product_color");
                String moTa = resultSet.getString("product_des");
                String danhMuc= resultSet.getString("category_name");
                return new Product(id, tenSP, gia, soLuong, mauSac, moTa, danhMuc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
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
    @Override
    public void update(String tenSP, Double gia, int soLuong, String mauSac, String moTa, String danhMuc, int id) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(UPDATE);
            preparedStatement.setString(1, tenSP);
            preparedStatement.setDouble(2, gia);
            preparedStatement.setInt(3, soLuong);
            preparedStatement.setString(4, mauSac);
            preparedStatement.setString(5, moTa);
            preparedStatement.setInt(6, selectID(danhMuc));
            preparedStatement.setInt(7, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
