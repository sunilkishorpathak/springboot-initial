package com.example.entitydao;

import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentDAOImpl implements  StudentDAO{
    EntityManager entityManager;

    @Autowired
    StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> getAllStudents() {
        Query theQuery = (Query) entityManager.createQuery("from Student");
        List<Student> students = theQuery.getResultList();
        return students;
    }

    @Override
    public Student getStudentById(Long id) {
        Student student = entityManager.find(Student.class, id);

        return student;
    }

    @Override
    @Transactional
    public Student addStudent(Student student) {
        Student dbStudent = entityManager.merge(student);

        student.setStudentId(dbStudent.getStudentId());

        return student;
    }

    @Override
    public void deleteStudent(Long studentId) {
        Query theQuery = (Query) entityManager.createQuery("delete from Student where id=:studentId");
        theQuery.setParameter("studentId", studentId);
        theQuery.executeUpdate();
    }
}
