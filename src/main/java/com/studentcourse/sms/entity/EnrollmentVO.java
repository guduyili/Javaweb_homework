package com.studentcourse.sms.entity;

import lombok.Data;

@Data
public class EnrollmentVO extends Enrollment {
    private String studentName;
    private String courseName;
    private String teacherName;
}