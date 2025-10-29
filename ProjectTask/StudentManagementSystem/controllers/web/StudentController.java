package com.example.web;

import com.example.repo.*;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
  private final StudentRepo sRepo;
  private final EnrollmentRepo eRepo;
  private final CourseRepo cRepo;

  public StudentController(StudentRepo sRepo, EnrollmentRepo eRepo, CourseRepo cRepo) {
    this.sRepo = sRepo; this.eRepo = eRepo; this.cRepo = cRepo;
  }

  @GetMapping("/student/personal")
  public String personal(Authentication auth, Model m) {
    m.addAttribute("student", sRepo.findByUsername(auth.getName()));
    return "student/personal";
  }

  @GetMapping("/student/courses")
  public String courses(Authentication auth, Model m) {
    var enrolls = eRepo.findByStudentUsername(auth.getName());
    m.addAttribute("enrollments", enrolls);
    m.addAttribute("courseByCode", cRepo::findByCode);
    return "student/courses";
  }

  @GetMapping("/student/grades")
  public String grades(Authentication auth, Model m) {
    var enrolls = eRepo.findByStudentUsername(auth.getName());
    m.addAttribute("enrollments", enrolls);
    m.addAttribute("courseByCode", cRepo::findByCode);
    return "student/grades";
  }
}
