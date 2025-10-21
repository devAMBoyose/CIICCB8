package com.example.model;

import jakarta.persistence.*;

@Entity
public class Course {
  @Id @GeneratedValue private Long id;
  private String code;
  private String title;
  private int units;
  private String teacherUsername; // quick demo link
  // getters/setters ...
}
