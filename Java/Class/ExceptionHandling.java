    //ask a user to provide two numbers (num1 and num2)
    //Create a variable named result and store the result of
    //division num2 by num1

import java.util.*;

public class ExceptionHandling{
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double result = 0.0;
    try{
    System.out.println("Provide first number");
    int num1 = input.nextInt();
    System.out.println("Provide first number");
    int num2 = input.nextInt();

        result = num2 / num1;
    }
    catch(ArithmeticException e){
    
        System.out.println("You cannot divide by 0");

    }
    catch(InputMismatchException e2){
    
        System.out.println("It is not a number");
    
    }
    System.out.println("Result: " + result);




    }

}