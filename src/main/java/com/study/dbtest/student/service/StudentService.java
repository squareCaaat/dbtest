package com.study.dbtest.student.service;

import com.study.dbtest.student.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<StudentDto> getCourseByStudentId(int studentId);
}
