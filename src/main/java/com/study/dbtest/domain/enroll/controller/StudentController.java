package com.study.dbtest.domain.enroll.controller;

import com.study.dbtest.domain.enroll.dto.request.StudentRequestDto;
import com.study.dbtest.domain.enroll.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students/create")
    public int addStudent(@RequestBody StudentRequestDto studentRequestDto) {
        return studentService.save(studentRequestDto);
    }

    @GetMapping("/students/{id}")
    public String findById(@PathVariable int id){
        return studentService.findById(id);
    }

    @DeleteMapping("/students/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return studentService.deleteById(id);
    }
}
