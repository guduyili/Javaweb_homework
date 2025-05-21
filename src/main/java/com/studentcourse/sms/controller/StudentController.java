package com.studentcourse.sms.controller;

import com.studentcourse.sms.common.Result;
import com.studentcourse.sms.entity.Student;
import com.studentcourse.sms.service.StudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/students")
@Tag(name = "学生管理", description = "学生信息的增删改查")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping
    public Result<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return Result.success(students);
    }

    @GetMapping("/{studentId}")
    public Result<Student> getStudentById(@PathVariable String studentId) {
        Student student = studentService.getStudentById(studentId);
        return Result.success(student);
    }

    @PostMapping
    public Result<Integer> addStudent(@RequestBody Student student) {
        int count = studentService.addStudent(student);
        return Result.success(count);
    }

    @PutMapping("/{studentId}")
    public Result<Integer> updateStudent(@RequestBody Student student) {
        int count = studentService.updateStudent(student);
        System.out.println("接收到学生数据：" + student);
        return Result.success(count);
    }

    @DeleteMapping("/{studentId}")
    public Result<Integer> deleteStudent(@PathVariable String studentId) {
        int count = studentService.deleteStudent(studentId);
        return Result.success(count);
    }
}