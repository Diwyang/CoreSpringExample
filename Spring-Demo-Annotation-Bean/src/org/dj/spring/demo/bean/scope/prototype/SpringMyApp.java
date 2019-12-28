package org.dj.spring.demo.bean.scope.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("prototype-ApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach",Coach.class);
		
		
		Coach alphaCoach = context.getBean("trackCoach",Coach.class);

		//Check if they are the same bean
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		System.out.println("\npointing to the same object "+result);
		
		System.out.println("\nMemory location for theCoach  "+theCoach);
		
		System.out.println("\nMemory location for alphaCoach  "+alphaCoach);
		
		//close the context
		context.close();
	}

}
