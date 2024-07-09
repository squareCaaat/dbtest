package com.study.dbtest.dto;

import com.study.dbtest.model.Student;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class StudentDto {
    private String name;
    private String email;
    private Date birthDate;

    @Builder
    public StudentDto(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Student toEntity(){
        return Student.builder()
                .name(name)
                .email(email)
                .birthDate(birthDate)
                .build();
    } 
}
