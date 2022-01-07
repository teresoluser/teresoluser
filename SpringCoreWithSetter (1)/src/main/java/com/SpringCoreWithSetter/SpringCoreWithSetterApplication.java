package com.SpringCoreWithSetter;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



//@SpringBootApplication
public class SpringCoreWithSetterApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreWithSetterApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentBean stu=(StudentBean)context.getBean("stuObj");
		System.out.println("Student Data is "+ stu);
		
		AddressBean add=(AddressBean)context.getBean("add");
		System.out.println("Address Data is "+ add);
		
	}

}
