package com.test.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"Beware of the worlf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		// pick a random string from the array of strings
		
		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
