package org.dj.spring.demo.bean.scope.lifecycle;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your Luck Day!!!!!!!";
	}

}
