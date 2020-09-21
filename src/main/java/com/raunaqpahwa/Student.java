package com.raunaqpahwa;

public class Student {
	private String name;
	private int age;
	private String address;
	
	// Constructor injection
	Student() {
		
	}
	Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	// Setter Injection
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void initStudent() {
		System.out.format("School has admitted Student %s \n", name);
	}
	
	public void destroyStudent() {
		System.out.format("Student %s has passed out from School \n", name);
	}
}
