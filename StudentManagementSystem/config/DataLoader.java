package com.example.config;

import com.example.model.*;
import com.example.repo.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
  @Bean
  CommandLineRunner load(StudentRepo sRepo, TeacherRepo tRepo, CourseRepo cRepo, EnrollmentRepo eRepo) {
    return args -> {
      var s = new Student(); s.setUsername("student"); s.setFullName("Anna Student"); s.setEmail("student@example.com"); s.setYearLevel("2nd Year"); sRepo.save(s);
      var t = new Teacher(); t.setUsername("teacher"); t.setFullName("Mr. Tanner Teacher"); t.setEmail("teacher@example.com"); t.setDepartment("CS"); tRepo.save(t);

      Course c1 = new Course(); c1.setCode("CS101"); c1.setTitle("Intro to CS"); c1.setUnits(3); c1.setTeacherUsername("teacher"); cRepo.save(c1);
      Course c2 = new Course(); c2.setCode("MATH201"); c2.setTitle("Discrete Math"); c2.setUnits(3); c2.setTeacherUsername("teacher"); cRepo.save(c2);

      Enrollment en1 = new Enrollment(); en1.setStudentUsername("student"); en1.setCourseCode("CS101"); en1.setGrade(1.75); eRepo.save(en1);
      Enrollment en2 = new Enrollment(); en2.setStudentUsername("student"); en2.setCourseCode("MATH201"); en2.setGrade(2.00); eRepo.save(en2);
    };
  }
}
