package com.tutorialspoint.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorldBeanObj1 = (HelloWorld) context.getBean("helloWorldBean");
		helloWorldBeanObj1.getMessage();
		HelloWorld helloWorldBeanOBj2 = (HelloWorld) context.getBean("helloWorldBean");
		helloWorldBeanOBj2.setMessage("From Second Object");
		helloWorldBeanObj1.getMessage();
		helloWorldBeanOBj2.getMessage();
		context.registerShutdownHook();
	}

	/*
	 * public static void main(String[] args) { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("Beans.xml"); HelloWorld obj = (HelloWorld)
	 * context.getBean("helloWorld"); obj.getMessage(); }
	 */

}
