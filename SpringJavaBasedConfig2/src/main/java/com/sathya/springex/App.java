package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      // start the IOCcontainer
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	//Get the beans
    	Person person=context.getBean("person1",Person.class);
    	person.PersonInfo();
    }
}
