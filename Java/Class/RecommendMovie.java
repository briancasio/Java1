import java.util.Scanner;

public class RecommendMovie {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the Movie Recommendation Program!");
    System.out.println("Please select a movie genre");
    System.out.println("1. Action");
    System.out.println("2: Comedy");
    System.out.println("3: Drama");
    System.out.println("4. Exit");
    System.out.print("Enter your choice (1 to 4): ");
    
    int genre;

    do { 
    
      genre = input.nextInt();


      switch ( genre ) {
    
      case 1:
      System.out.print("Recommended Comedy Movie: Mad Max: Fury Road.");
      break;

      case 2:
      System.out.print("Recommended Comedy Movie: The Grand Budapest Hotel");
      break;
    
      case 3:
      System.out.print("Recommended Comedy Movie: The Shawshank redemption");
      break;

      case 4:

      System.out.println("Exiting the movie recommendation program.");
      break;    

      default:
      System.out.println("Invalid selection. Please choose a valid genre or exit.");
      }

    }
    while(genre != 1 && genre != 2 && genre != 3 && genre != 4);   
    input.close();
  }
}