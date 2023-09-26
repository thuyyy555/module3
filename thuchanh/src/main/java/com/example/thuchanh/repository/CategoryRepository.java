package com.example.thuchanh.repository;

import com.example.thuchanh.model.Category;
import com.example.thuchanh.model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryRepository{
    private final String SELECT = "select * from category;";
    @Override
    public List<Category> displayCategory() {
        List<Category> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                String name = resultSet.getString("category_name");
                int id = resultSet.getInt("id");
                list.add(new Category(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
