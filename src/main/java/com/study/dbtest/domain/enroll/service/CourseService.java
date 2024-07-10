package com.study.dbtest.domain.enroll.service;

import com.study.dbtest.model.entity.Course;
import com.study.dbtest.domain.enroll.dto.request.CourseRequestDto;
import com.study.dbtest.model.repository.CourseRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CourseService{
    private final CourseRepository courseRepository;

    @Transactional
    public int save(CourseRequestDto courseRequestDto) {
        return courseRepository.save(courseRequestDto.toEntity()).getId();
    }

    @Transactional
    public String findById(int id){
        Optional<Course> resultCourse = courseRepository.findById(id);
        if(resultCourse.isPresent()){
            return  resultCourse.get().toString();
        } else {
            return "not found";
        }
    }

    @Transactional
    public String deleteById(int id){
        courseRepository.deleteById(id);
        return id + "is successfully deleted";
    }
}
