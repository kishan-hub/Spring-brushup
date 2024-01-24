package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO dao;
	

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}


	@Override
	public List<StudentDTO> listStudents() {
		//use dao
		List <StudentBO> listBO=dao.getAllStudents();
		//Copy ListBO to List DTO
		List<StudentDTO> listDTO=new ArrayList<StudentDTO>();
		if(listBO!=null){
			for(StudentBO  bo:listBO){
				StudentDTO dto=new StudentDTO();
				dto.setSno(bo.getSno());
				dto.setSname(bo.getSname());
				dto.setSadd(bo.getSadd());
				listDTO.add(dto);
			}//for
			
		}//for
		return listDTO;
	}//method


	@Override
	public String regsiterStudent(StudentDTO dto) {
		//Convert DTO obj BO obj
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use dao
		int cnt=dao.insert(bo);
		if(cnt==0)
			 return "Student Registration Failed";
		else
			return "Student Registration Succeded with no"+bo.getSno();
	}//registerStudent
	
	@Override
	public StudentDTO searchStudentBySno(int no) {
		//use DAO
		StudentBO bo=dao.getStudent(no);
		//convert BO obj to DTO obj
		StudentDTO dto=new StudentDTO();
		dto.setSno(bo.getSno());
		dto.setSname(bo.getSname());
		dto.setSadd(bo.getSadd());
		return dto;
	}
	
	@Override
	public String updateStudentBySno(StudentDTO dto) {
	    //convert DTO obj to BO obj
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use DAO
		int cnt=dao.update(bo);
		if(cnt==0)
			return dto.getSno()+" student not for updation";
		else
			return dto.getSno()+" student details are updated";
	}
	

}//class
