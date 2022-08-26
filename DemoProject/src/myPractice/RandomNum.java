package myPractice;

import java.util.Random;

public class RandomNum {
	public static void main(String[] args) {
		Random abc = new Random();
		int rand = abc.nextInt(200); 
		System.out.println(rand);
	}
	/*Random abc = new Random();
	double dbl = abc.nextDouble();
	System.out.println(dbl);*/
}

