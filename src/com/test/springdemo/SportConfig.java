package com.test.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.test.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	
	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for swim coach and inject dependency
	
	@Bean
	public Coach swimCoach() {
		//we inject dependency with the method........
		return new SwimCoach(sadFortuneService());
	}
	
}


