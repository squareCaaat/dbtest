package com.study.dbtest.controller;

import com.study.dbtest.dto.CourseDto;
import com.study.dbtest.service.impl.CourseServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private CourseServiceImpl courseService;

    @PostMapping("/courses/create")
    public int createCourse(@RequestBody CourseDto courseDto) {
        return courseService.save(courseDto);
    }
}
