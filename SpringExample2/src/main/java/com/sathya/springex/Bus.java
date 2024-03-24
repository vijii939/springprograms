package com.sathya.springex;

public class Bus implements Vehicle {
 private String busType;
 private int maxSpeed;
public String getBusType() {
	return busType;
}
public void setBusType(String busType) {
	this.busType = busType;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
@Override
public void move() {
  System.out.println("Your selected Bus vehicle");
  System.out.println("Max speed..."+maxSpeed);
  System.out.println("Bus type..."+busType);
	
}
   
 
}
