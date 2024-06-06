package com.opentext.common.output;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		OutputHelper obj = (OutputHelper) context.getBean("OutputHelper");
		obj.generateOutput();
		
		ApplicationContext context1=new AnnotationConfigApplicationContext(AppConfig.class);
		
		OutputHelper outputHelperAnnotation = (OutputHelper) context1.getBean("newOutputHelper");
		outputHelperAnnotation.generateOutput();
		
	}
}
