package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       //start the IOCcontainer
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
    			greetingImpl.greet();
    			System.out.println("Start container");
    }
}
