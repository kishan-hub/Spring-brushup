package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// get System date and time
		Calendar cl=Calendar.getInstance();
		//get current hour of the day
		int hour=cl.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<12)
			msg="Good morning";
		else if(hour<16)
			msg="Good afternoon";
		else if(hour<20)
			msg="Good evening";
		else
			msg="Good Night";
		
		return new ModelAndView("result","wmsg",msg);
	}
}
