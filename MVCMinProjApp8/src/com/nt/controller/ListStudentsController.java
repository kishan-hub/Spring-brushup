package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ListStudentsController extends AbstractController {
	private StudentService service;
	

	public void setService(StudentService service) {
		this.service = service;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		//use SErivce class
		List<StudentDTO> listDTO=service.listStudents();
		//create MAV obj
		ModelAndView mav=new ModelAndView();
		mav.setViewName("list_students");
		mav.addObject("stList",listDTO);
		return mav;
	}
	

}
