// Write a program that asks a user to provide three test scores
// The program should display the average of the test scores and 
// the letter grade that is assigned for the average.

import java.util.Scanner;

public class AverageScore{
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);

    //Ask for test scores

    System.out.println("Test Score 1?");
    float scoreOne = input.nextFloat();

    System.out.println("Test Score 2?");
    float scoreTwo = input.nextFloat();

    System.out.println("Test Score 3?");
    float scoreThree = input.nextFloat();

    //create average variable adn print it

    float avg = (scoreOne + scoreTwo + scoreThree) / 3; 

    int avgRounded = Math.round(avg);

    System.out.println("The average is: " + avgRounded);

    //if statements for the grades print out

    if( avgRounded < 60){
    
    System.out.println("Your grade is F");
    
    }
    else if ( avgRounded >= 60 && avgRounded <= 69 ) {
    
      System.out.println("Your grade is D");

    }
    else if ( avgRounded >= 70 && avgRounded <= 79 ) {
      System.out.println("Your grade is C");

    }
    else if ( avgRounded >= 80 && avgRounded <= 89 ) {
      System.out.println("Your grade is B");

    }
    else if ( avgRounded >= 90 && avgRounded <= 100) {

      System.out.println("Your grade is A");

    }
    else {
    
      System.out.println("Incorrect grade");
    
    }
  }
}