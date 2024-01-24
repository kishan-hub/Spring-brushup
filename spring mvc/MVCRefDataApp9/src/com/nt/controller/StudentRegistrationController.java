package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class StudentRegistrationController extends SimpleFormController {
	
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		System.out.println("SRC: referenceData(-)");
		Map<String,List> map=new HashMap<String,List>();
		    List <String> courses=new ArrayList();
		    courses.add("spring"); courses.add("hibernate");
		    courses.add("adv.java"); courses.add("webservices");
		   map.put("courseList",courses);
		   return map;
		    
	} 
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		return new ModelAndView("register_result");
	
	}

}
