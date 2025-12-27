package com.Desktop.SpringMVCDemo.controller;

import com.Desktop.SpringMVCDemo.Student;
import com.Desktop.SpringMVCDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    // 1️⃣ GET all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        System.out.println("✅ /students endpoint hit");
        return service.findAll();
    }



    // 2️⃣ GET student by roll number
    @GetMapping("/students/roll/{roll}")
    public Student getStudentByRoll(@PathVariable int roll) {
        return service.findByRoll(roll);
    }

    @PutMapping("/students/roll/{roll}")
    public String updateStudentByRoll(
            @PathVariable int roll,
            @RequestBody Student student) {

        service.updateByRoll(roll, student);
        return "Student updated successfully";
    }


    // 4️⃣ PUT – update student by name
    @PutMapping("/students/name/{name}")
    public String updateStudentByName(
            @PathVariable String name,
            @RequestBody Student student) {

        service.updateByName(name, student);
        return "Student updated successfully";
    }

    @DeleteMapping("/students/roll/{roll}")
    public String deleteStudentByRoll(@PathVariable int roll) {
        boolean deleted = service.deleteByRoll(roll);

        if (deleted) {
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }
}
