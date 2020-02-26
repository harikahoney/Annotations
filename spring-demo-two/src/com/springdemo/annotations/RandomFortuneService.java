package com.springdemo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	//create a array of strings
	private String[] data =
			{
		          "hai",
		          "hello","where"
			};
	//create a random num generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
		
	}

}
