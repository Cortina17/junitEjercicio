package com.capgemini;

public class Iteradores {
	private char[] s;

	public boolean usoFor(int[] a, int[] b) {
		if (a.equals(b)) {
// usar estos datos para el TEST
// int[] a=new int[10];
// int b[]=new int[10];
			for (int i = 0; i < a.length; i++) {
				a[i] = i;
				System.out.println(a[i]);
			}
			System.out.println("-------");
			for (int i = 9; i > 0; i--) {
				b[i] = i;
				System.out.println(b[i]);
			}
			System.out.println("-------");
			for (int i = 0; i < 10; i += 2) {
				b[i] = i;
				System.out.println(b[i]);
			}
			System.out.println("-------");
			int x = (int) (Math.random() * 100);
			for (int i = 0; i < a.length; i++) {
				a[i] = x;
				x = (int) (Math.random() * 100);
				System.out.println(a[i]);
			}
		} else {
			return false;
		}
		return true;
	}

	public void EjemploRedimensionar(int[] myArray, int[] hold) {
// usar estos datos para el TEST
//original array
// int[] myArray = { 1, 2, 3, 4, 5, 6 };
// new larger array
// int[] hold = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
// copy all of the myArray array to the hold
// array, starting with the 0th index
		System.arraycopy(myArray, 0, hold, 0, myArray.length);
		for (int i = 0; i < hold.length; i++) {
			System.out.print(hold[i]);
		}
	}

	public char[] createArray(char[] s) {
// usar estos datos para el TEST
// s = new char[26];
		System.out.println((int) 'A');
		for (int i = 0; i < 26; i++) {
			s[i] = (char) ('A' + i);
			System.out.println(s[i]);
		}
		return s;
	}

	public void imprimoNombreASCII() {
		char[] nombre = { 'A', 'L', 'E' };
		int[] nombreAscii = new int[nombre.length];
		for (int i = 0; i < nombre.length; i++) {
			nombreAscii[i] = (int) nombre[i];
			System.out.print((int) nombre[i] + " ");
		}
		System.out.println();
		System.out.println("*************");
		for (int i = 0; i < nombreAscii.length; i++) {
			System.out.println(nombreAscii[i]);
		}
	}
}
