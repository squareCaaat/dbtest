package com.study.dbtest.domain.enroll.service;

import com.study.dbtest.model.entity.Course;
import com.study.dbtest.domain.enroll.dto.CourseDto;
import com.study.dbtest.model.repository.CourseRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseService{
    private final CourseRepository courseRepository;

    @Transactional
    public int save(CourseDto.Request courseDto) {
        return courseRepository.save(courseDto.toEntity()).getId();
    }

    @Transactional
    public Course findById(int id){
        return courseRepository.findById(id).orElseThrow(()-> new RuntimeException("course not found"));

    }

    @Transactional
    public String deleteById(int id){
        courseRepository.deleteById(id);
        return id + " is successfully deleted";
    }

    @Transactional
    public List<CourseDto.CountStudent> getStudentsPerCourseNumber(){
        return courseRepository.countStudentPerCourses();
    }

    @Transactional
    public List<CourseDto.StudentWithSameName> getSameNameStudentsNumber(){
        return courseRepository.countStudentWithSameNamePerCourses();
    }

    @Transactional
    public List<CourseDto.StudentWithCourse> getStudentsWithCourse(int id){
        return courseRepository.findStudentsByCourseId(id);
    }
}
