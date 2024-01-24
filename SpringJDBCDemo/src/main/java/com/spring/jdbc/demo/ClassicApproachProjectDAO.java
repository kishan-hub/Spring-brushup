package com.spring.jdbc.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;

import com.mysql.cj.exceptions.RSAException;

public class ClassicApproachProjectDAO {
 
	private JdbcTemplate jdbcTemplate;
	public ClassicApproachProjectDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate =jdbcTemplate;
	}
	public void getAllProject() {
	 List<ProjectBO> projectBoList=jdbcTemplate.execute(new ProjectStatementCallback());
	 projectBoList.forEach(System.out::println);
	}
	
	private  final class ProjectStatementCallback implements
    StatementCallback<List<ProjectBO>>{
     private final String SQL_QUERY="select * from project";

    @Override
     public List<ProjectBO> doInStatement(Statement stmt) throws SQLException, DataAccessException {
	   List<ProjectBO> boList=new ArrayList<ProjectBO>();
	   ProjectBO projectBO =null;
	   ResultSet rs =stmt.executeQuery(SQL_QUERY);
	     while(rs.next()) {
		  projectBO=new ProjectBO();
		  projectBO.setProject_no(rs.getInt("project_no"));
		  projectBO.setName(rs.getString("project_nm"));
		  boList.add(projectBO);
	     }
	       return boList;
  }

  }
}
