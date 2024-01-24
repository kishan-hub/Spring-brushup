package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	  private static final String  GET_ALL_STUDENTS_QRY="SELECT SNO,SNAME,SADD FROM STUDENT ";
      private static final String  INSERT_STUDENT_QRY="INSERT INTO STUDENT VALUES(?,?,?)";
      private static final String  GET_STUDENT_BY_SNO="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SNO=?";
      private static  final  String UPDATE_STUDENT_BY_NO="UPDATE STUDENT SET SNAME=? , SADD=? WHERE SNO=?";  
		
      private JdbcTemplate  jt;
		
	  public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<StudentBO> getAllStudents() {
		List<StudentBO> listBO=jt.query(GET_ALL_STUDENTS_QRY, new StudentRowMapper());
		return listBO;
	}
	private class StudentRowMapper implements RowMapper<StudentBO>{

		@Override
		public StudentBO mapRow(ResultSet rs, int pos) throws SQLException {
			   StudentBO bo=new StudentBO();
			   bo.setSno(rs.getInt(1));
			   bo.setSname(rs.getString(2));
			   bo.setSadd(rs.getString(3));
			   
			return bo;
		}
		
	}//inner class
	
	@Override
	public int insert(StudentBO bo) {
		int cnt=jt.update(INSERT_STUDENT_QRY, bo.getSno(),
				                                                                         bo.getSname(),
				                                                                         bo.getSadd());
		return cnt;
		
	
	}
	
	@Override
	public StudentBO getStudent(int no) {
		StudentBO bo=jt.queryForObject(GET_STUDENT_BY_SNO, new StudentRowMapper(), no);
		
		return bo;
		
	}
	
	public int update(StudentBO bo){
		int cnt=jt.update(UPDATE_STUDENT_BY_NO, bo.getSname(),bo.getSadd(),bo.getSno());
		return cnt;
	}
	
	

}
