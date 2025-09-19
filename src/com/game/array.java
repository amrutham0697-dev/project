package com.game;

public class array {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    int[] myNum = {10, 20, 30, 40};
    System.out.println(cars[0]);
    System.out.println(myNum[0]);
    
    // Change Array Element
    cars[0] = "Opel";
    System.out.println(cars[0]);
    
    //Array Length
    System.out.println("Array Length is " + cars.length);
    
    //new Keyword
    
    String[] ids = new String[] {"V", "B", "F", "M"};
    System.out.println(ids[0]);
    
    
    //Array Looping
    
    String[] car = {"Volvo", "BMW", "Ford", "Mazda"};

    for (int i = 0; i < car.length; i++) {
      System.out.println(car[i]);
      
    }
    
    //Multi Dimensional Array
    
    int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
    System.out.println(myNumbers[1][2]); // Outputs 8
    
    //Change Elements
    
    int[][] myNumber = { {1, 4, 2}, {3, 6, 8} };
    myNumber[1][2] = 9;
    System.out.println(myNumber[1][2]); // Outputs 9 instead of 8
    
    //Rows and Columns
    
    int[][] myNumb = { {1, 4, 2}, {3, 6, 8, 5, 2} };

    System.out.println("Rows: " + myNumb.length);             // 2
    System.out.println("Cols in row 0: " + myNumb[0].length); // 3
    System.out.println("Cols in row 1: " + myNumb[1].length); // 5
    
    //Loop Through Multi Dimensional Array
    
    int[][] even = { {1, 4, 2}, {3, 6, 8, 5, 2} };

    for (int row = 0; row < even.length; row++) {
      for (int col = 0; col < even[row].length; col++) {
        System.out.println("myNumbers[" + row + "][" + col + "] = " + even[row][col]);
      }
    }
  }

}

