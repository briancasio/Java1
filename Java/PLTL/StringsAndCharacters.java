import java.util.Scanner;

public class StringsAndCharacters {
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);

  System.out.println("String 1 name?");

  String str1 = input.nextLine().toUpperCase();

  System.out.println("String 2 name?");

  String str2 = input.nextLine().toUpperCase();
  
  System.out.println("String 3 name?");

  String str3 = input.nextLine().toUpperCase();

  char str1_3rdchar = str1.charAt(2);

  System.out.println(str1_3rdchar);

  char str2_3rdchar = str2.charAt(2);

  System.out.println(str2_3rdchar);

  char str3_3rdchar = str3.charAt(2);

  System.out.println(str3_3rdchar);

  String answer = str1_3rdchar + "." + str2_3rdchar + "." + str3_3rdchar;

  System.out.println(answer);

  }
}