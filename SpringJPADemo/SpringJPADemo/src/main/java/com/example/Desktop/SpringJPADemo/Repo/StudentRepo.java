package com.example.Desktop.SpringJPADemo.Repo;

import com.example.Desktop.SpringJPADemo.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel,Integer> {
}
