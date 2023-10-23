import java.util.Scanner;

public class TestScore{
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);

    System.out.println("Test Score?");

    int score = input.nextInt();

    if(score < 60){
      
      System.out.println("Your grade is F");

    }
    else{
    
      if(score < 70){
      
        System.out.println("Your grade is D");
      
      }
      else{
      
        if(score < 80){
        
          System.out.println("Your grade is C");

        }
        else{
        
          if(score < 90){
        
            System.out.println("Your grade is B");
          }
          else{

            System.out.println("Your grade is A");

          }
        }
      }
    }
  }
}