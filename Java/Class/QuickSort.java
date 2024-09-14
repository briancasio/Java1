import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QuickSort {
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

        quickSort(a, 0, a.length - 1);

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

    public static void quickSort(String[] a, int first, int last) {
        if (first >= last) {
            return;
        }

        int p = partition(a, first, last);

        // Left call
        quickSort(a, first, p - 1);

        // Right call
        quickSort(a, p + 1, last);
    }

    public static int partition(String[] a, int first, int last) {
        String pivot = a[last];
        int i = first - 1;

        for (int j = first; j < last; j++) {
            if (a[j].compareTo(pivot) <= 0) {
                i++;
                String temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        String temp = a[i + 1];
        a[i + 1] = a[last];
        a[last] = temp;
        return i + 1;
    }
}