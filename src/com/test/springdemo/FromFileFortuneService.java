package com.test.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FromFileFortuneService implements FortuneService {

	@Value("#{'${foo.fortunes}'.split(',')}")
	private String[] fortunes;
	
	private Random random= new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		//System.out.println(fortunes.length);
		int index = random.nextInt(fortunes.length);
		
		String fortune= fortunes[index];
		
		return fortune;
	}

}
