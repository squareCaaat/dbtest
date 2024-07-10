package com.study.dbtest.controller;

import com.study.dbtest.dto.request.CourseDto;
import com.study.dbtest.service.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private CourseService courseService;


    @PostMapping("/courses/create")
    public int createCourse(@RequestBody CourseDto courseDto) {
        return courseService.save(courseDto);
    }
}
