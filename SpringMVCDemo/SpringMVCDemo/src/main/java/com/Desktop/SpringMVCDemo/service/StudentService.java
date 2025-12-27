package com.Desktop.SpringMVCDemo.service;


import com.Desktop.SpringMVCDemo.Student;
import com.Desktop.SpringMVCDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;



@Service
public class StudentService {

    // In-memory data store
    private final List<Student> students = new ArrayList<>();

    // Constructor to preload data
    public StudentService() {
        students.add(new Student(1, 22, "Prem", "CSE", 8.5, true));
        students.add(new Student(2, 23, "Anu", "IT", 8.0, false));
        students.add(new Student(3, 21, "Vishal", "ECE", 7.8, true));
    }

    // 1️⃣ Get all students
    public List<Student> findAll() {
        return students;
    }

    // 2️⃣ Get student by roll number
    public Student findByRoll(int roll) {
        return students.stream()
                .filter(s -> s.getRoll() == roll)
                .findFirst()
                .orElse(null);
    }

    // 3️⃣ Update student by roll number
    public void updateByRoll(int roll, Student updatedStudent) {
        for (Student s : students) {
            if (s.getRoll() == roll) {
                s.setAge(updatedStudent.getAge());
                s.setName(updatedStudent.getName());
                s.setBranch(updatedStudent.getBranch());
                s.setCgpa(updatedStudent.getCgpa());
                s.setPlaced(updatedStudent.isPlaced());
                return;
            }
        }
    }

    // 4️⃣ Update student by name
    public void updateByName(String name, Student updatedStudent) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.setAge(updatedStudent.getAge());
                s.setBranch(updatedStudent.getBranch());
                s.setCgpa(updatedStudent.getCgpa());
                s.setPlaced(updatedStudent.isPlaced());
                return;
            }
        }
    }

    public boolean deleteByRoll(int roll) {
        return students.removeIf(s -> s.getRoll() == roll);
    }
}

