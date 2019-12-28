package org.dj.spring.demo.java.configuration.example1;

import org.dj.spring.demo.java.configuration.model.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {

		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);

		// call the Methods of the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
