package com.study.dbtest.domain.enroll.dto.response;

import com.study.dbtest.model.entity.Student;
import lombok.*;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StudentResponseDto {
    private Integer id;
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
