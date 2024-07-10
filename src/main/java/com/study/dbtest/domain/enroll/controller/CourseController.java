package com.study.dbtest.domain.enroll.controller;

import com.study.dbtest.domain.enroll.dto.request.CourseRequestDto;
import com.study.dbtest.domain.enroll.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/courses/create")
    public int createCourse(@RequestBody CourseRequestDto courseRequestDto) {
        return courseService.save(courseRequestDto);
    }

    @GetMapping("/courses/{id}")
    public String getCourseById(@PathVariable int id) {
        return courseService.findById(id);
    }

    @DeleteMapping("/courses/delete/{id}")
    public String deleteCourseById(@PathVariable int id) {
        return courseService.deleteById(id);
    }
}
