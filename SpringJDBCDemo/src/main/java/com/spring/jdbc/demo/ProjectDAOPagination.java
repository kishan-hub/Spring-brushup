package com.spring.jdbc.demo;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;import com.mysql.cj.result.Row;

public class ProjectDAOPagination {

	private JdbcTemplate jdbcTemplate;
	
	private final  String SQL_FOR_PROJECT ="SELECT * from PROJECT ORDER BY PROJECT_NM";
	
	public ProjectDAOPagination(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void getProjects(int pageSize,int pageNo) {
     List<ProjectBO> boList=jdbcTemplate.query(SQL_FOR_PROJECT, new ProjectResultSetExtracter(pageSize, pageNo));
	  boList.forEach(System.out::println);
	}
	
	private final class ProjectResultSetExtracter implements ResultSetExtractor<List<ProjectBO>>{
           private int pageSize;
           private int pageNo;
           
         public ProjectResultSetExtracter(int pageSize,int pageNo) {
        	 this.pageSize=pageSize;
        	 this.pageNo=pageNo;
         }
           
		@Override
		public List<ProjectBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			int startIndex=(pageSize *(pageNo-1))+1;
			int endIndex= pageSize*pageNo;
			int rowIndex=1;
			ProjectBO projectBO=null;
			List<ProjectBO> projectsBos=null;
			
			projectsBos=new ArrayList<ProjectBO>();
			
			while (rs.next() && rowIndex<=endIndex) {
				if(rowIndex>=startIndex) {
					projectBO=new ProjectBO();
					projectBO.setProject_no(rs.getInt(1));
					projectBO.setName(rs.getString(2));
					projectsBos.add(projectBO);
				}
				rowIndex++;
				
			}
			return projectsBos;
		}
		
	}
}
