package com.nt.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDao;
import com.nt.dto.UserDTO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Inject
	private LoginDao  dao;

	@Override
	public String authtenticate(UserDTO udto) {
		//convert DTO obj to BO obj
		UserBO ubo=new UserBO();
		ubo.setUser(udto.getUser());
		ubo.setPwd(udto.getPwd());
		//Use DAO class
		int cnt=dao.validate(ubo);
		if(cnt==0)
			return "InValid Credentials";
		else
			return "Valid Credentials";
	}

}
