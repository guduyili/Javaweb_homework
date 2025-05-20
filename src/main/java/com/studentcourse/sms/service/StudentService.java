package com.studentcourse.sms.service;

import com.studentcourse.sms.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(String studentId);
    int addStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(String studentId);
}