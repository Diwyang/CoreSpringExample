package org.dj.spring.demo.Injection.literalvalues;

public class CricketCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside No-args Constructor for Cricket Coach");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Calling Setter :: fortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Calling Setter :: emailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Calling Setter :: team");
		this.team = team;
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

	@Override
	public String toString() {
		return "CricketCoach [emailAddress=" + emailAddress + ", team=" + team + "]";
	}


}
