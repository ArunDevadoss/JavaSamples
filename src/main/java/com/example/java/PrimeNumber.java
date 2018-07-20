package com.example.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find prime number");
		int number = scanner.nextInt();
		scanner.close();
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				System.out.println("Not a primeNumber");
				isPrime = false;
				break;
			}

		}

		if (isPrime) {
			System.out.println("Number is  a primeNumber");
		}
	}

}
