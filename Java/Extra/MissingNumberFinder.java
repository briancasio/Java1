//mine Write a method named findMax(). 
//The method takes a 2D array of integers as a parameter and returns the largest element in the array. 
   public static int findMax(int [][]a, int i, int largest, int j){

     if(i < a.length){

       if(j < a[i].length){

         if(largest < a[i][j]){

           largest = a[i][j];

        }     
         return findMax(a, ++i, largest, ++j);
      }
     return findMax(a, ++i, largest, j);
    }
     else{
     return largest;
    }

  }

  //answer corrected

public static int findMax(int[][] a) {
    return findMaxHelper(a, 0, 0, Integer.MIN_VALUE);
}

private static int findMaxHelper(int[][] a, int i, int j, int max) {
    if (i == a.length)
        return max;
    
    if (j == a[i].length)
        return findMaxHelper(a, i + 1, 0, max);
    
    if (a[i][j] > max)
        max = a[i][j];
    
    return findMaxHelper(a, i, j + 1, max);
}

//question 14 mine Write a method that finds a minimum element value in the nodes of a Linked List of integers. 

public int minValue(Node n){

int min = n.value;
while(n.value != null){
    if(n.value > n.next.value && n.next.value != null){
        min = n.next.value;
    }
        n = n.next;
    }
    return min;
}


//corrected

public int minValue(Node n) {
    if (n == null)
        return Integer.MAX_VALUE; // or throw an exception
    
    int min = n.value;
    while (n.next != null) {
        if (n.next.value < min)
            min = n.next.value;
        n = n.next;
    }
    return min;
}

//mine
public int sum(Node n){
    int sum = 0;
    Node n = first;
    while(n.value != null){
        sum += n.value;
        n = n.next;
    }
    return sum;
}

//corrected

public int sum() {
    int sum = 0;
    Node n = first; // Assuming 'first' is the head of your linked list
    while (n != null) {
        sum += n.value;
        n = n.next;
    }
    return sum;
}

//test 3 q16 Write a method int numberOfParentsWithTwoChildren(BNode root) that return the number of parents that have two children.

//Your Answer
public int numberOfParentsWithTwoChildren(BNode root){
if(root != null){
if(root.left != null && root.right != null){
return 1;
}

numberOfParentsWithTwoChildren(root.left);
 numberOfParentsWithTwoChildren(root.right);
}

else
return 0 ;

}

//corrected

public int numberOfParentsWithTwoChildren(BNode root) {
    if (root == null || (root.left == null && root.right == null)) {
        return 0;
    } else if (root.left != null && root.right != null) {
        return 1 + numberOfParentsWithTwoChildren(root.left) + numberOfParentsWithTwoChildren(root.right);
    } else {
        return numberOfParentsWithTwoChildren(root.left) + numberOfParentsWithTwoChildren(root.right);
    }
}

//test3 Question 17: Write a method void numberOfParentsWithOneChild(BNode root) that prints the nodes that only have one child.

public void numberOfParentsWithOneChild(BNode root){
if(root == null){
System.out.println("Empty tree");
}
if( root != null){
if(root.left != null && root.right == null){
System.out.println(numberOfParentsWithOneChildren(root.value));
}

else if(root.left == null && root.right != null){
System.out.println(numberOfParentsWithOneChildren(root.value));

}
 numberOfParentsWithOneChild(root.left)
 numberOfParentsWithOneChild(root.right)
}
}

//corrected
public void numberOfParentsWithOneChild(BNode root) {
    if (root == null) {
        return;
    }
    if ((root.left != null && root.right == null) || (root.left == null && root.right != null)) {
        System.out.println(root.data);
    }
    numberOfParentsWithOneChild(root.left);
    numberOfParentsWithOneChild(root.right);
}


//2d arrays methods

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MatrixProcessor {

    public static void main(String[] args) {
        try {
            // Read the file and populate the 2D array
            int[][] matrix = readMatrixFromFile("matrixA.txt");

            // Test and write results for each method
            writeResultToFile("colTotal.txt", String.valueOf(getColTotal(matrix, 0)));
            writeResultToFile("sum.txt", String.valueOf(getSum(matrix)));
            writeResultToFile("avg.txt", String.valueOf(getAVG(matrix)));
            int[] diagonalProducts = getDiagonalsProduct(matrix);
            writeResultToFile("diagonalsProduct.txt", diagonalProducts);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    // Method to read the matrix from a file
    public static int[][] readMatrixFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrix;
    }

    // Method to calculate total of a specified column
    public static int getColTotal(int[][] matrix, int col) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][col];
        }
        return total;
    }

    // Method to calculate sum of all elements in the matrix
    public static int getSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Method to calculate average of all elements in the matrix
    public static double getAVG(int[][] matrix) {
        if (matrix.length <= 0 || matrix[0].length <= 0) {
            throw new ArithmeticException("Array dimensions must be greater than 0.");
        }
        int sum = getSum(matrix);
        int elements = matrix.length * matrix[0].length;
        return (double) sum / elements;
    }

    // Method to calculate product of diagonals
    public static int[] getDiagonalsProduct(int[][] matrix) {
        int leftDiagonalProduct = 1;
        int rightDiagonalProduct = 1;
        for (int i = 0; i < matrix.length; i++) {
            leftDiagonalProduct *= matrix[i][i];
            rightDiagonalProduct *= matrix[i][matrix.length - 1 - i];
        }
        int bothDiagonalsProduct = leftDiagonalProduct * rightDiagonalProduct;
        return new int[]{leftDiagonalProduct, rightDiagonalProduct, bothDiagonalsProduct};
    }

    // Method to write result to a file
    public static void writeResultToFile(String fileName, String result) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        writer.println(result);
        writer.close();
    }

    // Overloaded method to write result to a file
    public static void writeResultToFile(String fileName, int[] result) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        for (int value : result) {
            writer.print(value + " ");
        }
        writer.close();
    }
}


//binary search

public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If mid is at its correct position, the missing element lies to the right
            if (arr[mid] == mid + 1)
                left = mid + 1;
            // If mid is not at its correct position, the missing element lies to the left
            else
                right = mid - 1;
        }
        // At the end of the loop, 'left' will be pointing to the index where the missing element should be
        return left + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 8, 9};

        System.out.println("Missing number in arr1: " + findMissingNumber(arr1)); // Output: 5
        System.out.println("Missing number in arr2: " + findMissingNumber(arr2)); // Output: 7
    }
}
