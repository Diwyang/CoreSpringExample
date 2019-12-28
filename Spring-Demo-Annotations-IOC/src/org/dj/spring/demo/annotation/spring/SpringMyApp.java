package org.dj.spring.demo.annotation.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("thatTennisCoach",Coach.class);

		//call the Methods of the bean
		System.out.println(theCoach.getDailyWorkout());

		
		//close the context
		context.close();
	}

}
