public class MyStringOperations {
  public static void main (String[]args){
    String word = "pRoGrAmiNg is, Fun?";
      System.out.println(word);

    int size = word.length();
      System.out.println(size);


      System.out.println(word.toLowerCase());
      System.out.println(word.toUpperCase());

      char first = word.charAt(0);
      System.out.println("The first letter is " + first);

      char second = word.charAt(1);
      System.out.println("The first letter is " + second);

      char last = word.charAt(size-1);
      System.out.println("The first letter is " + last);

  }


}