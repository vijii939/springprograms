package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	@Bean
	 public Doctor doctor()
	 {
		Doctor doctor=new Doctor(12, "rani");
		return doctor;
	 }
	@Bean
	public Phamarcy phamarcy()
	{
		Phamarcy phamarcy=new Phamarcy("keerthi","hyd");
		return phamarcy;
	
	}
	@Bean
	public Patient patient()
	{
		Patient	patient=new Patient("sindhu",12,doctor(),phamarcy());
		return patient;
	}
}
