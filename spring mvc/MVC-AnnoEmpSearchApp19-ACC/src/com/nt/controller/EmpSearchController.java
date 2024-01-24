package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.SearchCmd;
import com.nt.dto.EmployeeDTO;

@Controller
public class EmpSearchController {
	
	@RequestMapping("/performsearch.htm")
	public String  search(ModelMap map,@ModelAttribute SearchCmd cmd){
	
		System.out.println(cmd.getNo()+"  "+cmd.getName());
		
		List<EmployeeDTO> emplist=new ArrayList<EmployeeDTO>();
		EmployeeDTO dto1=new EmployeeDTO(101,5000,"raja","clerk");
		EmployeeDTO dto2=new EmployeeDTO(102,6000,"ravi","clerk");
		emplist.add(dto1); emplist.add(dto2);
		// Add result to ModelMap
		map.addAttribute("searchResultsList",emplist);
		
		return "emplist";
		
	}
	
}
