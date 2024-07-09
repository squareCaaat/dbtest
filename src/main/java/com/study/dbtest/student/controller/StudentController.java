package com.study.dbtest.student.controller;

import com.study.dbtest.student.model.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @PostMapping("/students/create")
    public String addStudent(@RequestBody Student student) {
        return "Student added successfully";
    }

//    @GetMapping("/students/{studentId}")
//    public Student getStudent(@PathVariable int studentId) {
//
//    }

    @PostMapping("/students/join")
    public String joinStudent(@RequestBody Student student) {
        System.out.println("id:"+student.getId());
        System.out.println("name:"+student.getName());
        System.out.println("email:"+student.getEmail());
        //System.out.println("birth_date:"+student.getBirthDate());
        return "Student joined successfully";
    }
}
