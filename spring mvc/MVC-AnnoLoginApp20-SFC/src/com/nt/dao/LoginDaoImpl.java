package com.nt.dao;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository
public class LoginDaoImpl implements LoginDao {
	private static final String AUTH_QRY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=? "; 
	@Inject
	private JdbcTemplate jt;
	
	@Override
	public int validate(UserBO ubo) {
	 int cnt=jt.queryForInt(AUTH_QRY, ubo.getUser(),ubo.getPwd());	
		return cnt;
	}
	

}
