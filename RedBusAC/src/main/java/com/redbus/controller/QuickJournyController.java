package com.redbus.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.redbus.dto.QuickJourneyDto;
import com.redbus.service.ManageJourneyService;

public class QuickJournyController extends AbstractController {
	 
	private ManageJourneyService service;
	
	public void setService(ManageJourneyService service) {
		this.service=service;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		List<QuickJourneyDto> qDto=service.getRecentJourney();
		ModelAndView mav= new ModelAndView();
		mav.addObject("qDto",qDto);
		mav.setViewName("quick-journey");
		return mav;
	}



}  
