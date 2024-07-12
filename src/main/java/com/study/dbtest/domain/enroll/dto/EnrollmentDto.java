package com.study.dbtest.domain.enroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.study.dbtest.model.entity.Enrollment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;


public class EnrollmentDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request{
        private Integer studentId;
        private Integer courseId;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date enrollmentDate;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response{
        private Integer id;
        private Integer studentId;
        private String studentName;
        private Integer courseId;
        private String courseName;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date enrollmentDate;

        public static EnrollmentDto.Response of(Enrollment enrollment) {
            return EnrollmentDto.Response.builder()
                    .id(enrollment.getId())
                    .studentId(enrollment.getStudent().getId())
                    .studentName(enrollment.getStudent().getName())
                    .courseId(enrollment.getCourse().getId())
                    .courseName(enrollment.getCourse().getCourseName())
                    .enrollmentDate(enrollment.getEnrollmentDate())
                    .build();
        }
    }
}
