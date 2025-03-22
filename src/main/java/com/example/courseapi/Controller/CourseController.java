package com.example.courseapi.Controller;

import com.example.courseapi.Entity.Course;
import com.example.courseapi.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;


    @GetMapping("/getAll")
    public List<Course> getAll(){

        List<Course> course = courseService.getAll();
        return course;
    }

    @PostMapping("/addCourse")
    public Course course(@RequestBody Course course){
       return  courseService.addcourse(course);
    }



    @DeleteMapping("/course/{id}")
    public Course deleteCourse(@PathVariable("id") int id){
        return courseService.deleteCourse(id);
    }






}
