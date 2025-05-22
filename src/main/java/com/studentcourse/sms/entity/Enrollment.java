package com.studentcourse.sms.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Enrollment {
    private String enrollmentId;
    private String studentId;
    private String studentName;
    private String courseId;
    private String teacherId;
    private Integer year;
    private Integer term;
    private Double score;
    private String status;
    private Date createTime;
    private Date updateTime;
}