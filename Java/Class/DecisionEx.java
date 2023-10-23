import java.util.Scanner;

public class DecisionEx {
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);

      System.out.println("Prize: ");

    int Prize = input.nextInt();

    if(Prize == 1){
    
      System.out.println("Get a candy");
    
    }
    else if (Prize == 1000){
    
      System.out.println("Go to Disney World");
    
    }
    else {
    
      System.out.println("Ooops... maybe next time...");
    
    }

  

  }
}