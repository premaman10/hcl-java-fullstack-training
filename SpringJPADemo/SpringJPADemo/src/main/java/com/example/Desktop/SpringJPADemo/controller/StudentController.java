package com.example.Desktop.SpringJPADemo.controller;

import com.example.Desktop.SpringJPADemo.Repo.StudentRepo;
import com.example.Desktop.SpringJPADemo.model.StudentModel;
import com.example.Desktop.SpringJPADemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<StudentModel> getAllStudents() {
        return service.findAll();
    }
    @GetMapping("/student/id/{id}")
    public StudentModel getStudentById(@PathVariable Integer id){

    }
}
