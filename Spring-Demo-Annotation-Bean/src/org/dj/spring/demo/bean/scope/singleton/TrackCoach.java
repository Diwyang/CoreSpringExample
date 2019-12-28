package org.dj.spring.demo.bean.scope.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a construtor for dependency Injection
	@Autowired
	public TrackCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
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

}
