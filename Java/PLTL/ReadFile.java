import java.util.Scanner;
import java.io.*;

public class ReadFile{
    public static void main(String[] args) throws IOException {
    
    Scanner myFile = new Scanner(new File("numbers.txt"));

    int number;
    int largest = 1;
    int lowest = 1;
    double avg;
    int counter = 0;
    double sum = 0;
    double sigma = 0;
    double k = 5.5;

        while(myFile.hasNext()){
        

            number = myFile.nextInt();

            sum += number;

            sigma += Math.pow(Math.abs(number - k), 2);

            


            if (largest < number){

                    largest = number;
                
                }
            else {
                
                    lowest = number;
                
                }

        counter++;

        }

        double s = Math.sqrt(sigma/(counter - 1));
        avg = sum / counter;
    System.out.println(largest);
    System.out.println(lowest);
    System.out.println(avg);
    System.out.println(s);
    

    //standard deviation
/* 
    int currentNum;

    while(myFile.hasNext()){
    
        currentNum = myFile.nextInt();
        System.out.println(currentNum);
        
    }

    //suma menos contante

*/

    }
}