import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class MergeSort {
     public static void main(String[] args) throws IOException {
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

        MergeSort ob = new MergeSort();
        ob.sort(a, 0, a.length - 1);

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

        void sort(String a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    void merge(String a[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String L[] = new String[n1];
        String R[] = new String[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }




}
