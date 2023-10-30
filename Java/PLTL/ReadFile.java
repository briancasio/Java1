import java.util.Scanner;
import java.io.*;
public class ReadFile{
    public static void main(String[] args) throws IOException {
    
    Scanner myFile = new Scanner(new File("numbers.txt"));

    int number;
    int largest = 1;
    int lowest = 1;
    int counter = 0;
    double avg;
    double sum = 0;
    double sigma = 0;
    double k = 5.5;

        while(myFile.hasNext()){

            number = myFile.nextInt();


                if (largest < number){

                    largest = number;
                }
                else {

                        lowest = number;

                    }

            //

            sigma += Math.pow((number - k), 2);

            sum += number;


            counter++;

        }

    double s = Math.sqrt(sigma/(counter - 1));
    avg = sum / counter;
    System.out.println(largest);
    System.out.println(lowest);
    System.out.println(avg);
    System.out.printf("%.2f",s);
    
    }
}