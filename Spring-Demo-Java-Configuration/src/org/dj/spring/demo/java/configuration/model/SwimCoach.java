package org.dj.spring.demo.java.configuration.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	// define a construtor for dependency Injection
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000m for warm up";
	}

	@Override
	public String getDailyFortune() {
		// use fortune service to get fortune
		return fortuneService.getFortune();
	}

	@Override
	public String toString() {
		return "SwimCoach [email=" + email + ", team=" + team + "]";
	}

	
}
