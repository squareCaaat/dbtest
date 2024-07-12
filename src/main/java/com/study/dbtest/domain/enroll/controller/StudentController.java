package com.study.dbtest.domain.enroll.controller;

import com.study.dbtest.domain.enroll.dto.StudentDto;
import com.study.dbtest.domain.enroll.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create/students")
    public int addStudent(@RequestBody StudentDto.Request studentRequestDto) {
        return studentService.save(studentRequestDto);
    }

    @GetMapping("/get/students/{id}")
    public StudentDto.Response findById(@PathVariable int id){
        return StudentDto.Response.of(studentService.findById(id));
    }

    @DeleteMapping("/delete/students/{id}")
    public String deleteById(@PathVariable int id) {
        return studentService.deleteById(id);
    }

    @GetMapping("/get/students/{id}/courses")
    public List<StudentDto.CourseOfStudent> getCoursesFromStudent(@PathVariable int id) {
        return studentService.getCoursesFromStudent(id);
    }
}
