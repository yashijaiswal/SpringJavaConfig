package com.test.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.javaconfig.beans.Address;
import com.test.javaconfig.beans.Department;
import com.test.javaconfig.beans.Employee;

@Configuration
public class JavaConfiguration {
	
	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		return emp;
	}
	
	@Bean
	public Department dept() {
		Department dep = new Department();
		dep.setDeptID(1234);
		dep.setDeptName("Production");
		return dep;
	}
	
	@Bean(name = "address1")
	public Address addr1() {
		Address addr1 = new Address();
		addr1.setCity("Greater Noida");
		addr1.setStreet("Ek Murti");
		addr1.setState("UP");
		addr1.setCountry("India");
		return addr1;

	}

	@Bean(name = "address2")
	public Address addr2() {
		Address addr2 = new Address();
		addr2.setCity("Noida");
		addr2.setStreet("Sector 26");
		addr2.setState("UP");
		addr2.setCountry("India");
		return addr2;
	}
	 

}
