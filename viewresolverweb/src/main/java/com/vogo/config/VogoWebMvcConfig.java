package com.vogo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = {"com.vogo.controller"})
public class VogoWebMvcConfig implements WebMvcConfigurer{

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		// TODO Auto-generated method stub
//		 registry.addViewController("/home.htm").setViewName("home");
//	}
//
//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		// TODO Auto-generated method stub
//		registry.jsp().prefix("/WEB-INF/jsp/").suffix(".jsp");
//		
//	}   
}
