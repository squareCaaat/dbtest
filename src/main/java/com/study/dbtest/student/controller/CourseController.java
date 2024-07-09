package com.study.dbtest.student.controller;

import com.study.dbtest.student.model.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping("/courses/create")
    public String createCourse(@RequestBody Course course) {
        return course.toString();
    }
    
}
