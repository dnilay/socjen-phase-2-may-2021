package com.example.demo;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private static Connection connection=null;
	
	public static Connection getMyConnection()
	{
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			DataSource dataSource=context.getBean("myDataSource",ComboPooledDataSource.class);
			connection=dataSource.getConnection();
			System.out.println(connection);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return connection;
	}

}
