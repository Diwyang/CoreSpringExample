package org.dj.spring.demo.annotation.injection.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("qualifier-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);

		//call the Methods of the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
