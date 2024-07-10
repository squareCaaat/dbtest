package com.study.dbtest.model.repository;

import com.study.dbtest.domain.enroll.dto.response.CountSameStudentNamePerCourseResDto;
import com.study.dbtest.domain.enroll.dto.response.CountStudentPerCourseResDto;
import com.study.dbtest.domain.enroll.dto.response.StudentCoursesResDto;
import com.study.dbtest.model.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    @Query(value = "select s.id, s.name, c.id, c.courseName, c.instructor, e.enrollmentDate " +
            "from Enrollment e " +
            "join Student s on s.id = e.student.id " +
            "join Course c on e.course.id = c.id " +
            "where s.id = :studentId"
    )
    List<StudentCoursesResDto> findCoursesById(@Param("studentId") Integer id);

    @Query(value = "select e.course.id, count(e.student.id) as studentCount " +
            "from Enrollment e " +
            "group by e.course"
    )
    List<CountStudentPerCourseResDto> countStudentPerCourses();

    @Query(value = "select c.id, c.courseName, s.name, count(s.id) as studentCount " +
            "from Course c " +
            "join Enrollment e on c.id = e.course.id " +
            "join Student s on e.student.id = s.id " +
            "group by c.id, c.courseName, s.name " +
            "having count(s.id) > 1"
    )
    List<CountSameStudentNamePerCourseResDto> countSameStudetnPerCourse();
}
