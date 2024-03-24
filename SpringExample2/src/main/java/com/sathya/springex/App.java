package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // start the spring IOC container
    ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    
      // Get the Bean
    Traveller traveller=context.getBean("traveller",Traveller.class);
    traveller.startJourney();
    }
}
