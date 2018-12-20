package com.test.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LittleSwimCoach implements Coach {

	@Autowired
	@Qualifier("fromFileFortuneService")
	FortuneService fortuneService;
	
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "You swim until you reach Japan!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
