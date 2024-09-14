import java.io.IOException;


public class FileProcessor {
    public static void main(String[] args) throws IOException {
        FingerPrint myFingerPrint = new FingerPrint("original.txt");
        System.out.println(myFingerPrint.getName());
        System.out.println(myFingerPrint.getRegistrationYear());
        System.out.println(myFingerPrint.getNumberOfRows());
        System.out.println(myFingerPrint.getNumberOfColumns());
        System.out.println(myFingerPrint);
        System.out.println(myFingerPrint.getNumberOfPixels());
        myFingerPrint.getImage();
        FingerPrint user1 = loadFingerprint("User1.txt");

        
        System.out.println(myFingerPrint.equals(user1));
    }

    public static FingerPrint loadFingerprint(String fileName) throws IOException {
        return new FingerPrint(fileName);
    }


}

