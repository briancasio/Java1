public class MySecondProgram {
    public static void main (String[]args){

      //(1) Define two String variables and provide any value that you want

      String hello = "Hello";   
      String world = "World";   

      //(2) Define two numbers (one of them must be a decimal number)

      int numberOne = 1;      
      double numberDecimal = 1.5;

      /*(3) Define a variable called third that will hold the third character from ...
         ...the first String defined in (1)
      */

      char third = hello.charAt(3);

      /*(4) Define a variable called sum that will store the addition of the two ...
         ...numbers that you defined in (2)
      */

      double sum = numberOne + numberDecimal;

      /*(5) Define a variable called second that will contain the value of second ...
         ...String from (1). The content of the second character must be in uppercase.
      */

     String second = world.substring(0,1) + world.substring(1,2).toUpperCase() + world.substring(2); 

      /*(6) Define a String variable called password that will be composed of the following:
      a: the first character from the second String
      b: the second character form the second String
      c: the first number
      d: the last character from the first String
      e: the second number
      f: a special character of your preference
      */

      String password = world.substring(0,1) + world.substring(1,2) + numberOne + hello.substring(hello.length()-1) + numberDecimal + "!";

      //println the results

      System.out.println(hello);  //1
      System.out.println(world);  //1
      System.out.println(numberOne);  //2
      System.out.println(numberDecimal);  //2
      System.out.println(third);  //3
      System.out.println(sum);  //4
      System.out.println(second);   //5
      System.out.println(password);  //6




    }




}