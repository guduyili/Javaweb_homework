package com.studentcourse.sms.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Student {
    private String studentId;
    private String name;
    private String department;
    private String major;
    private String grade;
    private String gender;
    private String phone;
    private Date createTime;
    private Date updateTime;
}