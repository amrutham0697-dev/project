package com.game;

public class basiInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inventory = {"Sward","Shield","Potion"};
		System.out.println("Your inventory:");
		for(String item : inventory ) {
			System.out.println("-"+item);
		}
	}

}
