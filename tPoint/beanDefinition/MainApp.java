package com.tPoint.beanDefinition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// HelloWorld helloWorld = (HelloWorld)
		// context.getBean("beanDefinitionHelloWorld");
		HelloIndia helloIndia = (HelloIndia) context.getBean("beanDefinitionHelloIndia");

		/*
		 * helloWorld.getMessage1(); helloWorld.getMessage2();
		 */

		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.getMessage3();
		helloIndia.getMessage4();
	}

}
