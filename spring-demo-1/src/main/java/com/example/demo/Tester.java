package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Coach;
import com.example.demo.model.Todo;

public class Tester 
{
    public static void main( String[] args )
    {
        try {
        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * Coach myCoach=context.getBean("theCoach",Coach.class);
			 * System.out.println(myCoach.getDailyWorkout());
			 */
        	Todo theTodo=context.getBean("toDo",Todo.class);
        	System.out.println(theTodo.displayDetails());
        	Todo theTodo1=context.getBean("toDo",Todo.class);
        	System.out.println(theTodo1.displayDetails());
        	System.out.println(theTodo==theTodo1);
        	theTodo=null;
        	theTodo1=null;
        	System.out.println(theTodo==theTodo1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
