package com.test.javaconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.test.javaconfig.beans.Employee;

public class App {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		List<String> list = new ArrayList<String>();
		list.add("Pintu");
		list.add("Gabbar");
		list.add("Samba");
		list.add("thakur");
		

		Employee emp = context.getBean(Employee.class);
		emp.setEmpDesg("Executive-1");
		emp.setEmpID(1);
		emp.setEmpName("Rajesh");
		emp.setSalary(20000);
		emp.setNames(list);
		System.out.println(emp.toString());
		

		((AbstractApplicationContext) context).registerShutdownHook();

	}

}
