
import java.io.IOException;
import java.util.Scanner;

public class ThreatDetection {
    public static void main(String[] args) throws IOException {
        FingerPrint origFingerPrint = FileProcessor.loadFingerprint("original.txt");

        Scanner input = new Scanner(System.in);

        System.out.print("Max tries: ");
        int maxTries = input.nextInt();
        int tries = 0;
        double epsilon = 90.0; 

        input.nextLine();

        while (tries < maxTries) {
            System.out.print("Provide the fingerprint file name (.txt): ");
            String fingerprintFileName = input.nextLine();

            FingerPrint AskedFingerPrint = FileProcessor.loadFingerprint(fingerprintFileName);

            //double accuracy = getAccuracy(origFingerPrint, AskedFingerPrint);
            int matched = 0;
            int totalPixels = origFingerPrint.getNumberOfPixels();
            int originalRows = origFingerPrint.getNumberOfRows();
            int originalColumns = origFingerPrint.getNumberOfColumns();
            int userRows = AskedFingerPrint.getNumberOfRows();
            int userColumns = AskedFingerPrint.getNumberOfColumns();

            String[][] originalPixelData = origFingerPrint.getPixelData();
            String[][] userPixelData = AskedFingerPrint.getPixelData();

            int minRows = Math.min(originalRows, userRows);
            int minColumns = Math.min(originalColumns, userColumns);

            for (int i = 0; i < minRows; i++) {
                for (int j = 0; j < minColumns; j++) {
                    if (originalPixelData[i][j].equals(userPixelData[i][j])) {
                        matched++;
                    }
                }
            }

            double accuracy = (double) matched / totalPixels * 100;

            if (accuracy >= epsilon) {
                System.out.print("Accuracy of: ");
                System.out.printf("%.2f", accuracy);
                System.out.println("%.");
                break;
            } else {
                tries++;
                System.out.print("Accuracy: ");
                System.out.printf("%.2f", accuracy);
                System.out.println("%." + (maxTries - tries) + " tries left.");
            }
            if(tries == maxTries){
                System.out.println("Max tries reached.");
            }
        }
    }

public static double getAccuracy(FingerPrint origFingerPrint, FingerPrint AskedFingerPrint) {
    int matched = 0;
    int totalPixels = origFingerPrint.getNumberOfPixels();
    int originalRows = origFingerPrint.getNumberOfRows();
    int originalColumns = origFingerPrint.getNumberOfColumns();
    int userRows = AskedFingerPrint.getNumberOfRows();
    int userColumns = AskedFingerPrint.getNumberOfColumns();

    String[][] originalPixelData = origFingerPrint.getPixelData();
    String[][] userPixelData = AskedFingerPrint.getPixelData();

    int minRows = Math.min(originalRows, userRows);
    int minColumns = Math.min(originalColumns, userColumns);

    for (int i = 0; i < minRows; i++) {
        for (int j = 0; j < minColumns; j++) {
            if (originalPixelData[i][j].equals(userPixelData[i][j])) {
                matched++;
            }
        }
    }
    

    return (double) matched / totalPixels * 100;
}

}


/*import java.io.*;
import java.util.Scanner;

public class ThreatDetection {
    public static void main(String[] args) throws IOException {
        FingerPrint origFingerPrint = FileProcessor.loadFingerprint("original.txt");

        Scanner input = new Scanner(System.in);

        System.out.print("Max tries: ");
        int maxTries = input.nextInt();
        int tries = 0;

        input.nextLine();

        while (tries < maxTries) {
            System.out.print("Provide fingerprint file name (.txt): ");
            String fingerprintFileName = input.nextLine();

            FingerPrint AskedFingerPrint = FileProcessor.loadFingerprint(fingerprintFileName);


            if (origFingerPrint.equalsTo(AskedFingerPrint)) {
                System.out.print("Success! ");
                break;
            } else {
                tries++;
                System.out.println("You have " + (maxTries - tries) + " tries left.");
            }
            if(tries == maxTries){
                System.out.println("Max tries reached... exiting");
            }
        }
    }

} */