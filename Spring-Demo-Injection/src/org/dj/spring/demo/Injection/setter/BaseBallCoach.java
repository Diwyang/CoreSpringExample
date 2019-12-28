package org.dj.spring.demo.Injection.setter;

public class BaseBallCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a construtor for dependency Injection
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "30 Mins workout at Batting";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get fortune
		return fortuneService.getFortune();
	}

}
