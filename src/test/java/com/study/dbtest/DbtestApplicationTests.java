package com.study.dbtest;

import com.study.dbtest.model.entity.Course;
import com.study.dbtest.model.entity.Student;
import com.study.dbtest.domain.enroll.dto.request.StudentRequestDto;
import com.study.dbtest.model.repository.StudentRepository;
import com.study.dbtest.domain.enroll.service.StudentService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootTest
class DbtestApplicationTests {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    @Transactional
    void contextLoads() {
        StudentRequestDto studentRequestDto1 = new StudentRequestDto("Annie", "xxx@mail", new Date(2002,Calendar.JANUARY,20));
        StudentRequestDto studentRequestDto2 = new StudentRequestDto("Marrie", "abc@mail", new Date(2000,Calendar.JUNE,18));
        StudentRequestDto studentRequestDto3 = new StudentRequestDto("Annie", "bbb@mail", new Date(1999,Calendar.FEBRUARY,9));
        int res1 = studentService.save(studentRequestDto1);
        int res2 = studentService.save(studentRequestDto2);
        int res3 = studentService.save(studentRequestDto3);
        String resStudent = studentService.findById(1);
        Assertions.assertNotNull(resStudent);
        System.out.println("id: " + res1 + " is successfully created!");
        System.out.println(resStudent);
    }

}
