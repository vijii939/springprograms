package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("vijaya");
		person.setEmailId("vijaya@gmail.com");
		return person;
	}

}