package com.example.java;

import java.util.Scanner;

public class FibbonociSeries {

	public static void main(String args[]) {

		int n1 = 0, n2 = 1, n3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter count to find fibbonocci series");
		int fibNumber = scanner.nextInt();
		scanner.close();
		System.out.println("Please find the fibbonoci series");
		System.out.print(n1 + " ," + n2);

		for (int i = 2; i < fibNumber; i++) {

			n3 = n1 + n2;
			System.out.print(" ," + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
