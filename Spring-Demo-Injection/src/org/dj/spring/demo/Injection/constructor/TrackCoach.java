package org.dj.spring.demo.Injection.constructor;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a construtor for dependency Injection
	public TrackCoach(FortuneService fortuneService) {
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
