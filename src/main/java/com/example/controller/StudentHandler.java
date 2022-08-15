package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentHandler {
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);

        return student;
    }

    @PostMapping(value = "/students", consumes = "application/json", produces = "application/json")
    public Student addStudent(@RequestBody Student student) {
        Student newStudent = new Student();
        newStudent.setName(student.getName());
        newStudent.setRoll_number(student.getRoll_number());

        Student dbStudent = studentService.addStudent(student);

        return dbStudent;
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(Long id) {
        studentService.deleteStudent(id);
    }
}
