import java.util.Scanner;

public class CharBinarySearchUnsorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the input string:");
        String str = input.nextLine();
        System.out.println("Enter the target character:");
        char target = input.nextLine().charAt(0);
        input.close();
        
        long startTime = System.nanoTime();
        // Perform binary search
        boolean found = binarySearch(str, target);
        long endTime = System.nanoTime() - startTime;
        System.out.println(found + " in " + endTime + " nanoseconds");
    }

    public static boolean binarySearch(String str, char target) {
        // Perform binary search
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (str.charAt(mid) == target) {
                return true; // Character found
            } else if (str.charAt(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false; // Character not found
    }
}