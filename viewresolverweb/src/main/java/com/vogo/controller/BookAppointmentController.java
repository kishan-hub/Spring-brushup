package com.vogo.controller;

import java.security.SecureRandom;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.vogo.dto.AppointmentDto;

public class BookAppointmentController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav =null;
		AppointmentDto appointment=null;
		LocalDateTime appointmentTime=null;
		
		appointmentTime =LocalDateTime.parse(request.getParameter("apdate"));
		appointment =new AppointmentDto();
		appointment.setAppointmentNo(new SecureRandom().nextInt());
	    appointment.setPatientNameString("pname");
	    appointment.setDoctorName(request.getParameter("dname"));
	    appointment.setAppointmentDate(appointmentTime);
	     
	    //store into database
	    mav =new ModelAndView();
	    mav.addObject("appointment",appointment);
	    mav.setViewName("appointment-details");
	    
		return mav;
	}

}
