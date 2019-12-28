package org.dj.spring.demo.annotation.injection.qualifier2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your Luck Day!!!!!!!";
	}

}
