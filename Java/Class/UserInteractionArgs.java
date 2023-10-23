
public class UserInteractionArgs {
  public static void main(String[] args) {

    String food = args[0];
    String age = args[1];

    int year = 2023 - Integer.parseInt(age);  
  
    System.out.println(food);
    System.out.println(year);

  }
}