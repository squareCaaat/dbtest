package com.study.dbtest;

import com.study.dbtest.domain.enroll.dto.CourseDto;
import com.study.dbtest.domain.enroll.dto.EnrollmentDto;
import com.study.dbtest.domain.enroll.dto.StudentDto;
import com.study.dbtest.domain.enroll.service.CourseService;
import com.study.dbtest.domain.enroll.service.EnrollmentService;
import com.study.dbtest.model.entity.Course;
import com.study.dbtest.model.entity.Student;
import com.study.dbtest.model.repository.CourseRepository;
import com.study.dbtest.model.repository.EnrollmentRepository;
import com.study.dbtest.model.repository.StudentRepository;
import com.study.dbtest.domain.enroll.service.StudentService;
import jakarta.transaction.Transactional;
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
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseService courseService;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private EnrollmentRepository enrollmentRepository;
    @Autowired
    private EnrollmentService enrollmentService;

    @Test
    @Transactional
    void contextLoads() {
        StudentDto.Request studentRequestDto1 = new StudentDto.Request("Annie", "xxx@mail", new Date(2002,Calendar.JANUARY,20));
        StudentDto.Request studentRequestDto2 = new StudentDto.Request("Marrie", "abc@mail", new Date(2000,Calendar.JUNE,18));
        StudentDto.Request studentRequestDto3 = new StudentDto.Request("Annie", "bbb@mail", new Date(1999,Calendar.FEBRUARY,9));
        int resStud1 = studentService.save(studentRequestDto1);
        int resStud2 = studentService.save(studentRequestDto2);
        int resStud3 = studentService.save(studentRequestDto3);
        Student resStudent = studentService.findById(1);
        Assertions.assertNotNull(resStudent);
        System.out.println(resStudent);

        CourseDto.Request courseDto1 = new CourseDto.Request("DB", "Peter", 80);
        CourseDto.Request courseDto2 = new CourseDto.Request("OS", "Tom", 90);
        int resCour1 = courseService.save(courseDto1);
        int resCour2 = courseService.save(courseDto2);
        Course resCourse1 = courseService.findById(1);
        Assertions.assertNotNull(resCourse1);
        System.out.println(resCourse1);

        EnrollmentDto.Request enrollmentRequestDto1 = new EnrollmentDto.Request(1,1,new Date(2024, Calendar.MARCH, 1));
        EnrollmentDto.Request enrollmentRequestDto2 = new EnrollmentDto.Request(1,2,new Date(2024, Calendar.MARCH, 1));
        EnrollmentDto.Request enrollmentRequestDto3 = new EnrollmentDto.Request(2,1,new Date(2024, Calendar.MARCH, 1));
        EnrollmentDto.Request enrollmentRequestDto4 = new EnrollmentDto.Request(3,1,new Date(2024, Calendar.SEPTEMBER, 1));
        EnrollmentDto.Response resEnroll1 = enrollmentService.enroll(enrollmentRequestDto1);
        Assertions.assertNotNull(resEnroll1);
        System.out.println(resEnroll1);


    }

}
