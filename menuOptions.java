package practice01;

import java.util.Scanner;

//Need to add details of the user interface such as options displaying user interaction information
public class menuOptions{
		
		public static int Select;
		
		public static void userSelectOption (String[] args) {
//		while (correctForm) {
			System.out.println("-------------------------------");	
			// Welcome Screen (needs to contain application name & developer details)
			System.out.println("Hello! Welcome to Company Lockers Pvt. Ltd.!");
			System.out.println("LockedMe.com");
			System.out.println("Developed by Andie Mydosh");
			System.out.println("----------------------------");
			
			
			System.out.println("Please select from one of the following options:");
			System.out.println("1. View the directory list");
			System.out.println("2. Search or modify directory list");
			System.out.println("3. Close the application");
			Scanner userSelect = new Scanner(System.in);
			Select = userSelect.nextInt();
			
			// Verify the user input is one of the listed options, else return to menu
//			if(Select ~= 1 || Select ~=2 || Select ~= 3) {
//				System.out.println("You have not selected a valid option. Please select from the available menu options.");
//				Return = true;
//				checkpoint = true;
//				correctForm = true;
//			} else {
//				correctForm = false;
//			}
//		}
	}
}
	
	// Create default constructor

