package com.nt.bo;

public class SearchResultBO {
	private int no;
	private String name,desg;
	private int salary,deptno,mgrno;
	
	public SearchResultBO() {
	
	}

	public SearchResultBO(int no, String name, String desg, int salary,
			int deptno, int mgrno) {
		
		this.no = no;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
		this.deptno = deptno;
		this.mgrno = mgrno;
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

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getMgrno() {
		return mgrno;
	}

	public void setMgrno(int mgrno) {
		this.mgrno = mgrno;
	}
	
	

}
