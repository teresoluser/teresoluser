package com.SpringCoreRefferance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCoreCollections.Emp;

public class MainReferenceTest {

	
	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreWithSetterApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCoreRefferance/refconfig.xml");
		A are=(A)context.getBean("aref");
		System.out.println("Employee Data is "+ are.getX());
		System.out.println("Employee Data is "+ are.getB());
//		System.out.println("Employee Data is "+ em.getAddress());
//		System.out.println("Employee Data is "+ em.getCourses());

	}
	
}
