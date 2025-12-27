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

    public Course updateCourse(Integer courseId, Course updatedCourse) {
        Course existingCourse = courseRepo.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        existingCourse.setCourseName(updatedCourse.getCourseName());
        existingCourse.setCourseDescription(updatedCourse.getCourseDescription());
        existingCourse.setTags(updatedCourse.getTags());
        existingCourse.setDuration(updatedCourse.getDuration());
        existingCourse.setListedOn(updatedCourse.getListedOn());
        existingCourse.setPrice(updatedCourse.getPrice());

        return courseRepo.save(existingCourse);
    }

    public void deleteCourse(Integer courseId) {
        Course course = courseRepo.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        courseRepo.delete(course);
    }

}
