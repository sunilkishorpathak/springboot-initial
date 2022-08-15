package com.example.service;

import com.example.entity.Student;
import com.example.entitydao.StudentDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student getStudentById(Long id);
    public Student addStudent(Student student);
    public void deleteStudent(Long id);
}
