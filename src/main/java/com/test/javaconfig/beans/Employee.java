package com.test.javaconfig.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee{
		
	private int empID;
	private String empName;
	private String empDesg;
	private long salary;
	
	@Autowired
	private Department dept;
	
	@Autowired @Qualifier("address1")
	private Address addr;
	
	private List<String> names;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID +  ", empName=" + empName + ", empDesg=" + empDesg + ", salary=" + salary
				+ ", dept=" + dept + ", addr=" + addr + ", names=" + names + "]";
	}
	
	
	

}
