package com.studentcourse.sms.controller;

import com.studentcourse.sms.common.Result;
import com.studentcourse.sms.entity.Enrollment;
import com.studentcourse.sms.entity.EnrollmentVO;
import com.studentcourse.sms.service.EnrollmentService;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Resource
    private EnrollmentService enrollmentService;

    @GetMapping("/student/{studentId}")
    public Result<List<EnrollmentVO>> getEnrollmentsByStudent(@PathVariable String studentId) {
        List<EnrollmentVO> enrollments = enrollmentService.getEnrollmentsByStudent(studentId);
        return Result.success(enrollments);
    }

    @PostMapping
    public Result<Integer> addEnrollment(@RequestBody Enrollment enrollment) {
        int count = enrollmentService.addEnrollment(enrollment);
        return Result.success(count);
    }

    @PutMapping("/score")
    public Result<Integer> updateScore(@RequestParam String enrollmentId, 
                                      @RequestParam Double score) {
        int count = enrollmentService.updateScore(enrollmentId, score);
        return Result.success(count);
    }

    @DeleteMapping
    public Result<Integer> dropCourse(@RequestBody Map<String, Object> params) {
        int count = enrollmentService.dropCourse(params);
        return Result.success(count);
    }
}