package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
  @Bean
  public EmailService emailService()
  {
	  EmailService emailService=new EmailService();
	  return emailService;
  }
  @Bean
  public JavaCourseService javaCourseService()
  {
	  JavaCourseService javacourseService=new JavaCourseService();
	  return javacourseService;
	  
  }
  @Bean
  public Student student()
  {
	  Student student=new Student();
	  //we are the setting email,java course to student
	  student.setEmailService(emailService());
	  student.setJavaCourseService(javaCourseService());
	  return student;
  }
  
}
