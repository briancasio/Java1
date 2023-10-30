import java.util.Scanner;

public class Catering {
    public static void main(String[] args) {

    double numberOfCups = getCups();
    double manyOunces = cupsToOunces(numberOfCups);
    displayResult(numberOfCups, manyOunces);
    }
    

    public static double getCups(){
    
    System.out.println("how many cups");
    Scanner input = new Scanner(System.in);
    double cups = input.nextDouble();
    return cups;
    
    }

    public static double cupsToOunces(double numberOfCups) {

        double ounces = numberOfCups * 8;
        return ounces;

    }
    
    public static void displayResult(double cups, double ounces){
    
    System.out.println(cups + " cups in fluid ounces is " + ounces);
    
    }
    
    
}
