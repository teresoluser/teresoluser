package com.springCoreCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreWithSetterApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreCollections/collectionconfig.xml");
		Emp em=(Emp)context.getBean("emp1");
		System.out.println("Employee Data is "+ em.getEmpName());
		System.out.println("Employee Data is "+ em.getPhones());
		System.out.println("Employee Data is "+ em.getAddress());
		System.out.println("Employee Data is "+ em.getCourses());

	}

}
