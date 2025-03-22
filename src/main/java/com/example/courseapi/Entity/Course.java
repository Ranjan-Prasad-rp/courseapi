package com.example.courseapi.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Courses")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Course_ID")
    private int id;
    @Column(name = "Course_Name")
    private String name;
}
