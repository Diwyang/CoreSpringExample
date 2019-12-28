package org.dj.spring.demo.Injection.literalvalues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		//Demo for Constructor Injecetion
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);

		//call the Methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Let's call the new method for the Fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach);
		
		//Demo for setter injection
		//retrieve bean from spring container
		theCoach = context.getBean("myCricketCoach",Coach.class);

		//call the Methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Let's call the new method for the Fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach);
		
		//close the context
		context.close();
	}

}