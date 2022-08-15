package com.example.service;

import com.example.entity.Student;
import com.example.entitydao.StudentDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAOImpl studentDAO;


    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public Student getStudentById(Long id) {
        Student student = studentDAO.getStudentById(id);

        return student;
    }


    @Override
    public Student addStudent(Student student) {
        Student newStudent = new Student();
        newStudent.setName(student.getName());
        newStudent.setRoll_number(student.getRoll_number());

        Student dbStudent = studentDAO.addStudent(student);

        return dbStudent;
    }


    @Override
    public void deleteStudent(Long id) {
        studentDAO.deleteStudent(id);
    }
}
