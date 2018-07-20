package com.example.string;

public class OptimizedStringReverse {

	public static void main(String args[]) {

		String reverse = "Welcome";

		reverseString(reverse.toCharArray(), 0, reverse.length() / 2, reverse.length());

	}

	/**
	 * 
	 * @param chars
	 * @param startIndex
	 * @param middleIndex
	 * @param lastIndex
	 */
	private static void reverseString(char[] chars, int startIndex, int middleIndex, int lastIndex) {

		char temp;
		for (; startIndex <= middleIndex; startIndex++, lastIndex--) {

			temp = chars[startIndex];
			chars[startIndex] = chars[lastIndex - 1];
			chars[lastIndex - 1] = temp;
		}

		System.out.println("Reversed String " + new String(chars));

	}

}
