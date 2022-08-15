package com.example.entitydao;

import com.example.entity.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudents();
    public Student getStudentById(Long id);
    public Student addStudent(Student student);
    public void deleteStudent(Long id);
}
