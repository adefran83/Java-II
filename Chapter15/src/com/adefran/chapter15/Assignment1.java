package com.adefran.chapter15;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args){
		int x,y;
		/*
		 * create scanner to receive keyboard events
		 */
		Scanner keyboard = new Scanner(System.in);
		/*
		 * get x value
		 */
		System.out.println("Please enter an integer for X: ");
		x = keyboard.nextInt();
		/*
		 * get y value
		 */
		System.out.println("Please enter an integer for y: ");
		y = keyboard.nextInt();
		/*
		 * output results
		 */
		System.out.println("The result of " + x + " times " + y + " is " + multiplication(x,y));
	}
	
	public static int multiplication(int x, int y){
		if (y == 1) 
			return x;
		else
			return x + multiplication(x, y-1);
	}

}
