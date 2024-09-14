// Akari Olivares
// Jasmin Olivas
// Brian Casio

import java.util.Scanner;
import java.io.*;

public class RemedialActivity2 {
    public static void main(String[] args) throws IOException {

        /**
        * Reads an array of numbers from the specified file.
        *
        * @param filename The name of the file to read from.
        * @return An array of integers read from the file.
        * @throws IOException If an error occurs while reading the file.
        */
        int[] numbers = readFromFile("numbers.txt");

        System.out.print("Values in the array: ");
        print(numbers);

        /**
        * Calculates the sum of the numbers in the given array.
        *
        * @param numbers An array of integers.
        * @return The sum of the numbers in the array.
        */
        int sum = findSum(numbers);
        System.out.println("Sum: " + sum);

        double average = findAVG(numbers);
        System.out.println("Average: " + average);

        writeResultsToFile(numbers, sum, average);
    }

    public static int[] readFromFile(String filename) throws IOException {
        Scanner scanner = new Scanner(new File(filename));
        int totalValues = scanner.nextInt();
        int[] numbers = new int[totalValues];

        for (int i = 0; i < totalValues; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();
        return numbers;
    }

    /**
     * Prints the numbers in the given array.
     *
     * @param numbers An array of integers.
     */
    public static void print(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        int num = numbers[i];
        System.out.print(num + " ");
    }
    System.out.println();
}

    /**
     * Calculates the sum of the numbers in the given array.
     *
     * @param numbers An array of integers.
     * @return The sum of the numbers in the array.
     */
    public static int findSum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum;
}

    /**
    * Calculates the average of the numbers in the given array.
    *
    * @param numbers An array of integers.
    * @return The average of the numbers in the array
    */
    private static double findAVG(int[] numbers) {
        int sum = findSum(numbers);
        return (double) sum / numbers.length;
    }

    /**
     * Writes the results (numbers, sum, and average) to an output file.
     *
     * @param numbers An array of integers.
     * @param sum The sum of the numbers in the array.
     * @param average The average of the numbers in the array.
     * @throws IOException If an error occurs while writing to the file.
     */
    public static void writeResultsToFile(int[] numbers, int sum, double average) throws IOException {
    PrintWriter pr = new PrintWriter("results.txt");

    for (int i = 0; i < numbers.length; i++) {
        pr.write(Integer.toString(numbers[i]));
        if (i < numbers.length - 1) {
            pr.write(" + ");
        }
    }
    pr.write(" = " + sum + "\n"); 

    pr.write("Sum: " + sum + "\n");
    pr.write("Average: " + average + "\n");

    pr.close();
}

}





