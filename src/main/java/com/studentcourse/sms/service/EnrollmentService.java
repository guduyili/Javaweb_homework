package com.studentcourse.sms.service;

import com.studentcourse.sms.entity.Enrollment;
import com.studentcourse.sms.entity.EnrollmentVO;
import java.util.List;
import java.util.Map;

public interface EnrollmentService {
    List<EnrollmentVO> getEnrollmentsByStudent(String studentId);
    int addEnrollment(Enrollment enrollment);
    int updateScore(String enrollmentId, Double score);
    int dropCourse(Map<String, Object> params);
}