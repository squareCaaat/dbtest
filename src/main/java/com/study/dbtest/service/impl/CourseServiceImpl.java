package com.study.dbtest.service.impl;

import com.study.dbtest.dto.CourseDto;
import com.study.dbtest.repository.CourseRepository;
import com.study.dbtest.service.CourseService;

public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;

    @Override
    public int save(CourseDto courseDto) {
        return courseRepository.save(courseDto.toEntity()).getId();
    }
}
