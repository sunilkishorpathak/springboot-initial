package com.example.service;

import com.example.entity.Student;
import com.example.entitydao.StudentDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAOImpl studentDAO;

    Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public Student getStudentById(Long id) {
        logger.info("Start Method getStudentById");

        Student student = studentDAO.getStudentById(id);

        logger.info("Start Method getStudentById");

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
