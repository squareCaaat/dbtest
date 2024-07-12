package com.study.dbtest.domain.enroll.dto.request;

import com.study.dbtest.model.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseRequestDto {
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