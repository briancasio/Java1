import java.util.Scanner;

public class class6BC {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double value1, value2, value3;

      do{
        
      System.out.println("===== Enter value between 10 and 30 =====");
      System.out.println("enter first value");
      value1 = input.nextDouble();

      System.out.println("enter second value");
      value2 = input.nextDouble();

      System.out.println("enter third value");
      value3 = input.nextDouble();

      }
      while(value1 < 10 || value1 > 30 || value2 < 10 || value2 > 30 || value3 < 10 || value3 > 30);

      input.close();

      double lowest = value1;
      double largest = value1;

     if (value1 == value2 && value2 == value3){

          System.out.println("Multiple values identical");

     }
     else {
     
          if (value2 < lowest) {

               lowest = value2; 

          } 
          else if (value2 > largest) {

               largest = value2;

          }
          if (value3 < lowest) {

               lowest = value3;

          } 
          else if (value3 > largest) {

               largest = value3;

          }

          System.out.printf("Lowest: %.2f, Largest: %.2f\n", lowest, largest);

     }
  }
}