package com.sfc.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sfc.model.AddCriteria;

@SuppressWarnings("deprecation")
public class AddJourneySimpleFormController extends SimpleFormController {

	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		ModelAndView mav=new ModelAndView();
		AddCriteria criteria=(AddCriteria)command;
		mav.addObject("source",criteria.getSource());
		mav.setViewName("success");
		return mav;
	}
}
