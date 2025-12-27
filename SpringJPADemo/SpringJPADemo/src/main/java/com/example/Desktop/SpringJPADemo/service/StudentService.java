package com.example.Desktop.SpringJPADemo.service;

import com.example.Desktop.SpringJPADemo.Repo.StudentRepo;
import com.example.Desktop.SpringJPADemo.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public List<StudentModel> findAll(){
        return  repo.findAll();
    }
}
