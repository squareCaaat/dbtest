package com.study.dbtest.service;

import com.study.dbtest.domain.Student;
import com.study.dbtest.dto.request.StudentDto;
import com.study.dbtest.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Transactional
    public int save(StudentDto studentDto) {
        return studentRepository.save(studentDto.toEntity()).getId();
    }

    @Transactional
    public String findById(StudentDto studentDto, int id){
        Optional<Student> resultStudent = studentRepository.findById(id);
        if(resultStudent.isPresent() && id == studentDto.toEntity().getId()){
            return  resultStudent.get().toString();
        } else {
            return "not found";
        }
    }
}
