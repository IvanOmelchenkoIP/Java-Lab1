package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeArrayTests {

	@Test
	void TestMostZeroesNullN() {
		int expected = 0;
		PrimeArray pa = new PrimeArray(0);
		int result = pa.getMostZeroesBinary();
		assertEquals(expected, result);
	}
	
	@Test
	void TestMostZeroesNegativeN() {
		int expected = 0;
		PrimeArray pa = new PrimeArray(-15);
		int result = pa.getMostZeroesBinary();
		assertEquals(expected, result);
	}
	
	@Test
	void TestMostZeroesOneIsN() {
		int expected = 0;
		PrimeArray pa = new PrimeArray(1);
		int result = pa.getMostZeroesBinary();
		assertEquals(expected, result);
	}

	
	@Test
	void TestMostZeroesNonSimplePositiveN() {
		int expected = 2;
		PrimeArray pa = new PrimeArray(14);
		int result = pa.getMostZeroesBinary();
		assertEquals(expected, result);
	}
	
	@Test
	void TestMostZeroesSinglePrimeN() {
		int expected = 2;
		PrimeArray pa = new PrimeArray(2);
		int result = pa.getMostZeroesBinary();
		assertEquals(expected, result);
	}
	
	@Test
	void TestMostZeroesSeveralPrimesN() {
		int expected = 17;
		PrimeArray pa = new PrimeArray(23);
		int result = pa.getMostZeroesBinary();
		assertEquals(expected, result);
	}
	
	
	@Test
	void TestToStringNoGenerated() {
		String expected = "[]";
		PrimeArray pa = new PrimeArray(1);
		String result = pa.toString();
		assertEquals(expected, result);
	}
	
	@Test
	void TestToStringGenerated() {
		String expected = "[2, 3, 5, 7, 11]";
		PrimeArray pa = new PrimeArray(12);
		String result = pa.toString();
		assertEquals(expected, result);
	}
	
	
	@Test
	void TestToBinaryStringNoGenerated() {
		String expected = "[]";
		PrimeArray pa = new PrimeArray(1);
		String result = pa.toBinaryString();
		assertEquals(expected, result);
	}
	
	@Test
	void TestToBinaryStringGenerated() {
		String expected = "[10, 11, 101, 111, 1011]";
		PrimeArray pa = new PrimeArray(12);
		String result = pa.toBinaryString();
		assertEquals(expected, result);
	}
}
