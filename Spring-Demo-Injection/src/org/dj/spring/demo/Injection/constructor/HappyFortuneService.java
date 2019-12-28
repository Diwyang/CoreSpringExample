package org.dj.spring.demo.Injection.constructor;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your Luck Day!!!!!!!";
	}

}
