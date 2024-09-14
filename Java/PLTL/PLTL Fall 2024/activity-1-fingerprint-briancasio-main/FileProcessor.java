import java.io.IOException;

public class FileProcessor {
  public static void main(String[] args)throws IOException{
        FingerPrint original = new FingerPrint("Original.txt");
        System.out.println(original.getName());
        System.out.println(original.getYear());
        System.out.println(original.getRows());
        System.out.println(original.getCols());
        System.out.println(original);
        System.out.println(original.getNumberOfPixels());
        original.getImage();
        FingerPrint user1 = loadFingerprint("User1.txt");
        System.out.println(original.equals(user1));
    
    }

//ready for submission
}
