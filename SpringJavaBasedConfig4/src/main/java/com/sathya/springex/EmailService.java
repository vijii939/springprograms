package com.sathya.springex;

import javax.annotation.processing.Messager;

import org.springframework.stereotype.Component;
@Component
public class EmailService implements MessageService {

	@Override
	public void message() {
		System.out.println("Get the emailid");
		System.out.println("Check the updates");
		
		
	}

}
