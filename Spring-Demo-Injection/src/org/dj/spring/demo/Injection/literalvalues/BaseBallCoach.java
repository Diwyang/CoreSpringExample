package org.dj.spring.demo.Injection.literalvalues;

public class BaseBallCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "BaseBallCoach [emailAddress=" + emailAddress + ", team=" + team + "]";
	}
	
	

}
