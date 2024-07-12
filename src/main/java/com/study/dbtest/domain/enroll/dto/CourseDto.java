package com.study.dbtest.domain.enroll.dto;

import com.study.dbtest.model.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class CourseDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Request{
        private String courseName;
        private String instructor;
        private int score;

        public Course toEntity(){
            return Course.builder()
                    .courseName(courseName)
                    .instructor(instructor)
                    .score(score)
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response{
        private Integer id;
        private String courseName;
        private String instructor;
        private Integer score;

        public static CourseDto.Response of(Course course){
            return CourseDto.Response.builder()
                    .id(course.getId())
                    .courseName(course.getCourseName())
                    .instructor(course.getInstructor())
                    .score(course.getScore())
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CountStudent{
        private Integer courseId;
        private String courseName;
        private Long studentCount;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StudentWithSameName{
        private Integer courseId;
        private String courseName;
        private String name;
        private Long studentCount;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StudentWithCourse{
        private Integer courseId;
        private String courseName;
        private Integer studentId;
        private String name;
    }
}