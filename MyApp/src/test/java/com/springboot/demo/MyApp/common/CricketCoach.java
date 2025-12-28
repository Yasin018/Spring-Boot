package com.springboot.demo.MyApp.common;

import org.springframework.stereotype.Component;

//component allows this class to act as a spring bean & makes it available for dependency injection
@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice Spring boot daily for 30mins - 1 hour";
	}

}
