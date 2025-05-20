package com.studentcourse.sms.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Teacher {
    private String teacherId;
    private String name;
    private String department;
    private String title;
    private String gender;
    private String phone;
    private Date createTime;
    private Date updateTime;
}