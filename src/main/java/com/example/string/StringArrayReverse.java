package com.example.string;

import java.util.Arrays;

public class StringArrayReverse {

	public static void main(String args[]) {

		String[] words = new String[] { "abc", "def", "ghi" };
		reverse(words, 0, words.length / 2, words.length);

	}

	/**
	 * 
	 * @param words
	 * @param startIndex
	 * @param middleIndex
	 * @param lastIndex
	 */
	private static void reverse(String[] words, int startIndex, int middleIndex, int lastIndex) {

		String temp;
		for (; startIndex <= middleIndex; startIndex++, lastIndex--) {

			temp = words[startIndex];
			words[startIndex] = words[lastIndex - 1];
			words[lastIndex - 1] = temp;
		}

		System.out.println("Reversed String" + Arrays.toString(words));

	}
}
