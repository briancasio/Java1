import java.util.Scanner;
import java.io.*;

public class FingerPrint{

    private String[][] pixelData;
    private int personName;
    private int registrationYear;
    private int numberOfColumns;
    private int numberOfRows;


    public FingerPrint(String fileName) throws IOException{
        Scanner myFile = new Scanner(new File(fileName));

        this.pixelData = myFile.nextLine();
        this.personName = myFile.nextLine().trim();
        this.registrationYear = Integer.parseInt(myFile.nextLine().trim());
        this.numberOfRows = Integer.parseInt(myFile.nextLine().trim());
        this.numberOfColumns = Integer.parseInt(myFile.nextLine().trim());

        pixelData = new String[numberOfRows][numberOfColumns];
        for(int i = 0; i < numberOfRows; i++){
            String line = myFile.nextLine();
            for(int j )
        
        
        
        }
    
    
    
    
    }





}