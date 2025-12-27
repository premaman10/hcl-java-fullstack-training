package com.example.CourseWebApllication.service;

import com.example.CourseWebApllication.model.Course;
import com.example.CourseWebApllication.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;



    public List<Course> getAllCourses() {
        return  courseRepo.findAll();
    }

    public Course getCourseBycourseId(Integer courseId) {

        return  courseRepo.getCourseByCourseId(courseId);
    }

    public Optional<Course> saveCourse(Course newCourse) {
        Optional<Course> saved = Optional.of(courseRepo.save(newCourse));
        if(saved.isPresent())return  saved;
        else {
            return null;
        }

    }
}
