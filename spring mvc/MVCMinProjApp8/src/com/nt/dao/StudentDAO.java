package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	public  List<StudentBO> getAllStudents();
	public  int insert(StudentBO bo);
	public  StudentBO  getStudent(int no);
	public int update(StudentBO bo);

}
