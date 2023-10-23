/*

1. Find the largest number.
2. Find lowest number.
3. Find the average.
4. Print the results on a new file using PrintWriter.

*/

import java.util.Scanner;
import java.io.*;

public class FileExample {
    public static void main(String[] args) throws IOException {
        Scanner myFile = new Scanner(new File("numbers.txt")); //You need a numbers.txt file in the same directory as FileExample.java

        int num;
        double avg;
        double sum = 0;
        int count = 0;
        int largest = Integer.MIN_VALUE; //This method calls the minimum value possible in JAVA
        int lowest = Integer.MAX_VALUE;  //This method calls the max value possible in JAVA

        // Loop to read every int in numbers.txt

        while (myFile.hasNextInt()) {

            num = myFile.nextInt();

            //adding up all the numbers to sum variable
            sum += num;

                //Assigning the max and min number to the corresponding variable
                if (largest < num){

                    largest = num;
                
                }
                else {
                
                    lowest = num;
                
                }
            
            //Setting a count of the total numbers
            count++;
        
        }

        //creating a new pw object to create a file
        PrintWriter pw = new PrintWriter("Results.txt");

        //average formula
        avg = sum / count;

        //Printing the max, min, and average onto Results.txt
        pw.println("Largest: " + largest);
        pw.println("Lowest: " + lowest);
        pw.println("Average: " + avg);
        pw.close();
    }

}