package com.study.dbtest.domain.enroll.service;

import com.study.dbtest.model.entity.Student;
import com.study.dbtest.domain.enroll.dto.request.StudentRequestDto;
import com.study.dbtest.model.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Transactional
    public int save(StudentRequestDto studentRequestDto) {
        return studentRepository.save(studentRequestDto.toEntity()).getId();
    }

    @Transactional
    public String findById(int id){
        Optional<Student> resultStudent = studentRepository.findById(id);
        if(resultStudent.isPresent()){
            return  resultStudent.get().toString();
        } else {
            return "not found";
        }
    }

    @Transactional
    public String deleteById(int id){
        studentRepository.deleteById(id);
        return "successfully deleted";
    }
}
