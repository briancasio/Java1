import java.io.*;
import java.util.*;

public class Try {
    public static void main(String[]args)throws IOException{
        Scanner input = new Scanner(new File("numbers.txt"));
        
        int num1= input.nextInt();
        int sum = num1;
        int max = num1;
        int min = num1;
        int counter = 1;
        double sigma = Math.pow((num1-5.5),2);

        while(input.hasNextInt()){
            int num = input.nextInt();
            
            sigma += Math.pow((num-5.5),2);
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }

            sum = sum + num;
            counter++;
        }
        System.out.println(sigma);
        double mean = (double)sum/counter;

        System.out.println("Smallest Value: " + min);
        System.out.println("Largest Value: " + max);
        System.out.printf("Mean: %.1f",mean);
        System.out.println("");

        double inside = sigma/(counter -1);
        double devation = Math.sqrt(inside);
        System.out.printf("Devation: %.2f", devation);

    }
    
}
