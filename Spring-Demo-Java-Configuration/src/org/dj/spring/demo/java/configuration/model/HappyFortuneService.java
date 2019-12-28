package org.dj.spring.demo.java.configuration.model;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your Luck Day!!!!!!!";
	}

}
