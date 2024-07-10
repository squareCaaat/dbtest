package com.study.dbtest.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.study.dbtest.domain.Student;
import lombok.*;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {
    private String name;
    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public Student toEntity(){
        return Student.builder()
                .name(name)
                .email(email)
                .birthDate(birthDate)
                .build();
    } 
}
