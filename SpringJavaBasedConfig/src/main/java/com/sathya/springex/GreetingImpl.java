package com.sathya.springex;

public class GreetingImpl  implements Greeting{

	@Override
	public void greet() {
		
		System.out.println("This is spring first example");
		System.out.println("Ratan sir woww...");
	}
   GreetingImpl(){
   System.out.println("Greeting Impl constructor::object created");
	   
	}

}
