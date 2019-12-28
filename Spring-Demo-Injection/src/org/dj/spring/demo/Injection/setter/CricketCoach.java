package org.dj.spring.demo.Injection.setter;

public class CricketCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside No-args Constructor for Cricket Coach");
	}

	@Override
	public String getDailyWorkout() {
		return "Practise 20 min for fast bowling";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get fortune
		return "Batting done !!!!!   "+fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter Injection called.......");
		this.fortuneService = fortuneService;
	}

}
