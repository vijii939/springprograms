package com.sathya.springex;

public class Person {
  private String name;
  private String emailId;
     public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
 public void PersonInfo() 
{
	System.out.println("Hey "+name+"welcome to sathya tech");
	System.out.println("EmailId.."+emailId+"you will gets updates");
	  
}
}