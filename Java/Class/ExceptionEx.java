import java.util.*;

public class ExceptionEx{
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    double result = 0.0;
    double x = 0.0;
    double y = 0.0;
    try{
    System.out.println("Provide 1st number: ");
    x = in.nextDouble();

    System.out.println("Provide 2nd number: ");
    y = in.nextDouble();
    System.out.println("Result: " + division(x, y));
    System.out.println(division(x, y));
    }
    catch(MyOwnException e1){
    
       e1.printStackTrace();
       
    
    }
        catch(InputMismatchException e2){
    
       System.out.println("It is not a number");
       e2.printStackTrace();
       
    
    }
        catch(ArithmeticException e3){
    
       System.out.println("You cannot divide by 0");
       e3.printStackTrace();
    
    }
        catch(Exception e4){
    
       System.out.println("Try again");
       e4.printStackTrace();
   
    }

}

public static double division(double x, double y) throws MyOwnException{

    if(y == 2){
    
        throw new MyOwnException("I dont want to accept 2... try again");
    
    }
    return x/y;

}


}