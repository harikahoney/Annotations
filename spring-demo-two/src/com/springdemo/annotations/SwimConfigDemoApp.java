package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
   SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
    System.out.println(theCoach.getCapacity());
    System.out.println(theCoach.getFortune());
    //call new methods swimcoach and props values injected
    System.out.println("email:" + theCoach.getEmail());
    System.out.println("team:" + theCoach.getTeam());
    context.close();
		
		
		
	}

}
