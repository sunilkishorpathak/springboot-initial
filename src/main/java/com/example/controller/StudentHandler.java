package com.example.controller;

import com.example.entity.Student;
import com.example.entitydao.StudentDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentHandler {
    @Autowired
    private StudentDAOImpl studentDAO;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentDAO.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathParam("id") Long id) {
        Student student = studentDAO.getStudentById(id);

        return student;
    }

    @PostMapping(value = "/students", consumes = "application/json", produces = "application/json")
    public Student addStudent(@RequestBody Student student) {
        Student newStudent = new Student();
        newStudent.setName(student.getName());
        newStudent.setRoll_number(student.getRoll_number());

        Student dbStudent = studentDAO.addStudent(student);

        return dbStudent;
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@RequestParam("id") Long id) {
        studentDAO.deleteStudent(id);
    }
}
