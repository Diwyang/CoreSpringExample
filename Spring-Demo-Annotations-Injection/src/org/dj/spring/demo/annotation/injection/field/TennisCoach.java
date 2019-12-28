package org.dj.spring.demo.annotation.injection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
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
