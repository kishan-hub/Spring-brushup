package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class StudentUpdateController extends SimpleFormController {
	private StudentService service;
	
	public void setService(StudentService service) {
		this.service = service;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		//read sno 
		int no=Integer.parseInt(request.getParameter("id"));
		
		//use Service class
		StudentDTO dto=service.searchStudentBySno(no);
		//create Command class obj and place DTO obj
		StudentCommand  cmd=new StudentCommand();
		cmd.setSno(dto.getSno());
		cmd.setSname(dto.getSname());
		cmd.setSadd(dto.getSadd());
		
		return cmd;
	}//method
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// typecast command
		StudentCommand cmd=(StudentCommand)command;
		//convert Command obj to DTO obj
		StudentDTO dto=new StudentDTO();
		dto.setSno(cmd.getSno());
		dto.setSname(cmd.getSname());
		dto.setSadd(cmd.getSadd());
		//use Service class
		String updMsg=service.updateStudentBySno(dto);
		return new ModelAndView(getSuccessView(),"updResult",updMsg);
	}
	
	
}
