import java.util.Scanner;

public class LoopInteractionBC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("provide number");

        int n = input.nextInt();

        input.nextLine();

        System.out.println("provide user name");

        String name = input.nextLine();
        input.close();
        
        System.out.println("");

        System.out.println("For loop");

        int i;

        for(i = 0; i < n; i++){
        
            System.out.println((i + 1) + ": " + name);
        
        }

        System.out.println("");
        System.out.println("While loop");

        int j = 0;

        while(j < n){
        
            System.out.println((j + 1) + ": " + name);
            j++;
        
        }

        System.out.println("");
        System.out.println("Do while loop");

        int x = 0;

        do{
        
            System.out.println((x + 1) + ": " + name);
            x++;
        
        }
        while(x < n);

    }
}
