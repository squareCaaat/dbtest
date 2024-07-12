package com.study.dbtest.domain.enroll.controller;

import com.study.dbtest.domain.enroll.dto.EnrollmentDto;
import com.study.dbtest.domain.enroll.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping("/enroll")
    public EnrollmentDto.Response enroll(@RequestBody EnrollmentDto.Request enrollmentRequestDto){
        return enrollmentService.enroll(enrollmentRequestDto);
    }
}
