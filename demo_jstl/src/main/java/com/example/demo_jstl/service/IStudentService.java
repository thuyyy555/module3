package com.example.demo_jstl.service;

import com.example.demo_jstl.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> display();
    void save(Student student);
    void delete(int id);
    void update(int id_update, String name, Boolean gender, Double point);
    boolean findId(int id);
}
