package com.study.dbtest.service;

import com.study.dbtest.dto.CourseDto;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    int save(CourseDto courseDto);
}
