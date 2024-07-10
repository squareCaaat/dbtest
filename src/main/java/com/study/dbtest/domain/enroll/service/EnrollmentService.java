package com.study.dbtest.domain.enroll.service;

import com.study.dbtest.model.entity.Enrollment;
import com.study.dbtest.model.repository.EnrollmentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;

}
