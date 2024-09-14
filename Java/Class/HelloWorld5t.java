public class HelloWorld5t{
public static void main(String[] args) {
    
    String s = "Hello";
    int times = 0;
    int i = 0;

    /*for(int i = 0; i < 5; i++){
    
        System.out.println(s);
    
    }
    */
    //printHello2(times, s);

    

}

public static void printHello(int times, String s){

 if(times > 1) {
    
    printHello(times - 1, s);
    
    }

System.out.println(s);

}

public static void printHello2(int times, String s){


    if(times>=5){
    

    System.out.println("Stop...");

    }
    else{
    
    System.out.println(s);    
    printHello2(times + 1, s);
    }

}

public static int countVowels(String s, int i){
    
    if (i<s.length()-1){

        return 0;    

    }
    if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
    
        return 1+countVowels(s, i + 1);
    
    }
    else{
    
    return countVowels(s, i+1);
    
    }

    /*     public boolean equals(FingerPrint otherFingerprint) {
        if (otherFingerprint == null || otherFingerprint.pixelData.length != this.pixelData.length || otherFingerprint.pixelData[0].length != this.pixelData[0].length) {
            return false;
        }
        for (int i = 0; i < this.pixelData.length; i++) {
            for (int j = 0; j < this.pixelData[i].length; j++) {
                if (!this.pixelData[i][j].equals(otherFingerprint.pixelData[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
    */

       /* private int parseYear(String yearString) {
        String[] parts = yearString.split("\\s");
        return Integer.parseInt(parts[0]);
    } */

    /*
    
    import java.util.Scanner;

public class ThreatDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of attempts allowed: ");
        int maxTries = scanner.nextInt();
        int tries = 0; // Initialize the number of attempts

        while (tries < maxTries) {
            System.out.print("Enter the path to the fingerprint file: ");
            String fileName = scanner.next();

            FingerPrint fingerprint = FingerPrint.loadFingerprint(fileName);

            if (fingerprint != null && validateFingerprint(fingerprint)) {
                System.out.println("Fingerprint authentication successful!");
                break; 
            } else {
                System.out.println("Fingerprint authentication failed. Please try again.");
                tries++; 
            }
        }

        if (tries == maxTries) {
            System.out.println("Maximum number of attempts reached. Access denied.");
        }

     
    }

    private static boolean validateFingerprint(FingerPrint fingerprint) {
        
    }
}

    
    
     */



}


}