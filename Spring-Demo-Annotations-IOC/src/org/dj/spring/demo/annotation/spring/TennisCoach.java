package org.dj.spring.demo.annotation.spring;

import org.springframework.stereotype.Component;

@Component("thatTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise your backend Volley...";
	}

}
