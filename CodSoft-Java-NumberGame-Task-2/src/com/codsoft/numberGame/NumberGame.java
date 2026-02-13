package com.codsoft.numberGame;
import java.util.*;

public class NumberGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playAgain = true;
		
		
		while(playAgain) {
			int number = random.nextInt(100)+1;
			
			int guess;
			int attempts = 0;
			int maxAttempts = 5;
			boolean guessedCorrectly = false;
			
			System.out.println("Welcom to Number Guessing Game !");
			System.out.println("Guess a Number Between 1 and 100");
			System.out.println("You have "+ maxAttempts+" attempts.");
	
			while(attempts < maxAttempts) {
				System.out.println("Enter your Guessing Number");
				guess = scanner.nextInt();
				attempts++;
				
				if(guess == number) {
					System.out.println("Correct you guessed the number in "+ attempts +"attempts");
					guessedCorrectly = true;
					break;
				}else if(guess > number) {
					System.out.println("Too High");
				}else {
					System.out.println("Too Low");
				}		
			}
			
			if(!guessedCorrectly) {
				System.out.println("You have yoused all attempts.");
				System.out.println("The correct number was "+ number);
			}
			
			System.out.println("Do you want to play again ..?(yes/no)");
			
			String choice = scanner.next();
			if(!choice.equalsIgnoreCase("yes")) {
				playAgain = false;
			}
		}
		
		System.out.println("Thanks for playing");
		scanner.close();
		
	}

}
