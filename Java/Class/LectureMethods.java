public class LectureMethods{
public static void main(String[] args) {
    
//System.out.println(findSum(3, 7)); // #1
//System.out.println(extractCharacter("String", 6)); //#2
//System.out.println(countVowels("abcdefg")); // #3
//System.out.println(countNonVowels("String")); // #4
//System.out.println(countEvenNumbers(5, 17)); // #5
//printReverse(5); // #6
//System.out.println(sumOddNumbers(5, 17)); // #7
//System.out.println(transformToUpperCase("hello guys")); // #8
//System.out.println(factorial(5)); // # 9
System.out.println(getTotalCombination(5, 2)); // #10


}
    //Number 1
    public static int findSum(int x, int y){
        int sum = 0;
        if(x < y){
            for(int i = x; i <= y; ++i){
                sum = sum + i;
            }
        }
        return sum;
    }

    //Number 2
    public static char extractCharacter(String s, int i){
        char c = '\0';
        if(i < s.length()){
            c = s.charAt(i);
        }
        return c;
    }

    //Number 3
    public static int countVowels(String s){
        int counter = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'||  
                s.charAt(i) == 'e'||
                s.charAt(i) == 'i'||
                s.charAt(i) == 'o'||
                s.charAt(i) == 'u'){
                ++counter;
            }
        }
        return counter;
    }

    //Number 4
    public static int countNonVowels(String s){
        int counter = s.length();
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'A'|| 
                s.charAt(i) == 'e'||s.charAt(i) == 'E'||
                s.charAt(i) == 'i'||s.charAt(i) == 'I'||
                s.charAt(i) == 'o'||s.charAt(i) == 'O'||
                s.charAt(i) == 'u'||s.charAt(i) == 'U'){
                --counter;
            }
        }
        return counter;
    }

    //Number 5
    public static int countEvenNumbers(int x, int y){
        int counter = 0;
        if(x < y){
            for(int i = x; i <= y; ++i){
                if((i % 2) == 0){
                    ++counter;
                }
            }
        }
        return counter;
    }

    //Number 6
    public static void printReverse(int x){
        while(x >= 0){
            System.out.print(x + " ");
            --x;
        }
    }

    //Number 7
    public static int sumOddNumbers(int x, int y) {


        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 1) { // Check if i is odd
                sum += i;
            }
        }
        return sum;
    }

    //Number 8
    public static String transformToUpperCase(String a){
        String upperString = a.toUpperCase();
       /*for(int i = 0; i < a.length() - 1; i++){
        
            upperString += a.charAt(i);    
        
        }*/
        return upperString;
    }

    //Number 9
    public static long factorial(int num) {
        if(num < 0){
        
        return 0;
        
        }
        
        if (num == 0 || num == 1)
            return 1;


        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    //Number 10
        public static long getTotalCombination(int n, int r) {
        if (r < 0 || r > n) {
        return 0;
        }

        return  factorial(n) / (factorial(r) * factorial(n - r));
    }

}






