package com.spring.jdbc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("application-context.xml");
//        ProjectDAO projectDAO=context.getBean("dao",ProjectDAO.class);
//        ClassicApproachProjectDAO allProject=context.getBean("classisDao",ClassicApproachProjectDAO.class);
        
//        projectDAO.getProject(11);
//        allProject.getAllProject();
        
//        ProjectGetNoOfProject daOfProject=context.getBean("projectDAO",ProjectGetNoOfProject.class);
//         daOfProject.getNoofProject();
        
//        QueryForAllProjectRecords records=context.getBean("allProjectRecords",QueryForAllProjectRecords.class);
//        records.getAllProjects();
        
        ProjectDAOPagination dao = context.getBean("pagiation",ProjectDAOPagination.class);
        dao.getProjects(5, 1);
    }
}
