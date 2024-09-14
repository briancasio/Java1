import java.io.*;
import java.util.Scanner;

public class lab09 {
    /**
    * Reads from a file, calculates, and writes the results to an external file.
    * @param args Command line args.
    * @throws IOException if there is an error with file io.
    */
    public static void main(String[] args) throws IOException {

        Scanner myFile = new Scanner(new File("numbers.txt"));

        int count = 0;

        while (myFile.hasNextInt()) {
            myFile.nextInt();
            count++;
        }

        myFile.close(); 

        myFile = new Scanner(new File("numbers.txt"));
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = myFile.nextInt();
        }

        myFile.close();

        String fileName = "result.txt";

        writeToFile(fileName, arr);
        

    }

    /**
    *Calculates the sum of an array of integers
    *@param arr The array of integers.
    *@return The sum of the integers in the array.
    */
    public static int getSum(int[] arr){
    
    int sum = 0;

        for(int i = 0; i < arr.length;i++){
        
            sum += arr[i]; 
        
        }

        return sum;
    
    }


    /**
     * Calculate average of an array of integers.
     * @param arr Array of integers.
     * @return Average of integers.
     */
    public static double getAVG(int[] arr){
    
        double avg = 0.0;

        double sum = 0.0;

        int count=0;

            for(int i = 0; i < arr.length;i++){
            
                sum += arr[i]; 
                count++;
            }    

        avg = sum / count;

        return avg;
    
    }

    /**
     * Find the maximum value in an array of integers.
     * @param arr Array of integers.
     * @return Maximum value in the array.
     */
    public static int getMax(int [] arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length;i++){
    
            if(arr[i] > max){
            
                max = arr[i];
            
            }

        }   

    return max;
    
    }

    /**
     * Find the maximum value in an array of integers.
     * @param arr Array of integers.
     * @return Minimum value in the array.
     */
    public static int getMin(int [] arr){

    int min = Integer.MAX_VALUE;

    for(int i = 0; i < arr.length;i++){

        if(arr[i] < min){
        
            min = arr[i];
        
        }

    }   

    return min;
    
    }

    /**
     * Calculate standard deviation of an array of integers.
     * @param arr Array of integers.
     * @return Standard deviation of the integers in the array.
     */
    public static double getStdDev(int[] arr) {
        double mean = getAVG(arr);
        double sigma = 0;
        for (int i = 0; i < arr.length; i++) {
            sigma += Math.pow(arr[i] - mean, 2);
        }
        return Math.sqrt(sigma / arr.length);
    }

    /**
     * Writes to a file (sum, average, maximum, minimum, standard deviation).
     * @param fileName Name of the output file.
     * @param arr Array of integers.
     * @throws IOException if there is an error writing to the file.
     */
    public static void writeToFile(String fileName, int[] arr) throws IOException {
        PrintWriter writer = new PrintWriter("result.txt");
        writer.println("Sum: " + getSum(arr));
        writer.println("Average: " + getAVG(arr));
        writer.println("Maximum: " + getMax(arr));
        writer.println("Minimum: " + getMin(arr));
        writer.println("Standard Deviation: " + getStdDev(arr));
        writer.close();
    }
}