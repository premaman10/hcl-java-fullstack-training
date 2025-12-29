package com.example.CourseWebApllication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name="orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer orderId;
    Integer courseId;
    LocalDate purchaseDate;
    Double amountPaid;
    String couponCode;
}
