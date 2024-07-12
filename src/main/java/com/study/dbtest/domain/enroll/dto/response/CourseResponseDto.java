package com.study.dbtest.domain.enroll.dto.response;

import com.study.dbtest.model.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseResponseDto {
    private Integer id;
    private String courseName;
    private String instructor;
    private Integer score;

    public static CourseResponseDto of(Course course){
        return CourseResponseDto.builder()
                .id(course.getId())
                .courseName(course.getCourseName())
                .instructor(course.getInstructor())
                .score(course.getScore())
                .build();
    }
}
