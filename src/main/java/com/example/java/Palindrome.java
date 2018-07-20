package com.example.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string to check palindrome");
		String palindrome = scanner.nextLine();
		scanner.close();
		char[] chars = palindrome.toCharArray();
		System.out.println("Is Palindrome " + isPalindrome(chars, 0, chars.length / 2, chars.length));

	}

	/**
	 * 
	 * @param chars
	 * @param startIndex
	 * @param middleIndex
	 * @param lastindex
	 * @return
	 */
	private static boolean isPalindrome(char[] chars, int startIndex, int middleIndex, int lastindex) {

		boolean isPalindrome = true;
		for (; startIndex <= middleIndex; startIndex++, lastindex--) {

			if (chars[startIndex] != chars[lastindex - 1]) {
				isPalindrome = false;
				break;

			}

		}

		return isPalindrome;

	}
}
