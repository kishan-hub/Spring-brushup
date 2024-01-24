package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ListStudentsController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List <String> list=new ArrayList<String>();
		list.add("raja"); list.add("ravi"); list.add("jani");
		if(req.getParameter("report").equals("pdf"))
			return new ModelAndView("pdfView","stList",list);
		else
			return new ModelAndView("excelView","stList",list);
	}

}
