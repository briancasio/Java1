import java.util.Scanner;

public class CharLinearSearchUnsorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the input string:");
        String str = input.nextLine();
        System.out.println("Enter the target character:");
        char target = input.nextLine().charAt(0);
        input.close();
        
        long startTime = System.nanoTime();

        // Perform linear search
        boolean found = linearSearch(str, target);

        long endTime = System.nanoTime() - startTime;

        System.out.println(found + " in " + endTime + " nanoseconds");
    }

    public static boolean linearSearch(String str, char target) {
        // Perform linear search
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true; // Character found
            }
        }
        return false; // Character not found
    }
}
