package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmpBO;
import com.nt.dao.ListEmpDAO;
import com.nt.dto.EmpDTO;

public class ListEmpService {
	private ListEmpDAO dao;

	public void setDao(ListEmpDAO dao) {
		this.dao = dao;
	}
	
	public List<EmpDTO>  getAllEmps(){
		//use DAO class
		List <EmpBO> listEmpBO=dao.retrieveEmps();
		// Copy List of BO objs to List of DTO objs
		List <EmpDTO> listEmpDTO=new  ArrayList<EmpDTO>();
		for(EmpBO bo:listEmpBO){
			EmpDTO empdto=new EmpDTO(bo.getNo(),
					                                                       bo.getName(),
					                                                       bo.getJob(),
					                                                       bo.getSalary());
			listEmpDTO.add(empdto);
		}//for
		return listEmpDTO;
	}//method
}//class

