import java.util.Scanner;
import java.io.*;

public class MoneyProcessor2 {
    public static void main(String[] args) throws IOException{
        Dollar[] wallet = new Dollar[100];
        int walletIndex = 0;

        // Using Scanner and File to read data from the file
        Scanner input = new Scanner(new File("money.txt"));
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] token = line.split(",");
                // Assuming the format is denomination, face, serial, year
                Dollar dollar = new Dollar(Integer.parseInt(token[0]), token[1], token[2], Integer.parseInt(token[3]));
                wallet[walletIndex] = dollar;
                walletIndex++;
            
        } 
        

        printBills(wallet);
        printOnlyDenominations(wallet);
        System.out.println(getTotalAmountInWallet(wallet));
    }

    public static void printBills(Dollar[] wallet) {
        for (int i = 0; i < wallet.length; i++) {
            if (wallet[i] != null) {
                wallet[i].showBill();
            }
        }
    }

    public static void printOnlyDenominations(Dollar[] wallet) {
        for (int i = 0; i < wallet.length; i++) {
            if (wallet[i] != null) {
                System.out.print(wallet[i].getDenomination() + " ");
            }
        }
        System.out.println();
    }

    public static int getTotalAmountInWallet(Dollar[] wallet) {
        int total = 0;
        for (int i = 0; i < wallet.length; i++) {
            if (wallet[i] != null) {
                total += wallet[i].getDenomination();
            }
        }
        return total;
    }
}
