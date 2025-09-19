package com.game;

public class MethodsDemo {

	private static final int damage = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int health = 100;
		printHealth(health);
		
		health=takeDamage(health,30);
		printHealth(health);

		health = heal(health, 20);
		printHealth(health);
		
		health= critDmg(health,damage);
		printHealth(health);
		isAlive(health);
	}	
	public static void printHealth(int hp) {
		System.out.println("Current HP: "+hp);
	}
	public static int takeDamage(int hp,int dmg) {
		System.out.println("Took"+ dmg+ "damage!");
		hp -= dmg;
		return Math.max(hp, 0);
		}
	public static int heal(int hp,int amount) {
		System.out.println("Healed "+amount+ "HP!");
		hp += amount;
		return Math.min(hp, 100);
	}
	public static void isAlive(int hp) {
		if(hp>0) {
			System.out.println("you are Alive");
		}else {
			System.out.println("you are died");
				}
	}
			
	public static int critDmg(int hp,int dmg) {
		System.out.println("CRITICAL MLT! Took"+(dmg*2)+"damage!");
		hp -= dmg*2;
		return Math.max(hp,0);
	}



		
	
	}
