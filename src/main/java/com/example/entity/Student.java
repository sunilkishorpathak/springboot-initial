package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String roll_number;

    public Student(Long studentId, String roll_number, String name, Address address) {
        this.id = studentId;
        this.roll_number = roll_number;
        this.name = name;
        this.address = address;
    }

    String name;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Address address;

    public Student() {
    }

    public Student(Long studentId, String roll_number, String name) {
        this.id = studentId;
        this.roll_number = roll_number;
        this.name = name;
    }

    public Long getStudentId() {
        return id;
    }

    public void setStudentId(Long studentId) {
        this.id = studentId;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
