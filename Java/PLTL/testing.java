import java.lang.*;

public class testing{

    public static void main(String[] args) {
        
    System.out.println(generateSerial());

    }

    public static String generateSerial(){
    
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char first = abc.charAt(0);
    char last = abc.charAt(abc.length()-1);

    for(int i = 0; i < 11; i++){
    
    
    
    }

    return first + "" + last;
    
    }
    



}