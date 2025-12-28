package com.springboot.demo.MyApp.common;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice Volleyball here!!!";
	}
}
