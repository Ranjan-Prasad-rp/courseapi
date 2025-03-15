package com.example.courseapi.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Course_ID")
    private int id;
    @Column(name = "Course_Name")
    private String name;
}
