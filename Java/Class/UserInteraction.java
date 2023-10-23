// Book exercise page 11 

import java.util.Scanner;


public class UserInteraction {
  public static void main(String[]args) {

   Scanner input = new Scanner(System.in);

   System.out.println("What is your name?");
   
   String name = input.nextLine(); //receive a String
   
   System.out.println("Your name is " + name);

   System.out.println();

   System.out.println("What is your favorite food?");

   String food = input.nextLine();

   System.out.println("Your favorite food is " + food);

   System.out.println();

   System.out.println("What is your age?");

   int age = input.nextInt();

   System.out.println("Your age is " + age);

   System.out.println();

   int yearBorn = 2023-age;

   System.out.println();

   System.out.println("Please to meet you " + name + 
   ". I also like " + food + "!!. Funny, I am also " + age +
    " years old!. I bet you were born on " + yearBorn + ", eh?.");

   System.out.println();

System.out.println(args);

  }
}