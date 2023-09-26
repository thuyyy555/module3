package com.example.demo_jstl.repository;

import com.example.demo_jstl.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String SELECT = "select * from student";
    private final String INSERT = "insert into student(name,gender,point)\n" +
            "values(?,?,?)";

    private final String DELETE = "delete from student where id = ?";

    private final String UPDATE = "update student\n" +
            "SET name = ?, gender = ?, point = ?\n" +
            "WHERE id = ?;";
//    private final String SELECT_MAX = "select MAX(id) from student;";

    @Override
    public List<Student> display() {
        List<Student> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                boolean gender = resultSet.getBoolean("gender");
                double point = resultSet.getDouble("point");
                list.add(new Student(id, name, gender, point));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Student student) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
//            int lastId = getLastId();
//            preparedStatement.setInt(1, getLastId()+1);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setBoolean(2, student.isGender());
            preparedStatement.setDouble(3, student.getPoint());
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
    public boolean findId(int id) {
        boolean flag = false;
        String query = "select * from student where id = ?";
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.getRow()>0){
                flag=true;
            }
            else flag=false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


//    @Override
//    public int getLastId() {
//        Connection con = BaseRepository.getConnection();
//        int lastId = 0;
//        try {
//            Statement statement = con.createStatement();
//            ResultSet resultSet = statement.executeQuery(SELECT_MAX);
//
//            while (resultSet.next()) {
////                lastId = resultSet.getInt(1);
//                lastId = resultSet.getInt("id");
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return lastId;
//    }

    @Override
    public void update(int id_update, String name, Boolean gender, Double point) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(UPDATE);
            preparedStatement.setString(1, name);
            preparedStatement.setBoolean(2, gender);
            preparedStatement.setDouble(3, point);
            preparedStatement.setInt(4, id_update);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
