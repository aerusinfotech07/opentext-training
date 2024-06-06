package com.opentext.common.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
			
		Sim sim=(Sim)context.getBean("sim");
		sim.calling();
		sim.data();
		
	}
}
