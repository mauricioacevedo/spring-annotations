package com.test.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// read spring config file
		
AnnotationConfigApplicationContext context =
new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container

		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// get the dailyfortune
		System.out.println(coach.getDailyFortune());
		
		// call our new swim coach methods...has the props values injected
		System.out.println("email: "+coach.getEmail());
		System.out.println("team: "+coach.getTeam());
		
		//close context
		context.close();
	}

}
