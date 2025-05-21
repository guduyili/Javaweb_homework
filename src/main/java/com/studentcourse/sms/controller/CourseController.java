package com.studentcourse.sms.controller;


import com.studentcourse.sms.common.Result;
import com.studentcourse.sms.entity.Course;
import com.studentcourse.sms.service.CourseService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Resource
    private CourseService courseService;

    @GetMapping
    public Result<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return Result.success(courses);
    }

    @GetMapping("/{courseId}")
    public Result<Course> getCourseById(@PathVariable("courseId") String courseId) {
        Course course = courseService.getCourseById(courseId);
        return Result.success(course);
    }

    @PostMapping
    public Result<Integer> addCourse(@RequestBody Course course){
        int count = courseService.addCourse(course);
        return Result.success(count);
    }

    @PutMapping("/{courseId}")
    public Result<Integer> updateCourse(@RequestBody Course course){
        int count = courseService.updateCourse(course);
        return Result.success(count);
    }
    @DeleteMapping("/{courseId}")
    public Result<Integer> deleteStudent(@PathVariable String courseId){
        int count = courseService.deleteCourse(courseId);
        return Result.success(count);
    }
}
