
// This might help a little bit:)
public class Help {
    public static void main(String[] args){ 
        System.out.println("output:");

        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum = Integer.parseInt(args[i]);
            System.out.println(sum);
        }
    }
}
/*
    javac Help.java
    java Help 1 2 3
    output:
    1
    2
    3
 */

