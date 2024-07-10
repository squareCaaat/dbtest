package com.study.dbtest.dto.request;

import com.study.dbtest.domain.Course;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CourseDto {
    private String courseName;
    private String instructor;
    private int score;

    @Builder
    public CourseDto(String courseName, String instructor, int score) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.score = score;
    }

    public Course toEntity(){
        return Course.builder()
                .courseName(courseName)
                .instructor(instructor)
                .score(score)
                .build();
    }
}