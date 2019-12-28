package org.dj.spring.demo.bean.scope.lifecycle;

public class BaseBallCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a construtor for dependency Injection
	public BaseBallCoach(FortuneService fortuneService) {
		System.out.println("BaseBallCoach :: in Construstor dependency injection");
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
	
	//add an init method
	public void doMyStartUpStuff() {
		System.out.println("BaseBall Coach :: inside doMyStartUpStuff method");
	}
	
	
	//add an destroy method
	public void doMyshutDownStuff() {
		System.out.println("BaseBall Coach :: inside doMyshutDownStuff method");
	}
}
