import java.util.Scanner;

public class ConversionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a distance in meters: ");
        double meters = input.nextDouble();
        while (meters < 0){
            System.out.println("invalid number, please try again");
            meters = input.nextDouble();
        }
        System.out.println("1: Convert to kilometers");
        System.out.println("2: Convert to inches");
        System.out.println("3: Convert to feet");
        System.out.println("4: Quit program");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        double result = 0;
        switch(choice){
        
        case 1:
            result = showKilometers(meters);
            System.out.println(result);
            break;
        case 2:
            result = showInches(meters);
            System.out.println(result);
            break;
        case 3:
            result = showFeet(meters);
            System.out.println(result);
            break;
        case 4:
            System.out.println("Exiting Program...");
            break;
        default:
            System.out.println("Error, try again");
        }

    }
    public static double showKilometers(double meters){
    
    double kilometers = meters * 0.001;
    return kilometers;
    
    }
    public static double showInches(double meters){
    double inches = meters * 39.37;
    return inches;
    }
    public static double showFeet(double meters){
    double feet = meters * 3.281;
    return feet;
    }
 
}
