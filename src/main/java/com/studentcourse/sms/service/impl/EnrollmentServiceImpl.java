package com.studentcourse.sms.service.impl;

import com.studentcourse.sms.entity.Enrollment;
import com.studentcourse.sms.entity.EnrollmentVO;
import com.studentcourse.sms.mapper.EnrollmentMapper;
import com.studentcourse.sms.service.EnrollmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    @Resource
    private EnrollmentMapper enrollmentMapper;

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentMapper.selectAll();

    }

    @Override
    public List<EnrollmentVO> getEnrollmentsByStudent(String studentId) {
        return enrollmentMapper.selectByStudentId(studentId);
    }

    @Override
    @Transactional
    public int addEnrollment(Enrollment enrollment) {
        // TODO: 检查课程容量和是否已选
        return enrollmentMapper.insert(enrollment);
    }

    @Override
    public int updateScore(String enrollmentId, Double score) {
        return enrollmentMapper.updateScore(Map.of(
            "enrollmentId", enrollmentId,
            "score", score
        ));
    }

    @Override
    public int dropCourse(Map<String, Object> params) {
        return enrollmentMapper.delete(params);
    }
}