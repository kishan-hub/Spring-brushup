package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegisterCommand;

public class RegisterController extends AbstractWizardFormController{

	/*public RegisterController(){
		setCommandName("userForm");
	}*/
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		System.out.println("RegisterController.formBackingObject(-)");
		return new RegisterCommand();
		
	}
	@Override
	protected ModelAndView processFinish(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println("RegisterController.processFinish(-,-,-,-)");
		//Get the data from command object
		RegisterCommand cmd = (RegisterCommand)command;
		
		//where is the finish page?
		return new ModelAndView("result", "res", cmd);
		
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println("RegisterController.processCancel(-,-,-,-)");
		//where is the cancel page?
		return new ModelAndView("welcome");
	}
	
}