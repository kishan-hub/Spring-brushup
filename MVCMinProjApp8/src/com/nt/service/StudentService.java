package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {
	public  List<StudentDTO> listStudents();
	public  String regsiterStudent(StudentDTO dto);
	public  StudentDTO  searchStudentBySno(int no);
	public String updateStudentBySno(StudentDTO dto);

}
