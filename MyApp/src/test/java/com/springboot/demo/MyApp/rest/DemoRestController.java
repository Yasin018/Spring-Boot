package com.springboot.demo.MyApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	//injecting properties 
	@Value("${me.name}")
	private String name;
	@Value("${me.company}")
	private String workingAt;
	@Value("${me.goal}")
	private String goal;
	
	@GetMapping("/myInfo")
	public String getMyInfo() {
		return "My name is " +name+ ". Working at "+workingAt+ ". My goal is to " +goal;
	}
	
	@GetMapping("/")
	public String sayhello() {
		return "Hello World!";
	}

	@GetMapping("/autoreload")
	public String testAutoReload() {
		return "Project Auto Reloaded Using SpringBoot Dev Tools Dependency";
	}
	
}
