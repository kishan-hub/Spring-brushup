package com.nt.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		 Calendar cl=Calendar.getInstance(); //sys date and time
		 int hour=cl.get(Calendar.HOUR_OF_DAY); //current hour in 24hr format
		 if(hour<9 || hour>=17){
			 response.sendRedirect("timeout.jsp");
			 return false;
		 }
		 return true;
	}//preHandle
}//class
