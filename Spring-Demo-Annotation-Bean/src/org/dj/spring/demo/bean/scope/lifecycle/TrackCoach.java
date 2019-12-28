package org.dj.spring.demo.bean.scope.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a construtor for dependency Injection
	@Autowired
	public TrackCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "5K Sprint";
	}

	@Override
	public String getDailyFortune() {
		// use fortune service to get fortune
		return fortuneService.getFortune();
	}

	// add an init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Track Coach :: inside doMyStartUpStuff method");
	}

	// add an destroy method
	@PreDestroy
	public void doMyshutDownStuff() {
		System.out.println("Track Coach :: inside doMyshutDownStuff method");
	}

}
