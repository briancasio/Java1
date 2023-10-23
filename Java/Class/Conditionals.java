/*Brian Casio sept-22-2023
  Peer leader Session (Nacim)
*/
import java.util.Scanner;

public class Conditionals{

  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);

    System.out.println("Provide first integer");

    int first = input.nextInt();

    System.out.println("Provide second integer");

    int second = input.nextInt();

      if(first < second){
    
        System.out.println(first + ", " + second);
    
    
      }
      else{
        System.out.println(second + ", " + first);

      }    
  }
}