package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmpBO;

public class ListEmpDAO {
	private static final String  GET_ALL_EMP_DETAILS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public List<EmpBO> retrieveEmps(){
		
		List<EmpBO> listEmpBO=(List<EmpBO>)jt.query(GET_ALL_EMP_DETAILS,
				                                                          new EmpRowMapper());
		return listEmpBO;
	}
	
	private class EmpRowMapper implements RowMapper<EmpBO>{

		@Override
		public EmpBO mapRow(ResultSet rs, int pos) throws SQLException {
             //Place ResultSet obj record into BO class obj
			EmpBO empbo=new EmpBO(rs.getInt(1),
					                                                 rs.getString(2),
					                                                 rs.getString(3),
					                                                 rs.getInt(4));
			return empbo;
		}//mapRow
		
	}//inner class
	
}//clas

