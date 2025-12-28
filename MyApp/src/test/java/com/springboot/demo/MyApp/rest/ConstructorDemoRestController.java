package com.springboot.demo.MyApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.MyApp.common.Coach;

@RestController
public class ConstructorDemoRestController {
	private Coach myCoach;
	
	
	  //Constructor injection
		@Autowired
		public ConstructorDemoRestController(@Qualifier("volleyballCoach") Coach theCoach) {
			myCoach = theCoach;
		}
	 
	
	/*
	 * //setter injection
	 * 
	 * @Autowired public void setCoach(Coach theCoach) { myCoach = theCoach; }
	 */
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
