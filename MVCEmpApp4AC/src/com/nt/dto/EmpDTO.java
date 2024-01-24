package com.nt.dto;

import java.io.Serializable;

public class EmpDTO implements Serializable  {
	private int no;
	private String name,job;
	private int salary;
	
	public EmpDTO() {
		System.out.println("EmpDTO:0-param constructor");
	}

	public EmpDTO(int no, String name, String job, int salary) {
		System.out.println("EmpDTO:4-param constructor");
		this.no = no;
		this.name = name;
		this.job = job;
		this.salary = salary;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
