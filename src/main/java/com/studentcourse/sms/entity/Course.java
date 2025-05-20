package com.studentcourse.sms.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Course {
    private String courseId;
    private String courseName;
    private String department;
    private Double credit;
    private Integer period;
    private String courseType;
    private Date createTime;
    private Date updateTime;
}