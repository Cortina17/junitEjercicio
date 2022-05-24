package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IteradoresTest {

	@Test
	void testUsoFor() {

		int[] a = new int[10];
		int[] b = new int[10];

		assertTrue(a != b);

	}

	@Test
	void testEjemploRedimensionar(int[] myArray, int [] hold) {

		// original array
		// int[] myArray = { 1, 2, 3, 4, 5, 6 };
		// new larger array
		// int[] hold = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// copy all of the myArray array to the hold
		// array, starting with the 0th index

		assertTrue(myArray==hold);
	}

	@Test
	void testCreateArray() {

		// s = new char[26];

		fail("Not yet implemented");
	}

	@Test
	void testImprimoNombreASCII() {
		fail("Not yet implemented");
	}

}
