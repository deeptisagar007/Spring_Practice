package com.tutorialspoint.spring;

public class HelloWorld {

	private String message;

	/**
	 * @return the message
	 */
	public void getMessage() {
		System.out.println("Message: " + message);
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("HelloWorld Initiated");
	}

	public void destroy() {
		System.out.println("HelloWorld Destroy");
	}
}
