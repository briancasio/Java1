import java.util.Scanner;

public class classBC {
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

    //menu prices

    double cyberBurgerPrice = 3.99;
    double doubleMeatPrice = 4.99;
    double tripleMeatPrice = 5.99;
    double jalapenoCheesePrice = 6.99;
    double baconCheesePrice = 7.99;
    double saladPrice = 8.99;

    //additional charges

    double cheesePrice = 0.50;

    switch (menu){
    
      case 1:
        order = "CyberBurger";
        amount = cyberBurgerPrice;
        System.out.println("Would you like some cheese with that? (yes/no)");
        cheese = input.nextLine();
          if(cheese.equalsIgnoreCase("yes")){
            order = "CyberBurger with Cheese";
            amount = amount + cheesePrice; 
          }
          else if (cheese.equalsIgnoreCase("no"));{
            order = "CyberBurger";
          }
        break;
        case 2:
        order = "Double Meat CyberBurger";
        amount = doubleMeatPrice;
        System.out.println("Would you like some cheese with that? (yes/no)");
        cheese = input.nextLine();
          if(cheese.equalsIgnoreCase("yes")){
            order = "Double Meat CyberBurger with Cheese";
            amount = amount + cheesePrice; 
          }
          else if (cheese.equalsIgnoreCase("no"));{
            order = "Double Meat CyberBurger";
          }
        break;
        case 3:
        order = "Triple Meat CyberBurger";
        amount = tripleMeatPrice;
        System.out.println("Would you like some cheese with that? (yes/no)");
        cheese = input.nextLine();
          if(cheese.equalsIgnoreCase("yes")){
            order = "Triple Meat CyberBurger with Cheese";
            amount = amount + cheesePrice; 
          }
          else if (cheese.equalsIgnoreCase("no"));{
            order = "Triple Meat CyberBurger";
          }
        break;        
        case 4:
        order = "Jalapeno and Cheese";
        amount = jalapenoCheesePrice;
        break;  
        case 5:
        order = "Bacon and Cheese";
        amount = baconCheesePrice;
        break; 
        case 6:
        order = "Salad";
        amount = saladPrice;
        break;   
    }

    double tax = (8.25 * amount) / 100;
    amount = amount + tax;
    System.out.print("Your order is " + order + ". Your total is $");
    System.out.printf("%.2f" , amount);
    System.out.println("");

  }
}