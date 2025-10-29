package com.example.model;

import jakarta.persistence.*;

@Entity
public class Enrollment {
  @Id @GeneratedValue private Long id;
  private String studentUsername;
  private String courseCode;
  private Double grade; // nullable until graded
  // getters/setters ...
}
