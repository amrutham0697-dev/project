package com.game;
import java.util.Scanner;

public class whileloopmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner uinput = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("\n-- Adventure Menu--");
			System.out.println("1: Explore");
			System.out.println("2: Rest");
			System.out.println("3: Quit");
			System.out.print("Choose your action: ");
			int choice = uinput.nextInt();
			switch (choice) {
			case 1 :
				System.out.println("You venture into the unkown..");
				break;
			case 2:
				System.out.println("You rest and regain your strength.");
				break;
			case 3:
				System.out.println("Exiting the adventure. Goodbye!");
				running = false;
				break;
			default:
				System.out.println("That's not an option. Try again.");
				
		
}
		uinput.close();
			}
	}

}
