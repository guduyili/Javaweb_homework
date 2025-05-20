package com.studentcourse.sms.mapper;

import com.studentcourse.sms.entity.Enrollment;
import com.studentcourse.sms.entity.EnrollmentVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface EnrollmentMapper {
    List<Enrollment> selectAll();
    List<EnrollmentVO> selectByStudentId(String studentId);
    int insert(Enrollment enrollment);
    int updateScore(Map<String, Object> params);
    int delete(Map<String, Object> params);
}