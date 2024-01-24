package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService{
	private StudentInsertDAO dao;

	public void setDao(StudentInsertDAO dao) {
		this.dao = dao;
	}


	@Override
	public String register(StudentDTO dto) {
		// Convert DTO obj BO obj
		StudentBO sbo=new StudentBO();
		sbo.setSno(dto.getSno());
		sbo.setSname(dto.getSname());
		sbo.setSadd(dto.getSadd());
		//Use DAO
		int cnt=dao.insert(sbo);
		if(cnt==0)
			return " Student Regisration Failed";
		else
			return " Student Regisration Succeded with no"+sbo.getSno();
	}
	

}
