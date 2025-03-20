package com.example.courseapi.Service;

import com.example.courseapi.Entity.Course;
import com.example.courseapi.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    public List<Course> getAll() {
        List<Course> course = courseRepo.findAll();
        return course;
    }

    public Course addcourse(Course course){

          courseRepo.save(course);

        return course;
    }

}
