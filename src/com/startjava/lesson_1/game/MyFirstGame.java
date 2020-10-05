package com.startjava.lesson_1.game;

public class MyFirstGame{

	public static void main(String[] args){
		int number = 30;
		for(int i = 0; i <= 100; i++){
			if (i == number){
				System.out.println("The number is " + number);
				break;
			} else if (i < number){
				System.out.println("The number is bigger than " + i);
			} else {
				System.out.println("The number is less than " + i);
			}
		}
	}

}