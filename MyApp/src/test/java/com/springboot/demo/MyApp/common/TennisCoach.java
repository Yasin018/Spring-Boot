package com.springboot.demo.MyApp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice Tennis here!!!";
	}
}
