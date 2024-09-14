import java.util.Scanner;
public class CyberBurger {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("======CyberBurger menu======");
    System.out.println("(1) CyberBurger");
    System.out.println("(2) Double Meat CyberBurger");
    System.out.println("(3) Triple Meat CyberBurger");
    System.out.println("(4) Jalapeno and Cheese");
    System.out.println("(5) Bacon and Cheese");
    System.out.println("(6) Salad");
    System.out.println("============================");
    System.out.println("Enter the menu item you want:");
    int menu = input.nextInt();
    input = new Scanner(System.in);
    String cheese = "";
    double amount = 0;
    String order = "";
    double cyberBurgerPrice = 3.99;
    double doubleMeatPrice = 4.99;
    double tripleMeatPrice = 5.99;
    double jalapenoCheesePrice = 6.99;
    double baconCheesePrice = 7.99;
    double saladPrice = 8.99;
    //additional charges
    double cheesePrice = 0.50;

    //Start with your switch cases (first example on your powerpoint)
    switch (menu){
      case 1:
        order = "CyberBurger";
        amount = cyberBurgerPrice;
        //Ask for cheese and Store the user response in variable cheese
        System.out.println("Would you like some cheese with that? (yes/no)");
        cheese = ?????.????????;
        //Check the user response using an if-statement
        //if(cheese equals "yes") using the method from your powerpoint
          if(??????.?????(????)){
            order = "CyberBurger with Cheese";
            amount = amount + cheesePrice; 
          }
        break; //Don't forget to break; after each case
        case 2: //Similar to case 1.
        case 3: //Similar to case 1.    
        case 4: // Remember: Don't ask for cheese
        case 5: // Remember: Don't ask for cheese
        case 6: // Remember: Don't ask for cheese
    }
    // Calculate the tax
    double tax = (8.25 * amount) / 100; //formula on the powerpoint
    //Last step: sum the amount and the tax, and print the order with the final price
    //Output examples in your powerpoint
  }
}