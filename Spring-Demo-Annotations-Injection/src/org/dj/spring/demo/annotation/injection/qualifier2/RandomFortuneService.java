package org.dj.spring.demo.annotation.injection.qualifier2;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create array of Strings
	private String[] data = {
			"Beware of the wolf on the sheep's clothings",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
