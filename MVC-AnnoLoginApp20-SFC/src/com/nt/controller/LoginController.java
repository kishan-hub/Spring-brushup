package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.User;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;
import com.nt.validator.LoginValidator;

@Controller
public class LoginController {
	
	@Inject
	private LoginService service;
	
	@Inject
	private LoginValidator validator;
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(Model model){
		//create command obj and keep it as model attribute
		User user=new User();
		model.addAttribute("userCmd",user);
		//return lvn
		return "login";
	}

	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String  processForm(Model model,@ModelAttribute("userCmd")User cmd,BindingResult errors){
		//convert Command obj to DTO obj
		UserDTO udto=new UserDTO();
		udto.setUser(cmd.getUser());
		udto.setPwd(cmd.getPwd());
		
		//use validator
		if(validator.supports(User.class)){
			validator.validate(cmd, errors);
			  if(errors.hasErrors()){
				  return "login";
			  }
		}
		//use service class
		String result=service.authtenticate(udto);
		model.addAttribute("result",result);
		//return lvn
		return "login";
	}

	
	@ModelAttribute("domains")  // alternate for referenceData
	public List<String>  populateDomains(){
		List <String>domainsList =new ArrayList<String>();
		 domainsList.add("Gmail.com");
		 domainsList.add("yahoo.com");
		 domainsList.add("rediff.com");
		 return domainsList;
	}
	
	@InitBinder
	public void  myInitBinder(WebDataBinder binder){
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class,
				                                                new CustomDateEditor(sdf,true));
	}
	
	
		 
}		
		
