package com.test.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("tennisCoach",Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		// check if they are the same
		boolean result = (coach==alphaCoach);
		
		System.out.println("\nPointing to the same object: "+result);
		
		System.out.println("\nMemory location for coach: "+coach);
		
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
	}

}
