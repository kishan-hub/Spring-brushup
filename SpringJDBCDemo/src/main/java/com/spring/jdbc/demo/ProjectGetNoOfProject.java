package com.spring.jdbc.demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProjectGetNoOfProject {

	private JdbcTemplate jdbcTemplate;
	
	private  final String SQL_NO_OF_PROJECT="select COUNT(*) from project";
	
	public ProjectGetNoOfProject(JdbcTemplate jdbTemplate) {
		this.jdbcTemplate=jdbTemplate;
	}
	
	public void getNoofProject() {
		int count=jdbcTemplate.queryForObject(SQL_NO_OF_PROJECT, Integer.class);
		System.out.println("Total no of Project:"+count);
	}
}
