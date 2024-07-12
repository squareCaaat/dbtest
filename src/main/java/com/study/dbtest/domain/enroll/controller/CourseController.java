package com.study.dbtest.domain.enroll.controller;

import com.study.dbtest.domain.enroll.dto.CourseDto;
import com.study.dbtest.domain.enroll.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/create/courses")
    public int createCourse(@RequestBody CourseDto.Request courseDto) {
        return courseService.save(courseDto);
    }

    @GetMapping("/get/courses/{id}")
    public CourseDto.Response getCourseById(@PathVariable int id) {
        return CourseDto.Response.of(courseService.findById(id));
    }

    @DeleteMapping("/delete/courses/{id}")
    public String deleteCourseById(@PathVariable int id) {
        return courseService.deleteById(id);
    }

    @GetMapping("/get/courses/student-number")
    public List<CourseDto.CountStudent> getStudentsNumber(){
        return courseService.getStudentsPerCourseNumber();
    }

    @GetMapping("/get/courses/same-name-student-number")
    public List<CourseDto.StudentWithSameName> getSameNameStudentsNumber() {
        return courseService.getSameNameStudentsNumber();
    }

    @GetMapping("/get/courses/{id}/students")
    public List<CourseDto.StudentWithCourse> getStudents(@PathVariable int id){
        return courseService.getStudentsWithCourse(id);
    }
}
