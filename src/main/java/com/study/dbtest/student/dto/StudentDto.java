package com.study.dbtest.student.dto;

import com.study.dbtest.student.model.Student;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
public class StudentDto {
    private int studentId;
    private String name;
    private String email;
    private Date birthDate;

    @Builder
    public StudentDto(int studentId, String name, String email, Date birthDate) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Student toEntity(){
        return Student.builder()
                .id(studentId)
                .name(name)
                .email(email)
                .birthDate(birthDate)
                .build();
    } 
}
