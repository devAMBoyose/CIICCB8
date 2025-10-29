package com.example.model;

import jakarta.persistence.*;

@Entity
public class Teacher {
  @Id @GeneratedValue private Long id;
  private String username;
  private String fullName;
  private String email;
  private String department;
  // getters/setters ...
}



