package com.springCorewithConstructor;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreWithConstructorApplication {

	public static void main(String[] args) {
	System.out.println(" test Constructor Here! ");	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springCorewithConstructor/constructorconfig.xml");
	
	Person p= (Person)context.getBean("per");
		
	p.displayInfo();
	
//	List list= p.getList();
//	
//	System.out.println(list);
	  
	}

}
