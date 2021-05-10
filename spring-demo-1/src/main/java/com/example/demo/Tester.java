package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Coach;

public class Tester 
{
    public static void main( String[] args )
    {
        try {
        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        	Coach myCoach=context.getBean("theCoach",Coach.class);
        	System.out.println(myCoach.getDailyWorkout());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
