package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demospring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appDemoAnn.xml");
   Coach theCoach = context.getBean("baseballCoach",Coach.class);
    System.out.println(theCoach.getCapacity());
    System.out.println(theCoach.getFortune());
    context.close();
		
		
		
	}

}
