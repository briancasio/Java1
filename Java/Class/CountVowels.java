import java.util.Scanner;
import java.io.*;

public class CountVowels {

    public static void main(String[] args) throws IOException {
        Scanner myFile = new Scanner(new File("input.txt"));

        int counter = 0;
        int i;
        char v;

        while (myFile.hasNextLine()){
        
        String letter = myFile.nextLine().toLowerCase();
         
         for(i = 0; i < letter.length(); i++){
         
            v = letter.charAt(i);
            
            if("aeiou".indexOf(v) != -1){
            
                counter++;
            
            }
         
         
         }

        
        
        }

        System.out.println("Total vowel: " + counter);

    }

}