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
    System.out.println("Enter your choice (1 to 4): ");
    
    String genre;

    do { 
    
      genre = input.nextLine();


      switch ( genre ) {
    
      case "1":
      genre = "Recommended Comedy Movie: Mad Max: Fury Road.";
      break;

      case "2":
      genre = "Recommended Comedy Movie: The Grand Budapest Hotel";
      break;
    
      case "3":
      genre = "Recommended Comedy Movie: The Shawshank redemption";
      break;

      case "4":
      genre = "Exiting the movie recommendation program.";
      break;    

      default:
      genre = "Invalid selection. Please choose a valid genre or exit.";
      }
      System.out.println(genre);
    }
    while(genre != "1" && genre != "2" && genre != "3" && genre != "4");   
  }
}