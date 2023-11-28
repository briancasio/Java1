import java.util.Scanner;
import java.io.*;

public class MethodDemo {
    public static void main(String[] args) throws IOException {
        
        String filename = "filename.txt";
        String filename2 = "transformation.txt";

        encrypt(filename);
        decrypt(filename2);

    }

    public static void encrypt(String filename) throws IOException{ 
        Scanner scanner = new Scanner(new File(filename));
        PrintWriter pw = new PrintWriter("transformation.txt");
        int c; 
        while(scanner.hasNextLine()){   
        String word = scanner.nextLine();
            for(int i = 0; i < word.length();i++){
                c = (int) word.charAt(i);
                pw.print(c + " ");
        }
        pw.close();  
        }    
    }

    public static void decrypt(String filename2) throws IOException{
        Scanner input = new Scanner(new File(filename2));
        PrintWriter pr = new PrintWriter("decrypt.txt");
        int c;
        while(input.hasNext()){
            c = input.nextInt();
            char word = (char) c;     
            pr.print(word);  
        }
        pr.close();
    }
}