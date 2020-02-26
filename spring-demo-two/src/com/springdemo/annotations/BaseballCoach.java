package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component

public class BaseballCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	//default constructor 
	public BaseballCoach()
	{
		System.out.println("no-arg constructor");
	}
	
	/*@Autowired
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
    */
	//define a setter method
	/*@Autowired
	public void setFor(FortuneService fortuneService) {
		System.out.println("setter method");
		this.fortuneService = fortuneService;
	}
	@Autowired
	public void setMyAge()
	{
		System.out.println("age is 23");
	}*/
	
  public void hai()
  {
	  System.out.println("hai");
  }
  
	
	
	@Override
	public String getCapacity() {
		// TODO Auto-generated method stub
		return "hai my name is harika";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
