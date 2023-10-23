import java.util.Scanner;

public class CompareAndOrder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Word 1:");
    String w1String = input.nextLine();
    System.out.println("Word 2:");
    String w2String = input.nextLine();
    System.out.println("Word 3:");
    String w3String = input.nextLine();

    input.close();

    if(w1String.compareTo(w2String) <= 0 && w2String.compareTo(w3String) <= 0) {
      System.out.println(w1String + " " + w2String + " " + w3String);
    }
    else if (w1String.compareTo(w3String) <= 0 && w3String.compareTo(w2String) <= 0) {
      System.out.println(w1String + " " + w3String + " " + w2String);
    }
     else if (w2String.compareTo(w1String) <= 0 && w1String.compareTo(w3String) <= 0) {
      System.out.println(w2String + " " + w1String + " " + w3String);
    }
     else if (w2String.compareTo(w3String) <= 0 && w3String.compareTo(w1String) <= 0) {
      System.out.println(w2String + " " + w3String + " " + w1String);
    }
     else if (w3String.compareTo(w1String) <= 0 && w1String.compareTo(w2String) <= 0) {
      System.out.println(w3String + " " + w1String + " " + w2String);
    }
     else {
      System.out.println(w3String + " " + w2String + " " + w1String);
    }
  }  
}
