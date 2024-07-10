package com.study.dbtest.controller;

import com.study.dbtest.dto.request.StudentDto;
import com.study.dbtest.dto.response.StudentResponseDto;
import com.study.dbtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students/create")
    public int addStudent(@RequestBody StudentDto studentDto) {
        return studentService.save(studentDto);
    }

    @GetMapping("/students/{id}")
    public String findById(@PathVariable int id, StudentDto studentDto){
        return studentService.findById(studentDto, id);
    }
}
