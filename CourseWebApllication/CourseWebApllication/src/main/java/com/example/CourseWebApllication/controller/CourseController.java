package com.example.CourseWebApllication.controller;

import com.example.CourseWebApllication.model.Course;
import com.example.CourseWebApllication.service.CourseService;
import jakarta.validation.Valid;
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
    CourseService courseService;

    @GetMapping("/allCourses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseCourseId(@PathVariable Integer courseId){
        return new ResponseEntity<>(courseService.getCourseBycourseId(courseId), HttpStatus.FOUND);
    }

    @PostMapping("/")
    public ResponseEntity<Optional<Course>> saveCourse(@Valid @RequestBody Course newCourse)  {
        return ResponseEntity.ok(courseService.saveCourse(newCourse));
    }


}