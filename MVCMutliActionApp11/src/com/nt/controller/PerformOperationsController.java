package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.TestCommand;

public class PerformOperationsController extends MultiActionController {
	
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res,TestCommand cmd){
	      System.out.println(cmd.getSno());
		return new ModelAndView("user","operation","Insert Operation");
	}
	
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res,TestCommand cmd){
		
		return new ModelAndView("user","operation","Update Operation");
	}
	
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,TestCommand cmd){
		
		return new ModelAndView("user","operation","delete Operation");
	}
	
public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,TestCommand cmd){
		
		return new ModelAndView("user","operation","InValid Operation");
	}
	
}
