package com.mapping.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mapping.dao.Categories;

public class IOCContainerServlet extends HttpServlet {

	private static final long serialVersionUID = -1244283167049705777L;
	Categories category=null;
	    @Override
	    public void init(ServletConfig config) throws ServletException {
	        super.init(config);

	        // Get the ServletContext from the ServletConfig
	        ServletContext context = config.getServletContext();

	        // Read the context parameter value
	        String myContextParamValue = context.getInitParameter("contextConfigLocation");
	        ApplicationContext appContext=new ClassPathXmlApplicationContext("application-context.xml");
       	   category = (Categories)appContext.getBean("categories",Categories.class);

	        System.out.println(category);
	    }

	    // Other methods of your servlet go here
	    @Override
	    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	 //set the context type
	    	resp.setContentType("text/html");	    	
	    	resp.getWriter().println("<h1 style=\"color:green;font-family: fantasy;\">Welcome to myFirst MVC Application</h1>");
	    	resp.getWriter().println("<h1 style=\"color:green;font-family: fantasy;\">"+category.getCategoryID()+" "+category.getName()+"</h1>");
	    	//close the object
	    	resp.getWriter().close();
	    }
	}

