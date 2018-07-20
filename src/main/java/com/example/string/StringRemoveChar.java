package com.example.string;

public class StringRemoveChar {

	public static void main(String args[]) {

		String sentence = "Remove tis";
		System.out.println(remove(sentence, 't'));

	}

	public static String remove(final String str, final char remove) {

		final char[] chars = str.toCharArray();
		int pos = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != remove) {
				chars[pos++] = chars[i];
			}
		}
		return new String(chars, 0, pos);
	}
}
