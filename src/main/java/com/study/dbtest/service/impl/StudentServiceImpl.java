package com.study.dbtest.service.impl;

import com.study.dbtest.dto.StudentDto;
import com.study.dbtest.repository.StudentRepository;
import com.study.dbtest.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public int save(StudentDto studentDto) {
        return studentRepository.save(studentDto.toEntity()).getId();
    }
}
