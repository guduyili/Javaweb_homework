package com.studentcourse.sms.mapper;

import com.studentcourse.sms.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    List<Course> selectAll();

    Course selectById(String courseId);

    int insert(Course course);

    int update(Course course);

    int delete(String courseId);
}