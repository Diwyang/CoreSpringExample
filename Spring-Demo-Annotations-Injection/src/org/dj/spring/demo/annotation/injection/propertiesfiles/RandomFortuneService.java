package org.dj.spring.demo.annotation.injection.propertiesfiles;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Random Day Lucky";
	}

}
