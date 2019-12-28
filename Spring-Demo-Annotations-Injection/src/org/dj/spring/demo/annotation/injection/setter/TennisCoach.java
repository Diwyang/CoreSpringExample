package org.dj.spring.demo.annotation.injection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("inside no-args constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practise your backend Volley...";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get fortune
		return fortuneService.getFortune();
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setFortuneService :: for Setter Injection");
		this.fortuneService = fortuneService;
	}

}
