package com.study.dbtest.domain.enroll.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountStudentPerCourseResDto {
    private Integer courseId;
    private Integer studentCount;

}
