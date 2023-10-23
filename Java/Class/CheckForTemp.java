/* Dr. Servin Comp Sci Book fall 2023 p.17
   Brian Casio
*/

import java.util.Scanner;

public class CheckForTemp {
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);

    //Task 1

    System.out.println("Current temperature?");

    int temp = input.nextInt();

    System.out.println("");

    if (temp >= 80) {
    
      System.out.println("The temperature is hot");
    
    }
    else {
    
      System.out.println("The temperature is cold");
    
    }
    
    System.out.println("");

    //Task 2 & 3

    if(temp >= 80){
    
      if(temp >= 110) {
        System.out.println("Do not got outside!");     
      }
      else{
        System.out.println("wear shorts and t-shirt");
      }
    }

    else {
      System.out.println("Too cold");
    }
  }
}

