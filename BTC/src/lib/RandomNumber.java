package lib;

import java.util.Random;

public abstract class RandomNumber {

	/**
	 * Generates a random integer between min and max, in the range [min, max]
	 * This method is inclusive of min AND max.
	 * @param min the lower boundary (included) for the random integer
	 * @param max the upper boundary (included) for the random integer
	 * @return a random integer
	 */
	public static int randInclusiveInt(int min, int max){
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}
	
}
