package com.test.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theCoach")
@Component
//@Scope("singleton")
public class TennisCoach implements Coach {

	/**
	 * Se agrega @qualifier para cuando tenemos varios beans y no
	 * esta claro cual debe ser usado para la injeccion...
	 */
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/**
	 * for the setter injection demo to work i have to
	 * comment this constructor!!!!!!
	@Autowired
	public TennisCoach(FortuneService fs) {
		// TODO Auto-generated constructor stub
		
		fortuneService = fs;
	}
	*/
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println(">>TennisCoach: inside default constructor!");
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	/**
	 * you can use any method name for this kind of injection
	 * @param fortuneService
	 */
	/**
	 * commented for the field injection to work
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	 */
	
	// define an init method
	
	// define a destroy method
	@PostConstruct
	public void startupStuff() {
		System.out.println(">>TennisCoach: inside startupStuff");
	}
	
	@PreDestroy
	public void cleanupStuff() {
		System.out.println(">>TennisCoach: inside cleanupStuff");
	}
	
}
