package com.studentcourse.sms.service;

import com.studentcourse.sms.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(String courseId);
    int addCourse(Course course);
    int updateCourse(Course course);
    int deleteCourse(String courseId);
}