package com.springboot.demo.MyApp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice Baseball here!!!";
	}
}
