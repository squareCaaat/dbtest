package com.study.dbtest;

import com.study.dbtest.dto.request.StudentDto;
import com.study.dbtest.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class DbtestApplicationTests {
    @Autowired
    private StudentService studentService;

    @Test
    void contextLoads() {
        StudentDto studentDto = new StudentDto("Marrie", "xxx@mail", new Date(2002,Calendar.JANUARY,1));
        int res = studentService.save(studentDto);
        String resStudent = studentService.findById(studentDto, 1);
        Assertions.assertNotNull(resStudent);
        System.out.println("id: " + res + " is successfully created!");
        System.out.println(resStudent);
    }

}
