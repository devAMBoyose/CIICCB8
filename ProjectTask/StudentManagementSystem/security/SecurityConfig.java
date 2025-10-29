package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public UserDetailsService users(PasswordEncoder encoder) {
    UserDetails student = User.withUsername("student")
        .password(encoder.encode("pass123"))
        .roles("STUDENT")
        .build();
    UserDetails teacher = User.withUsername("teacher")
        .password(encoder.encode("pass123"))
        .roles("TEACHER")
        .build();
    return new InMemoryUserDetailsManager(student, teacher);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
      .authorizeHttpRequests(auth -> auth
        .requestMatchers("/css/**","/js/**","/images/**").permitAll()
        .requestMatchers("/student/**").hasRole("STUDENT")
        .requestMatchers("/teacher/**").hasRole("TEACHER")
        .anyRequest().authenticated()
      )
      .formLogin(login -> login.loginPage("/login").permitAll().defaultSuccessUrl("/home", true))
      .logout(logout -> logout.logoutSuccessUrl("/login?logout").permitAll())
      .csrf(Customizer.withDefaults());
    return http.build();
  }
}
