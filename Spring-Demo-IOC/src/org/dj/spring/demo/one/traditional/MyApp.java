package org.dj.spring.demo.one.traditional;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coach theCoach = new BaseBallCoach();

		System.out.println(theCoach.getDailyWorkout());

		theCoach = new TrackCoach();

		System.out.println(theCoach.getDailyWorkout());
	}

}
