package com.sfc.initilizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class RedBusInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		// TODO Auto-generated method stub
          ContextLoaderListener contextLoaderListner=null;
          DispatcherServlet dispatcherServlet=null;
          contextLoaderListner=new ContextLoaderListener();
          context.addListener(contextLoaderListner);
          dispatcherServlet=new DispatcherServlet();
          ServletRegistration.Dynamic dy=context.addServlet("dispatcher",dispatcherServlet);
          dy.addMapping("*.htm");
	}

}
