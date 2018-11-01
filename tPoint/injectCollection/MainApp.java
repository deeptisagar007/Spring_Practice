package com.tPoint.injectCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection address1 = (JavaCollection) context.getBean("address");
		address1.getAddressList();
		address1.getAddressSet();
		address1.getAddressMap();
		address1.getAddressProp();
		System.out.println("=====================================================");
		JavaCollection address2 = (JavaCollection) context.getBean("address1");
		address2.getAddressList();
		address2.getAddressSet();
		address2.getAddressMap();
		address2.getAddressProp();
		System.out.println("=====================================================");
		JavaCollection javaCollection = (JavaCollection) context.getBean("addressCollection");
		System.out.println(javaCollection.toString());

	}

}
