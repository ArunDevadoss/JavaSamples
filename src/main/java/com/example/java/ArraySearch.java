package com.example.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySearch {

	public static void main(String args[]) {

		Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 10));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7));
		set.addAll(set2);

		System.out.println("List" + set.toString());
	}

}
