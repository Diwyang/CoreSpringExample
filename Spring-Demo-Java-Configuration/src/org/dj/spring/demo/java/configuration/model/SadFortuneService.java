package org.dj.spring.demo.java.configuration.model;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your Sad Day!!!!!!!";
	}

}
