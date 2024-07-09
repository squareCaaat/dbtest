package com.study.dbtest.controller;

import com.study.dbtest.dto.StudentDto;
import com.study.dbtest.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private StudentService studentService;

    @PostMapping("/students/create")
    public int addStudent(@RequestBody StudentDto studentDto) {
        return studentService.save(studentDto);
    }

}
