package com.studentcourse.sms.mapper;

import com.studentcourse.sms.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> selectAll();
    Student selectById(String studentId);
    int insert(Student student);
    int update(Student student);
    int delete(String studentId);
}