package com.spring.jdbc.demo;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class ProjectDAO {
 
	private JdbcTemplate jdbcTemplate;
	
	public ProjectDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void getProject(final int projectNo) {
		
//		PreparedStatementCreator creator=new PreparedStatementCreator() {
//			private final String SQL_QUERY="select * from project where Project_No=?";
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				// TODO Auto-generated method stub
//				PreparedStatement pstmt =con.prepareStatement(SQL_QUERY);
//				pstmt.setInt(1, projectNo);
//				return pstmt;
//			}
//		};
//		
//		PreparedStatementCallback<List<ProjectBO>> callback
//		     =new PreparedStatementCallback<List<ProjectBO>>() {
//
//			@Override
//			public List<ProjectBO> doInPreparedStatement(PreparedStatement ps)
//					throws SQLException, DataAccessException {
//				
//				List<ProjectBO> projectBoList= new ArrayList<ProjectBO>();
//				ProjectBO projectBO=null;
//				
//				ResultSet rs =ps.executeQuery();
//				while(rs.next()) {
//					projectBO=new ProjectBO();
//					projectBO.setProject_no(rs.getInt("PROJECT_NO"));
//					projectBO.setName(rs.getString("PROJECT_NM"));
//				   projectBoList.add(projectBO);
//				}
//				
//				return projectBoList;
//			}
//		};
		 PreparedStatementCreator creator = con -> {
	            final String QUERY="select * from project where project_no=?";
			    PreparedStatement pstmt = con.prepareStatement(QUERY);
	            pstmt.setInt(1, projectNo);
	            return pstmt;
	        };

	        PreparedStatementCallback<List<ProjectBO>> callback = ps -> {
	            List<ProjectBO> projectBoList = new ArrayList<>();
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                ProjectBO projectBO = new ProjectBO();
	                projectBO.setProject_no(rs.getInt("PROJECT_NO"));
	                projectBO.setName(rs.getString("PROJECT_NM"));
	                projectBoList.add(projectBO);
	            }
				return projectBoList;
			 };
		
		  List<ProjectBO> projectsBos=jdbcTemplate.execute(creator,callback);
		
		    projectsBos.forEach(System.out::println);
		
		
	   }
}
