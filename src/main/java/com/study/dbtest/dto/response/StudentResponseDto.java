package com.study.dbtest.dto.response;

import com.study.dbtest.domain.Student;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
@Builder
public class StudentResponseDto {
    private int id;
    private String name;
    private String email;
    private Date birthDate;

    public Student toEntity(StudentResponseDto studentResponseDto){
        return Student.builder()
                .id(studentResponseDto.getId())
                .name(studentResponseDto.getName())
                .email(studentResponseDto.getEmail())
                .birthDate(studentResponseDto.getBirthDate())
                .build();
    }
}
