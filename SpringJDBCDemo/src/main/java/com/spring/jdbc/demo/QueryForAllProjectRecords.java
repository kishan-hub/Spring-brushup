package com.spring.jdbc.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class QueryForAllProjectRecords {
  
	private JdbcTemplate jdbcTemplate;
	
	private final String SQL_NO_OF_PROJECT="SELECT * FROM PROJECT";
	
	public QueryForAllProjectRecords(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public void getAllProjects() {
		
	jdbcTemplate.queryForObject(SQL_NO_OF_PROJECT, new ProjectRowMapper())
	            .forEach(System.out::println);
		         
	}
	private final class ProjectRowMapper implements RowMapper<List<ProjectBO>>{

		@Override
		public List<ProjectBO> mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			List<ProjectBO> boList=new ArrayList<ProjectBO>();
			while(rs.next()) {
				ProjectBO bo =new ProjectBO();
				bo.setProject_no(rs.getInt(1));
				bo.setName(rs.getString(2));
				boList.add(bo);
			}
			return boList;
		}
		
	}
}
