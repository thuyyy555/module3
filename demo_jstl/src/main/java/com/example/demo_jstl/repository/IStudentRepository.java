package com.example.demo_jstl.repository;

import com.example.demo_jstl.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> display();
    void save(Student student);
    void delete(int id);
//    int getLastId();
    boolean findId(int id);
    void update(int id_update, String name, Boolean gender, Double point);
}
