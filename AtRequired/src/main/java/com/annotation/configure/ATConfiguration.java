package com.annotation.configure;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.bean.Address;
import com.annotation.bean.Person;

@Configuration
public class ATConfiguration {
   
	@Bean(name = "address")
	public Address getAddress() {
		 Address address=new Address();
		 address.setAddressLine1("505");
		 address.setAddressLine2("trivendram");
		 address.setCity("Bangalore");
		 address.setState("Karnataka");
		 address.setCountry("Bharat");
		 address.setZip(654890);
		 return address;
	}
	
	@Bean(name = "person")
	public Person getPerson() {
		Person person =new Person();
		person.setAddress(getAddress());
		person.setName("ram");
		return person;
	}
}
