package com.study.dbtest.controller;

import com.study.dbtest.dto.StudentDto;
import com.study.dbtest.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private StudentServiceImpl studentService;

    @PostMapping("/students/create")
    public int addStudent(@RequestBody StudentDto studentDto) {
        return studentService.save(studentDto);
    }

}
