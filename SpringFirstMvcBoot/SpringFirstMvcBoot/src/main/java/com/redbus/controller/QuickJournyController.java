package com.redbus.controller;

import java.util.List;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.redbus.dto.QuickJourneyDto;
import com.redbus.service.ManageJourneyService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QuickJournyController extends AbstractController {
	 
	private ManageJourneyService service;
	
	public void setService(ManageJourneyService service) {
		this.service=service;
	}
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
				List<QuickJourneyDto> qDto=service.getRecentJourney();
				ModelAndView mav= new ModelAndView();
				mav.addObject("qDto",qDto);
				mav.setViewName("quick-journey");
				return mav;
	}



}  
