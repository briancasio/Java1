import java.util.Scanner;

public class LoopInteraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n: ");
        int n = input.nextInt();

        input.nextLine();
        System.out.print("Name: ");

        String name = input.nextLine();
        input.close();
        

        System.out.print("for: ");

        int i;

        for(i = 0; i < n; i++){
        
            System.out.print(name + " ");
        
        }

        System.out.println();
        System.out.print("while: ");

        int j = 0;

        while(j < n){
            System.out.print(name + " ");
            j++;
        }

        System.out.println();
        System.out.print("do while: ");

        int x = 0;

        do{
        
            System.out.print(name + " ");
            x++;
        
        }
        while(x < n);

        System.out.println();

    }
}
