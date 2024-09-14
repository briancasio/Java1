public class helper1{
    public static void main(String[] args) {
        //1
        String s1 = "BrianCasio";
        String s2 = "Science";

        //2
        int i1 = 3;
        double i2 = 1.5;

        //3
        char c = s1.charAt(2); // 'm'

        //4
        double sum = i1 + i2;

        //5
        String second = s2.substring(0,1) + s2.substring(1,2).toUpperCase() + s2.substring(2);

        //6 .length() -> int -> length of string
        //String password = + s1.charAt(s1.length()-1) + + + + + ;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(c);
        System.out.println(sum);
        System.out.println(second);


    }


}