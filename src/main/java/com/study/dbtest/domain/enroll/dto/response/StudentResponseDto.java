package com.study.dbtest.domain.enroll.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.study.dbtest.model.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponseDto {
    private Integer id;
    private String name;
    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public static StudentResponseDto of(Student student){
        return StudentResponseDto.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .birthDate(student.getBirthDate())
                .build();
    }
}
