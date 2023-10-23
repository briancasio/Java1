public class MethodEx {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        String me = "Brian";
        String neighbor = "Miguel";

        //call the method:
        printSum(x,y);

        //call String method:
        printName(me, neighbor);
      

    }

    //Create a method that will take two integer as parameters
    //The method should print the sum of two numbers
    public static void printSum(int x, int y){
    
    int result = x + y;
    System.out.println(result);
    
    }

    //Create a method named printName, that will take a String as a parameter
    //The method should print your first name

    public static void printName(String me, String neighbor) {

    System.out.println(me + "\n" + neighbor);
    
    }
    

}