import java.util.Scanner;

public class ArraysAndMethods {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of scores: ");
        int scoresNumber = input.nextInt();

        int[] arr = new int[scoresNumber];
        for (int i = 0; i < scoresNumber; i++){
            System.out.print("Score " + (i+1) + ": ");
            int score = input.nextInt();
            arr[i] = score;
        }
        
        printArr(arr);


        double avg = getAVG(arr);
        System.out.println(avg);

        char grade = getGradeByAVG(avg);
        System.out.println(grade);

        int largestValue = findMaxGrade(arr);
        System.out.println(largestValue);
    }

    public static void printArr(int[] arr){
        double sum = 0;
        System.out.print("Scores: ");
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    
    }

    public static double getAVG(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.print("Average grade: ");
        double avg = sum / arr.length;
        return avg;
    }

    public static char getGradeByAVG(double avg){

        char grade;
        if (avg < 60){
            grade = 'F';
        }
        else if(avg < 70){
            grade = 'D';
        }
        else if(avg < 80){
            grade = 'C';
        }
        else if(avg < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.print("Letter grade: ");
        return grade;

    }

    public static int findMaxGrade(int[] arr){
        int largestValue = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
        
            if(largestValue < arr[i]){
                largestValue = arr[i];
            }

        }
        System.out.print("Highest score: ");
        return largestValue;
    }

}