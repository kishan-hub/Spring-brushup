package com.globellogic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Employee {
  
	 private final int id;
	 
	 private final String name;
	 
	 private final Map<Integer, String> address;
	 
	 public Employee(int id,String name,Map<Integer, String> address) {
		 this.id=id;
		 this.name=name;
		 this.address=Collections.unmodifiableMap(new HashMap<>(address));
	 }
	 
	 //setters getters
	 
} 
