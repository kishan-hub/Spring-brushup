package com.spring.jdbc.demo;

public class ProjectBO {

	private int project_no;
	
	private String name;

	public int getProject_no() {
		return project_no;
	}

	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProjectBO [project_no=" + project_no + ", name=" + name + "]";
	}
	
}
