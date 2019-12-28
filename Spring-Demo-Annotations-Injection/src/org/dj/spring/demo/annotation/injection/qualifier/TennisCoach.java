package org.dj.spring.demo.annotation.injection.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
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

}
