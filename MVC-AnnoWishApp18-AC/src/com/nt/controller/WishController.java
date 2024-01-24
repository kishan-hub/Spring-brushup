package com.nt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	
	@Resource
	private WishService service;
	
/*	@RequestMapping("/wish.htm")
	public  ModelAndView process(){
		//use service class
		String msg=service.generateWishMsg();
		
		return new ModelAndView("result","wmsg",msg);
	}//process */
	
/*	@RequestMapping("/wish.htm")
	public  String  process(Model model){
		
		//use service class
		String msg=service.generateWishMsg();
		
		// add data to mode
		model.addAttribute("wmsg",msg);
		
		return "result";
	} */
	
/*	@RequestMapping("/wish.htm")
	public  String  process(ModelMap map){
		
		//use service class
		String msg=service.generateWishMsg();
		
		map.addAttribute("wmsg", msg);
		return "result";
	} */
	
/*	@RequestMapping("/wish.htm")
	public  String  process(Map<String,Object> map){
		
		//use service class
		String msg=service.generateWishMsg();
		
		map.put("wmsg",msg);
		return "result";
	} */
	
	@RequestMapping("/wish.htm")
	public void process(Model model){
		//Use service class
		String msg=service.generateWishMsg();
		
		model.addAttribute("wmsg",msg);
	}
	
	
	
	
}//class

