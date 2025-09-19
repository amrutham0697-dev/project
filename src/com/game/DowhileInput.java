package com.game;
 import java.util.Scanner;
 
public class DowhileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("choose your class: 1) Warrior 2) Mage 3) Archer");
			while(sc.hasNextInt()) {
				sc.next();
			}
			choice = sc.nextInt();
			
		}while(choice < 1 || choice >3);
		System.out.println("You picked class number:" + choice);
		sc.close();
	}

}
