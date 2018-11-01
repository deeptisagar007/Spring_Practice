package com.deepti.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SnapDragonOne implements SnapDragon {

	@Override
	public void display() {
		System.out.println("From SnapDragonOne");
	}

}
