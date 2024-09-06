package com.entity;

public class Employee {

	private String name;
	private int eid;
	private String dept;
	private int sal;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, int sal, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid = " + eid + ", name = " + name + ", sal = " + sal + ", dept = " + dept + " ]";
	}

}
