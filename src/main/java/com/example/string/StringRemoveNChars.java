package com.example.string;

/**
 * 
 * @author AXD8472
 *
 */
public class StringRemoveNChars {

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		String removeNChar = "Welcome";
		System.out.println(new String(removeNChar.toCharArray(), 2, removeNChar.length() - 2));

	}

}
