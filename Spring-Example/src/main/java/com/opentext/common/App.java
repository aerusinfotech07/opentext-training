package com.opentext.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.setName("Ramesh");
		obj.printHello();
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
		obj1.printHello();
	}
}
