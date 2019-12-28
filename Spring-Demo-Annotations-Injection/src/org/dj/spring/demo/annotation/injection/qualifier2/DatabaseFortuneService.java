package org.dj.spring.demo.annotation.injection.qualifier2;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return null;
	}

}
