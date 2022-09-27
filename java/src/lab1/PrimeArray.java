package lab1;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeArray {
	
	private ArrayList<Integer> numbers;
	
	PrimeArray(int n) {
		numbers = generate(n);
	}
	 
	private ArrayList<Integer> generate (int n) {
		//Eratosthenes Sieve algorithm for generating prime numbers
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		for (int i = 2; i * i <= n; i++) {
			if (primes[i]) {
				for (int j = i * i; j <= n; j += i) primes[j] = false;
			}
		}
			
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (primes[i]) numberList.add(i);
		}
			
		return numberList;
	}
	
	public String toString() {
		return numbers.toString();
	}
	
	public String toBinaryString() {
		ArrayList<String> binaries = new ArrayList<String>();
		for (int number : numbers) binaries.add(Integer.toBinaryString(number));
		return binaries.toString();
	}
	
	public int getMostZeroesBinary() {
		if (numbers.size() == 0) return 0; 
		
		int mostZeroes = 0;
		int largest = 0;
		for (int number : numbers) {
			String binary = Integer.toBinaryString(number);
			int zeroes = binary.replaceAll("1", "").length();
			if (zeroes > mostZeroes) { 
				mostZeroes = zeroes;
				largest = number; 
			}
		}
		return largest;
	}
}
