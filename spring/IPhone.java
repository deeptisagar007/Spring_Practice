package com.deepti.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IPhone {

	@Autowired
	@Qualifier(value = "snapDragonTwo")
	SnapDragon sd;

	public void whichPhone() {
		System.out.println("In Iphone");
		sd.display();
	}
}
