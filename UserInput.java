package practice01;

import java.util.Scanner;

public class UserInput {

	public UserInput() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Get user input
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println(" :: HELLO! ::");
		System.out.println(" :: Thanks for visiting today! :: ");
		System.out.println(" :: On a scale of 1-10, how do you feel today? ::");
		int userInput = input.nextInt();
		
		// Print the output of user response
		System.out.println("------------------------------");
		System.out.println("You are feeling like a "+userInput);
		
		
		//Interpret response
			if (userInput <= 3)
				System.out.println("Wow, your day fucking sucks. Sorry.");
			else if ((userInput >3)&&(userInput <6))
					System.out.println("Well, meh is better than shit.");
			else
				System.out.println("Cool, you're doing OK.");
	}

}
