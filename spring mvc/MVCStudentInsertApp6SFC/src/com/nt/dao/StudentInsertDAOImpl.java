package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentInsertDAOImpl implements StudentInsertDAO {
	private static final String  INSERT_STUDENT_QRY="INSERT INTO STUDENT values(?,?,?)";
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(StudentBO sbo) {
	int cnt=jt.update(INSERT_STUDENT_QRY,sbo.getSno(),
			                                                                        sbo.getSname(),
			                                                                        sbo.getSadd());
		return cnt;
	}
	

}
