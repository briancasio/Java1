
public class Concatenation {
 public static void main (String[]args){

    String month = "September";
    String day = "Monday";
    String major = "computer science".toUpperCase(); 

      System.out.println("Today is " + month + ", 2023. The day is " + day + ". Our study major is " + major);

    int numChar = month.length() + day.length() + major.length(); 


      System.out.println("The total number of characters is: " + numChar);

    String firstName = "brian".toUpperCase();
    String lastName  = "casio".toUpperCase();

    String init = firstName.charAt(0) + "." + lastName.charAt(0) + ".";

      System.out.println(init);





 
 
 }
}