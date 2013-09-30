package com.adefran.chapter15;

import java.util.Scanner;

public class Assignment3 {

	static int i = 0;
	
	public static void main(String[] args) {
		String string;
		/*
		 * create scanner
		 */
		Scanner keyboard = new Scanner(System.in);
		/*
		 * get the string to reverse
		 */
		System.out.println("Please enter a string to reverse: ");
		string = keyboard.nextLine();
		/*
		 * output the results
		 */
		System.out.println("The string " + string + " reversed is " + reverse(string));
	}
	
	public static String reverse(String x){
		if ((null == x) || (x.length()  <= 1)) {
            return x;
        }
		String reverse = reverse(x.substring(1)) + x.charAt(0);
		return reverse;
	}

}
