package com.example.CourseWebApllication.controller;

import com.example.CourseWebApllication.model.Course;
import com.example.CourseWebApllication.service.CourseService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Slf4j
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
    public ResponseEntity<?> getCourseByCourseId(@PathVariable Integer courseId){
        Course c = courseService.getCourseBycourseId(courseId);
        if(c==null){
            var logM = new HashMap<>();
            logM.put("message","Request Denied");
            List<String> errorlist = new ArrayList<>();
            errorlist.add("Could not find the given Id");
            logM.put("Errors",errorlist);
            return  new ResponseEntity<>(logM,HttpStatus.BAD_REQUEST);
        }
        return  new ResponseEntity<>(c,HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Optional<Course>> saveCourse(@Valid @RequestBody Course newCourse)  {
        return ResponseEntity.ok(courseService.saveCourse(newCourse));
    }

    // ✅ UPDATE course by ID
    @PutMapping("/{courseId}")
    public ResponseEntity<Course> updateCourse(
            @RequestBody Course updatedCourse,
            @PathVariable Integer courseId) {

        Course course = courseService.updateCourse(courseId, updatedCourse);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    // ✅ DELETE course by ID
    @DeleteMapping("/{courseId}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer courseId) {

        courseService.  deleteCourse(courseId);
        return new ResponseEntity<>("Course deleted successfully", HttpStatus.OK);
    }


}