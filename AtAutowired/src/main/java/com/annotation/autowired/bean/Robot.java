package com.annotation.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;


public class Robot {
	
	@Autowired(required = true)
	private  Chip chip;
	
	public Robot(Chip chip) {
		super();
		this.chip = chip;
	}

	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

	
	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}
	
	
}
