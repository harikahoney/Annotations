package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appDemoAnn.xml");
		Coach theCoach = context.getBean("baseballCoach",Coach.class);
		Coach alphaCoach = context.getBean("baseballCoach",Coach.class);
		boolean result = (theCoach ==  alphaCoach);
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		System.out.println();
        context.close();
	}

}
