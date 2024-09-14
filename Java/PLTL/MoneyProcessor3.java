import java.util.Scanner;
import java.io.*;

public class MoneyProcessor3 {
    public static void main(String[] args)throws IOException{

        Scanner file = new Scanner(new File("money.txt"));
        Scanner file1 = new Scanner(new File("money.txt"));
        Scanner file2 = new Scanner(new File("money.txt"));
        int sum = 0;

        while(file.hasNext()){
            String[] tokens = file.nextLine().split(",");
            Dollar sec = new Dollar(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]));
            printBill(sec);

        }
        while(file1.hasNext()){
            String[] tokens = file1.nextLine().split(",");
            Dollar sec = new Dollar(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]));
            printOnlyDenoinations(sec);
            
            
            
        }
        System.out.println();
       while(file2.hasNext()){
           String[] tokens = file2.nextLine().split(",");
           Dollar sec = new Dollar(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]));
            sum = getTotalAmountInWallet(sec, sum);
            
        }
        System.out.println(sum);
        
        


    }
    public static void printBill(Dollar x){
        x.showBill();
    }
    public static void printOnlyDenoinations(Dollar x){
        System.out.print(x.getDenomination() + " ");
    }
    public static int getTotalAmountInWallet(Dollar x, int sum){
    return sum += x.getDenomination();
    }
}
