package com.raunaqpahwa;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class School implements InitializingBean, DisposableBean {
	
	private String name;
	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void operate() {
		System.out.println("School is now functioning");
	}
	public void destroy() throws Exception {
		System.out.format("%s is being shut down \n", name);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.format("Inaugral ceremony of %s \n", name);
	}
	
}
