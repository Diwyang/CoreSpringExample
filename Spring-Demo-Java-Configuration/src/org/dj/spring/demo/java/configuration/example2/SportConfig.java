package org.dj.spring.demo.java.configuration.example2;

import org.dj.spring.demo.java.configuration.model.Coach;
import org.dj.spring.demo.java.configuration.model.FortuneService;
import org.dj.spring.demo.java.configuration.model.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.dj.spring.demo.java.configuration.model")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	

	@Bean
	public FortuneService SadFortuneService() {
		return new org.dj.spring.demo.java.configuration.model.SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(SadFortuneService());
	}
}
