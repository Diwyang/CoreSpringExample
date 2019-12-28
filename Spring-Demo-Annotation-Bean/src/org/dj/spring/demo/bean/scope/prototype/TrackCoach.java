package org.dj.spring.demo.bean.scope.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
