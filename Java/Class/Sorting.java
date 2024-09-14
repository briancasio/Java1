public class Sorting {
    /**bubbleSort()
     * 
     * @param a 
     */
    public static void bubbleSort(String[] a){
        long startTime = System.nanoTime();
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a.length - 1 -i; ++j){
                if(a[j].compareToIgnoreCase(a[j+1]) > 0){
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        calculateSeconds(endTime, startTime);
    }

    /**selectionSort()
     * 
     * @param a
     */    
    public static void selectionSort(String[] a){
        long startTime = System.nanoTime();
        for(int i = 0; i < a.length-1; ++i){
            int indexSmallest = i;
            for(int j = i + 1; j < a.length; ++j){
                if(a[j].compareToIgnoreCase(a[indexSmallest]) < 0){
                    indexSmallest = j;
                }
            }
            String temp = a[i];
            a[i] = a[indexSmallest];
            a[indexSmallest] = temp; 
        }
        long endTime = System.nanoTime();
        calculateSeconds(endTime, startTime);
    }
    /**insertionSort()
     * 
     * @param a
     */
    public static void insertionSort(String[]a){
        long startTime = System.nanoTime();
        insertionSorting(a);
        long endTime = System.nanoTime();
        calculateSeconds(endTime, startTime);
    }
    private static void insertionSorting(String[] a){
        for(int i = 1; i < a.length; ++i){
            int j = i;
            while ((j > 0) && (a[j].compareToIgnoreCase(a[j-1]) < 0)) {
                String temp = a[j];
                a[j] = a[j-1];
                a[j - 1] = temp;
                --j;
            }
        }
    }

    /**mergeSort()
     * 
     * @param a
     */
    public static void mergeSort(String a[]){
        long startTime = System.nanoTime();
        mergeSort(a, 0, a.length-1);
        long endTime = System.nanoTime();
        calculateSeconds(endTime, startTime);
    }
    private static void mergeSort(String a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
    private static void merge(String a[], int l, int m, int r) {
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

    /**quickSort()
     * 
     * @param a
     */
    public static void quickSort(String[] a){
        long startTime = System.nanoTime();
        quickSort(a, 0, a.length-1);
        long endTime = System.nanoTime();
        calculateSeconds(endTime, startTime);
    }
    private static void quickSort(String[] a, int first, int last) {
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

    /**heapSort()
     * 
     * @param a
     */
    public static void heapSort(String a[]){
        long startTime = System.nanoTime();
        heapSorting(a);
        long endTime = System.nanoTime();
        calculateSeconds(endTime, startTime);
    }
    private static void heapSorting(String a[]) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heap(a, n, i);
        for (int i = n - 1; i >= 0; i--) {
            String temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heap(a, i, 0);
        }
    }
    private static void heap(String a[], int n, int i) {
        int largest = i; // Initialize largest 
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
        if (l < n && a[l].compareToIgnoreCase(a[largest]) > 0)
            largest = l;
        if (r < n && a[r].compareToIgnoreCase(a[largest]) > 0)
            largest = r;
        if (largest != i) {
            String swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;
            heap(a, n, largest);
        }
    }

    /**calculateSeconds()
     * 
     * @param endTime
     * @param startTime
     */
    public static void calculateSeconds(long endTime, long startTime){
        double elapsedTimeSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.printf("Time taken: %.5f seconds\n", elapsedTimeSeconds);
    }
}