package org.dj.spring.demo.Injection.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);

		//call the Methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Let's call the new method for the Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
