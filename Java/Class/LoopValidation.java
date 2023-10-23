import java.util.Scanner;;

public class LoopValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sentinel = true;
        int number;

        while (sentinel) {
        
            System.out.println("Provide a number between 0 and 10");
            number = input.nextInt();
            if(number >= 0 && number <= 10) {
            
                sentinel = false;
                System.out.println("Thank you for entering " + number + ", have a nice day!");
                break;

            }
        }


/* 
        do{
        
            number = input.nextInt();
            System.out.println("Provide a number between 0 and 10");

        }
        while(number < 0 || number > 10);


        System.out.println("Thank you for entering " + number + ", have a nice day!");
*/
    }
}
