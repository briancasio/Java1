import java.util.Scanner;
import java.io.*;
public class ReadFile{
    public static void main(String[] args) throws IOException {
    
    Scanner myFile = new Scanner(new File("numbers.txt"));

    int number;
    int largest = Integer.MIN_VALUE;
    int lowest = Integer.MAX_VALUE;
    int counter = 0;
    double mean = 0;
    double sum = 0;
    double sigma = 0;

        while(myFile.hasNext()){

            number = myFile.nextInt();


                if (largest < number){

                    largest = number;

                }
                if (number < lowest) {

                    lowest = number;

                }

            

            sum += number;
            counter++;
            mean = sum / counter;
            sigma += Math.pow((number - mean), 2);


        }

System.out.println(sigma);
System.out.println(counter);

    double s = Math.sqrt(sigma/(counter - 1));
    System.out.println(largest);
    System.out.println(lowest);
    System.out.println(mean);
    System.out.printf("%.2f\n", s);
    
    }
}