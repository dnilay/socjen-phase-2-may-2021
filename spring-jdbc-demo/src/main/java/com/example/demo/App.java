package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class App 
{
	private static Scanner scanner=new Scanner(System.in);
public static void main( String[] args )
    {
        try {
        	Connection connection=ConnectionFactory.getMyConnection();
        	System.out.print("First Name: ");
        	String firstName=scanner.next();
        	System.out.print("Last Name: ");
        	String lastName=scanner.next();
        	System.out.print("email Name: ");
        	String email=scanner.next();
        	Employee employee=new Employee(firstName, lastName, email);
        	PreparedStatement preparedStatement=connection.prepareStatement("insert into employee(first_name,last_name,email)values(?,?,?)");
        	preparedStatement.setString(1, employee.getFirstName());
        	preparedStatement.setString(2, employee.getLastName());
        	preparedStatement.setString(3, employee.getEmail());
        	Integer count=preparedStatement.executeUpdate();
        	System.out.println(count +">> item inseerted");
        	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
