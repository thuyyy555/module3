package com.example.demo_jstl.service;

import com.example.demo_jstl.model.Student;
import com.example.demo_jstl.repository.IStudentRepository;
import com.example.demo_jstl.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public List<Student> display() {
        return iStudentRepository.display();
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public void delete(int id) { iStudentRepository.delete(id); }

    @Override
    public void update(int id_update, String name, Boolean gender, Double point) {
        iStudentRepository.update(id_update, name, gender, point);
    }

    @Override
    public boolean findId(int id) {
        return iStudentRepository.findId(id);
    }
}
