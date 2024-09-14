import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException{
        Scanner file = new Scanner(new File("dictionary.txt"));
        
        String[] bubbleArray = new String[641392];
        int i = 0;

        while(file.hasNext()){
            String holder = file.nextLine();
            bubbleArray[i] = holder;
            ++i;
        }
        file.close();

        //all arrays, unordered
        String[] selectionArray = newCopy(bubbleArray);
        String[] insertionArray = newCopy(bubbleArray);
        String[] mergeArray = newCopy(bubbleArray);
        String[] quickArray = newCopy(bubbleArray);
        String[] heapArray = newCopy(bubbleArray);
        
        //Call bubble sort
        System.out.print("bubble sort ");
        //Sorting.bubbleSort(bubbleArray);

        //Call selection sort
        System.out.print("Selection sort ");
        //Sorting.selectionSort(selectionArray);

        //Call insertion sort
        System.out.print("Insertion sort ");
        //Sorting.insertionSort(insertionArray);

        //Call merge sort
        System.out.print("Merge sort ");
        //Sorting.mergeSort(mergeArray);

        //Call quick sort
        System.out.print("Quick sort ");
        //Sorting.quickSort(quickArray);

        //Call heap sort
        System.out.print("Heap sort ");
        Sorting.heapSort(heapArray);
    }

    /**newCopy
     * The method takes the unordered array taken from the dictionary.txt,
     * and copies each element into another array.
     * @param a unordered array 
     * @return a new copy of the unordered array to use with different method
     */
    public static String[] newCopy(String[] a){
        String[] b = new String[a.length]; 
        for(int i = 0; i < a.length; ++i){
            b[i] = a[i];
        }
        return b;
    }
    
    public static void print(String[] a){
        for(String value : a){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}