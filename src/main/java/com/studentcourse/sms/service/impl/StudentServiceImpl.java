package com.studentcourse.sms.service.impl;
import com.studentcourse.sms.entity.Student;

import com.studentcourse.sms.mapper.StudentMapper;
import com.studentcourse.sms.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.selectAll();
    }

    @Override
    public Student getStudentById(String studentId) {
        return studentMapper.selectById(studentId);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.update(student);
    }

    @Override
    @Transactional
    public int deleteStudent(String studentId) {
        // TODO: 先删除关联的选课记录
        return studentMapper.delete(studentId);
    }
}