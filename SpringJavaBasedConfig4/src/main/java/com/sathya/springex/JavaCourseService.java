package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService {

	@Override
	public void courseInfo() {
		System.out.println("Course information");
		System.out.println("Javafullstack");
		
	}

}
