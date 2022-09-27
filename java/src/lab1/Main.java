package lab1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {	
		int maxN = 100;
		Random random = new Random();
		int n = random.nextInt(maxN);		
		PrimeArray sa = new PrimeArray(n);

		System.out.printf("Generated array of primes: %s\n", sa.toString());
		System.out.printf("Binaries from primes: %s\n", sa.toBinaryString());
		System.out.printf("A number with most binary zeroes: %s\n", sa.getMostZeroesBinary());
	}
}
