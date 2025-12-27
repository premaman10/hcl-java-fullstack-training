package com.example.CourseWebApllication.repo;


import com.example.CourseWebApllication.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {

    Course getCourseByCourseId(Integer courseId);

}
