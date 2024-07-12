package com.study.dbtest.domain.enroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.study.dbtest.model.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

public class StudentDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Request{
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

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response{
        private Integer id;
        private String name;
        private String email;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date birthDate;

        public static StudentDto.Response of(Student student){
            return StudentDto.Response.builder()
                    .id(student.getId())
                    .name(student.getName())
                    .email(student.getEmail())
                    .birthDate(student.getBirthDate())
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CourseOfStudent{
        private Integer studentId;
        private String name;
        private Integer courseId;
        private String courseName;
        private String instructor;
        private Date enrollmentDate;
    }
}
