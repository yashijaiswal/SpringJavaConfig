package com.test.javaconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Department{

	
	private int deptID;
	private String deptName;
	
	@Autowired @Qualifier("address2")
	private Address deptAddr;
	
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Address getDeptAddr() {
		return deptAddr;
	}
	public void setDeptAddr(Address deptAddr) {
		this.deptAddr = deptAddr;
	}
	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + ", deptAddr=" + deptAddr + "]";
	}
	
	
	
}
