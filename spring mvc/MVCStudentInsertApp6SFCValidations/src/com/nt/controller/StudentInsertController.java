package com.nt.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;

public class StudentInsertController extends SimpleFormController {
	 private StudentInsertService  service;
	
	
	public void setService(StudentInsertService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		return new ModelAndView("dblpost");
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		//type cast cmd obj
		StudentCommand cmd=(StudentCommand)command;
		// B.logic related validation
		if(cmd.getSadd().equals("delhi")){
			errors.rejectValue("sadd","sadd.city");
			return showForm(request,response, errors) ;
		}
		
		//Convert Command obj to DTO obj
		StudentDTO  dto=new StudentDTO();
		dto.setSno(cmd.getSno());
		dto.setSname(cmd.getSname());
		dto.setSadd(cmd.getSadd());
		//Use Service class
		String result=service.register(dto);
		//return ModelAndView obj
		return new ModelAndView(this.getSuccessView(),"resMsg",result);
	
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		
		int no=Integer.parseInt(request.getParameter("id"));
	   StudentCommand cmd=new StudentCommand();
	   cmd.setSno(no);
	   cmd.setSname("raja111");
	   cmd.setSadd("hyd111");
	   return cmd;
	
	}
	
	

}
