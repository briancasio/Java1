import java.io.*;
import java.util.Scanner;

public class ReadFile2 { 
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("numbers.txt"));

        double sum = 0;
        double sigma = 0;
        int largest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        double mean;
        int counter = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            sum += number;
            counter++;
                
                if (largest < number){

                    largest = number;

                }
                if (number < lowest) {

                    lowest = number;

                }
        }

        mean = sum / counter;


        scanner = new Scanner(new File("numbers.txt"));

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            sigma += Math.pow(number - mean, 2);
            
        }

        double standardDeviation = Math.sqrt(sigma / counter);

        System.out.println("lowest: " + lowest);
        System.out.println("largest: " + largest);
        System.out.println("mean: " + mean);
        System.out.printf("%.2f\n", standardDeviation);


    }
}
