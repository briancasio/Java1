import java.util.Scanner;

public class DExample {
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    System.out.println("what do you want to drink");
    String drink = input.nextLine();

    input.close();

    if(drink.equalsIgnoreCase("coffee") || drink.equalsIgnoreCase("tea")){
    
    System.out.println("Hot beverage");
    
    }
    else if (drink.equalsIgnoreCase("lemonade") || drink.equalsIgnoreCase("iced late") || drink.equalsIgnoreCase("frappe") || drink.equalsIgnoreCase("soda")){
    
      System.out.println("Cold beverage");
    
    
    }
    else{
    
    System.out.println("we don't have this drink");
    
    }

  
  
  }
}