package com.annotation.bean;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	private String name;
	private Address address;
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
