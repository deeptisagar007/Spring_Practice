package com.deepti.spring;

import org.springframework.stereotype.Component;

@Component()
public class SnapDragonTwo implements SnapDragon {

	@Override
	public void display() {
		System.out.println("From SnapDragonTwo");
	}

}
