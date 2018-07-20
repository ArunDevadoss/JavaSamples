package com.example.java;

public class TopDownFibonacci {

	private static long[] f = new long[9];

	public static long fibonacci(int n) {
		if (n == 0) {
			System.out.println(0);
			return 0;
		}

		if (n == 1) {

			System.out.println(1);
			return 1;

		}

		// return cached value (if previously computed)
		if (f[n] > 0) {
			System.out.println(f[n]);
			return f[n];

		}

		// compute and cache value

		f[n] = fibonacci(n - 1) + fibonacci(n - 2);
		return f[n];
	}

	public static void main(String[] args) {

		System.out.println(fibonacci(5));
	}

}