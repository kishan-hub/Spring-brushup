package com.nt.dto;

import java.io.Serializable;

public class SearchResultDTO implements Serializable {
	private int no;
	private String name,desg;
	private int salary,mgrno,deptno;
	public SearchResultDTO() {
	
	}
	public SearchResultDTO(int no, String name, String desg, int salary,
			int mgrno, int deptno) {
			this.no = no;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
		this.mgrno = mgrno;
		this.deptno = deptno;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getMgrno() {
		return mgrno;
	}
	public void setMgrno(int mgrno) {
		this.mgrno = mgrno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
	

}
