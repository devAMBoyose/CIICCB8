package com.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {
  @Id @GeneratedValue private Long id;
  private String username;
  private String fullName;
  private String email;

  // demo fields
  private String yearLevel;

  // getters/setters ...
}
