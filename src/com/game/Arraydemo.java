package com.game;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo","BMW", "Ford","Mazda"};
		int[] myNum = {10,20,30,40};
		System.out.println(cars[0]);
		System.out.println(myNum[0]);
		
		cars[0] = "opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
	}

}
