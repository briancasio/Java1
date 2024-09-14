import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MoneyProcessor {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("money.txt"));
        ArrayList<Dollar> holder = new ArrayList<Dollar>();
        Dollar billDollar;
        Dollar[] money = null;

        while(input.hasNext()){
            String line = input.next();
            String[] tokens = line.split(",");

            int num = Integer.parseInt(tokens[0]);
            String face = tokens[1];
            String serial = tokens[2];
            int year = Integer.parseInt(tokens[3]);
            
            billDollar = new Dollar(num, face, serial, year);

            holder.add(billDollar);
        }
        
        money = holder.toArray(new Dollar[holder.size()]);

        System.out.println("*****printBills()*****");
        printBills(money);

        System.out.println("*****printOnlyDenominations()*****");
        printOnlyDenominations(money);

        System.out.println("*****getTotalAmountInWallet()*****");
        int total = getTotalAmountInWallet(money);
        System.out.println(total);
    }

    /**
     * This method takes an array of Dollar as a parameter and
     * invokes showBill() of each Dollar.
     * @param array an array of Dollar objects.
     */
    public static void printBills(Dollar[] array){
        for(int i = 0; i < array.length; ++i){
            array[i].showBill();
        }
    }

    /**
     * Takes an array of Dollar as a parameter
     * and prints all the denominations.
     * @param array an array of Dollar objects.
     */
    public static void printOnlyDenominations(Dollar[] array){
        for(int i = 0; i < array.length; ++i){
            int holder = array[i].getDenomination();
            System.out.print(holder + " ");
        }
        System.out.println();
    }
    
    /**
     * Takes an array of Dollar as a paremeter
     * and calculates the total amount of money.
     * @param array an array of Dollar objects.
     * @return the sum of all the denominations.
     */
    public static int getTotalAmountInWallet(Dollar[] array){
        int sum = 0;

        for(int i = 0; i < array.length; ++i){
            int money = array[i].getDenomination();
            sum += money;
        }

        return sum;
    } 
}
