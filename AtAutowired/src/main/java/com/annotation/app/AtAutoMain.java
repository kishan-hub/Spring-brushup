package com.annotation.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.autowired.bean.Chip;
import com.annotation.autowired.bean.Robot;
import com.annotation.config.AtAutowiredConfig;

public class AtAutoMain {
	
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(AtAutowiredConfig.class);
		Chip chip=context.getBean("chip",Chip.class);
		Robot robot= context.getBean("robot",Robot.class);
		System.out.println(robot);
	}
	//System.out.println(chip);
}
