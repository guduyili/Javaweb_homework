package com.studentcourse.sms.service.impl;

import com.studentcourse.sms.entity.Course;
import com.studentcourse.sms.mapper.CourseMapper;
import com.studentcourse.sms.service.CourseService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;


    @Override
    public List<Course> getAllCourses() {
        return courseMapper.selectAll();
    }

    @Override
    public Course getCourseById(String courseId) {
        return courseMapper.selectById(courseId);
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.update(course);
    }

    @Override
    public int deleteCourse(String courseId) {
        return courseMapper.delete(courseId);
    }
}
