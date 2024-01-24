package com.nt.service;

import java.util.Calendar;

import javax.inject.Named;

@Named("ws")
public class WishService {
	
	public String generateWishMsg(){
		// generate wish Msg based on current hour the day
		Calendar cl=Calendar.getInstance();
		int hour=cl.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			return  "Good morning";
		else if(hour<=16)
			return "Good After noon";
		else if (hour<=20)
		  return "Good Evening";
		else
			return "Good Night";
	}//method

}//class

