package com.bridgelabz.day4;

public class snakeladder {

	int Start_Position = 0;
	int dice;

	public static void main(String[] args) {

		int dice = (int) (Math.random() * 10) + 1;

		System.out.println("Starting position is : " + dice);

	}

}
