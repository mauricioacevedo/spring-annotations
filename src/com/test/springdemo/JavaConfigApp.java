package com.test.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// read spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		/** 
		* because the bean just have @Component 
		* you can call the bean with the same name as the class
		* but using the first letter lowerCase:
		*/
		//Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach coach = context.getBean("swimCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// get the dailyfortune
		System.out.println(coach.getDailyFortune());
		
		//close context
		context.close();
	}

}
