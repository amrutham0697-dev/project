package com.game;
import java.util.Scanner;
import java.util.Arraylist;

public class InventoryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Inventory.add("sword");
		Inventory.add("Potion");
		Inventory.add("Shield");
		boolean running = true;
		while(running) {
			System.out.println("\n.. your Inventory.." +Inventory);
			System.out.println("1.add item");
			System.out.println("2. remove item");
			System.out.println("3. exit");
			System.out.println("Preview inventory");
			int choice = sc.nextInt();
			sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter item to add:");
				String newItem= sc.nextItem();
				Inventory.add(newItem);
				System.out.println(newItem +"added");
				break;
			case 2:
				System.out.println("enter items to remove.");
				String remove=sc.nextItem();
				break;
			case 3:
				System.out.println("Exiting....!");
				running = false;
				break;
			default:
				System.out.println("That's not an option: Try again..");
				b
			}
		}
	}

}
