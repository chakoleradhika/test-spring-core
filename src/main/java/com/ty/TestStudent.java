package com.ty;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent
{
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my_bean_config.xml");
		
		Student stud =(Student) context.getBean("myStudent");
		
		stud.run();
	}

}
