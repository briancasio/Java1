import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class FingerPrint {
    private String[][] pixelData;
    private String personName;
    private int registrationYear;
    private int numberOfRows;
    private int numberOfColumns;

    public FingerPrint(String aName) throws IOException {
        Scanner input = new Scanner(new File(aName));

        this.personName = input.nextLine();
        this.registrationYear = input.nextInt(); 
        this.numberOfRows = input.nextInt();
        this.numberOfColumns = input.nextInt();

        input.nextLine();

        pixelData = new String[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            //String newLine = input.nextLine(); //.split(""); de una sola
            String[] pixels = input.nextLine().split("");
            for (int j = 0; j < numberOfColumns; j++) {
                pixelData[i][j] = pixels[j];
            }
        }   
    }

    public FingerPrint(String[][] pixelData, String personName, int registrationYear, int numberOfRows, int numberOfColumns) {
        this.pixelData = pixelData;
        this.personName = personName;
        this.registrationYear = registrationYear;
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }


    public boolean equals(FingerPrint user1){
        /*if (!this.personName.equals(finPr.getName()) || this.registrationYear != finPr.getRegistrationYear() || 
        this.numberOfRows != finPr.getNumberOfRows() || this.numberOfColumns != finPr.getNumberOfColumns()) {
            return false;
        } no esencial para la act*/

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (!this.pixelData[i][j].equals(user1.pixelData[i][j])) {  
                    return false;
                }
            }
        }
        return true;
    }
    
    public int getNumberOfPixels() {
        return numberOfRows * numberOfColumns;
    }

    public String getName() {
        return personName;
    }

    public void setName(String personName) {
        this.personName = personName;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public String toString() {
        return "Fingerprint for: " + personName + ". Year registered: " + 
        registrationYear + ". Number of Pixels: " + 
        getNumberOfPixels();
    }

    public void getImage() {
        for (int i = 0; i < pixelData.length; i++) {
            for (int j = 0; j < pixelData[i].length; j++) {
                System.out.print(pixelData[i][j]);
            }
            System.out.println();
        }
    }

    public String [][] getPixelData(){
    
    return pixelData;

    }
    
}