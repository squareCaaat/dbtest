package com.study.dbtest.service;

import com.study.dbtest.dto.request.CourseDto;
import com.study.dbtest.repository.CourseRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CourseService{
    private final CourseRepository courseRepository;

    @Transactional
    public int save(CourseDto courseDto) {
        return courseRepository.save(courseDto.toEntity()).getId();
    }
}
