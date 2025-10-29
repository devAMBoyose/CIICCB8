package com.example.web;

import com.example.repo.*;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {
  private final TeacherRepo tRepo;
  private final CourseRepo cRepo;
  private final EnrollmentRepo eRepo;
  private final StudentRepo sRepo;

  public TeacherController(TeacherRepo tRepo, CourseRepo cRepo, EnrollmentRepo eRepo, StudentRepo sRepo) {
    this.tRepo = tRepo; this.cRepo = cRepo; this.eRepo = eRepo; this.sRepo = sRepo;
  }

  @GetMapping("/teacher/personal")
  public String personal(Authentication auth, Model m) {
    m.addAttribute("teacher", tRepo.findByUsername(auth.getName()));
    return "teacher/personal";
  }

  @GetMapping("/teacher/students")
  public String students(Authentication auth, Model m) {
    var myCourses = cRepo.findByTeacherUsername(auth.getName());
    m.addAttribute("courses", myCourses);
    m.addAttribute("enrollments", eRepo.findAll());
    m.addAttribute("students", sRepo.findAll());
    return "teacher/students";
  }

  @GetMapping("/teacher/courses")
  public String courses(Authentication auth, Model m) {
    m.addAttribute("courses", cRepo.findByTeacherUsername(auth.getName()));
    return "teacher/courses";
  }
}
