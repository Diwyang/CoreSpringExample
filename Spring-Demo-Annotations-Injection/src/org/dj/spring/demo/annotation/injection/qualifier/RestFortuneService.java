package org.dj.spring.demo.annotation.injection.qualifier;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return null;
	}

}
