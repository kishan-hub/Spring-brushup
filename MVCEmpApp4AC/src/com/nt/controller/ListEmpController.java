package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmpDTO;
import com.nt.service.ListEmpService;

public class ListEmpController extends AbstractController {
	 private  ListEmpService service;

	public void setService(ListEmpService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		//use service class logics
		List <EmpDTO> listEmpDTO=service.getAllEmps();
			
		return new ModelAndView("listEmps","empList",listEmpDTO);
	}

}
