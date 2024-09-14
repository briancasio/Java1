import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HeapSort {

    // Driver program
    public static void main(String args[]) throws IOException {
        String[] a = new String[641392];

        
    Scanner input = new Scanner(new File("dictionary.txt"));
    int i = 0;
    while (input.hasNext()) {
        String line = input.nextLine();
        a[i] = line;
        ++i;
    }
    input.close(); 

        long startTime = System.nanoTime();

        HeapSort ob = new HeapSort();
        ob.sort(a);

        long endTime = System.nanoTime();

        /*for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        */

        double elapsedTimeSeconds = (endTime - startTime) / 1_000_000_000.0;

                for (String value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.printf("Time taken: %.5f seconds\n", elapsedTimeSeconds);


        
    }

    public void sort(String a[]) {
        int n = a.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            String temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            // call max heapify on the reduced heap
            heapify(a, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in a[]. n is size of heap
    void heapify(String a[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && a[l].compareTo(a[largest]) > 0)
            largest = l;

        // If right child is larger than largest so far
        if (r < n && a[r].compareTo(a[largest]) > 0)
            largest = r;

        // If largest is not root
        if (largest != i) {
            String swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(a, n, largest);
        }
    }


    
}
