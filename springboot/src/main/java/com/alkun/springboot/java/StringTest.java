package com.alkun.springboot.java;
/**
 * 
 * @author kunzen
 * @ A program to find the maximum length of continuous characters inside a string
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "aaaaeeeeecccccccddddddddmmmmmmmmm";
		int countMax = 1;
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count = count + 1;
				if (count > countMax)
					countMax = count;
			} else {
				count = 1;
			}
		}
		System.out.println(countMax);
	}
}
