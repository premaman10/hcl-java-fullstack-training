package com.example.Desktop.SpringJPADemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Integer age;
    String name;
    String branch;
    Double gpa;
    Boolean isPlaced;
}
