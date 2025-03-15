package com.example.courseapi.Controller;

import com.example.courseapi.Entity.Course;
import com.example.courseapi.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;


    @GetMapping("/getAll")
    public List<Course> getAll(){

        List<Course> course = courseService.getAll();
        System.out.println(course);
        return course;
    }
}
