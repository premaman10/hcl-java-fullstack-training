package com.example.CourseWebApllication.controller;

import com.example.CourseWebApllication.model.Course;
import com.example.CourseWebApllication.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // ✅ GET all courses
    @GetMapping("/allCourses")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    // ✅ GET course by ID
    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseByCourseId(@PathVariable Integer courseId) {
        Course course = courseService.getCourseBycourseId(courseId);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    // ✅ POST create new course
    @PostMapping("/")
    public ResponseEntity<Optional<Course>> saveCourse(@RequestBody Course newCourse) {
        Optional<Course> savedCourse = courseService.saveCourse(newCourse);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }
}
    