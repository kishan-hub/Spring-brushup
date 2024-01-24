package com.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.autowired.bean.Chip;
import com.annotation.autowired.bean.Robot;

@Configuration
public class AtAutowiredConfig {
 
	@Bean(name = "chip") 
	public Chip getChip() {
		
		Chip chip =new Chip();
		chip.setId(12);
		chip.setName("Intel Core");
		
		return new Chip();
	}
	
	@Bean(name = "robot")
	public Robot getRobot() {
		Robot robot =new Robot(getChip());
		return robot;
	}
}
