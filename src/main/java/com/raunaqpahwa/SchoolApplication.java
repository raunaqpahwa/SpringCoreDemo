package com.raunaqpahwa;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("school.xml");
		context.registerShutdownHook();
		School school = context.getBean("school", School.class);
		school.operate();
		context.close();
	}

}
