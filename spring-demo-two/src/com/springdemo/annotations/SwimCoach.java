package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	@Override
	public String getCapacity() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	

}
