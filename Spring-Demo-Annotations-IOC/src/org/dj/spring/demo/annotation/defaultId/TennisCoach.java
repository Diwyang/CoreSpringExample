package org.dj.spring.demo.annotation.defaultId;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise your backend Volley...";
	}

}
