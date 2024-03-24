package com.sathya.springex;

import java.util.jar.Attributes.Name;

public class Doctor {
	private int id;
	private String name;
	
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 public void doctorInfo()
	 {
		 System.out.println("good morning");
	 }

}
