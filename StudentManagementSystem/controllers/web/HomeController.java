package com.example.web;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/login")
  public String login() { return "login"; }

  @GetMapping({"/","/home"})
  public String home(Authentication auth) {
    if (auth.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_STUDENT"))) {
      return "redirect:/student/personal";
    }
    return "redirect:/teacher/personal";
  }
}
