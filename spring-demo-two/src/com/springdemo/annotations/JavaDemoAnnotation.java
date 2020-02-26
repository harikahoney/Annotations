package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaDemoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
   Coach theCoach = context.getBean("baseballCoach",Coach.class);
    System.out.println(theCoach.getCapacity());
    System.out.println(theCoach.getFortune());
    context.close();
		
		
		
	}

}
