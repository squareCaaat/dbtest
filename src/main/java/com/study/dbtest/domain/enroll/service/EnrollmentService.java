package com.study.dbtest.domain.enroll.service;

import com.study.dbtest.domain.enroll.dto.EnrollmentDto;
import com.study.dbtest.model.entity.Course;
import com.study.dbtest.model.entity.Enrollment;
import com.study.dbtest.model.entity.Student;
import com.study.dbtest.model.repository.CourseRepository;
import com.study.dbtest.model.repository.EnrollmentRepository;
import com.study.dbtest.model.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Transactional
    public EnrollmentDto.Response enroll(EnrollmentDto.Request enrollmentRequestDto){
        Student student = studentRepository.findById(enrollmentRequestDto.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepository.findById(enrollmentRequestDto.getCourseId())
                .orElseThrow(() -> new RuntimeException("Course nor found"));

        Enrollment enrollment = Enrollment.builder()
                .student(student)
                .course(course)
                .enrollmentDate(enrollmentRequestDto.getEnrollmentDate())
                .build();

        enrollmentRepository.save(enrollment);
        student.getEnrollments().add(enrollment);
        course.getEnrollments().add(enrollment);

        return EnrollmentDto.Response.of(enrollment);
    }


}
