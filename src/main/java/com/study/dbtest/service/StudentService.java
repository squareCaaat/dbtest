package com.study.dbtest.service;

import com.study.dbtest.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<StudentDto> getCourseByStudentId(int studentId);
}
