public class Recursion{
    public static void main(String[] args){
        System.out.println("printReverseIter(): ");
        printReverseIter(5);
        System.out.println();
        System.out.println("printReverseRec():");
        printReverseRec(5);
        System.out.println();
        System.out.println("Iterative-based getSum(): ");
        System.out.println(getSum(5));
        System.out.println("Recursive-based getSum(): ");
        System.out.println(getSum(5,0));
        System.out.println("printReverse(): ");
        printWordReverse("Computer");

    }

    public static void printReverseIter(int n){
        while(n > 0){
            System.out.print(n + ", ");
            n--;
        }
        System.out.print(n + " ");
    }

    // public static void printReverseRec(int n){
    //     if(n > 0){
    //         System.out.print(n + ", ");
    //         printReverseIter(--n);
    //     }
    //     else{
    //         System.out.print(n);
    //     }
    // }

    public static void printReverseRec(int n){
        if(n == 0){
            System.out.print(n);
        }
        else{
            System.out.print(n + ", ");
            printReverseIter(n - 1);
        }
    }

    public static int getSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int getSum(int n, int sum){
        if(n == 0){
            return sum;
        }
        else{
            
            sum += n;
            return getSum(n - 1, sum);
        }
    }

    public static void printWordReverse(String word){
       if(word.length() == 0){
            System.out.println(word);
        }
        else{
            System.out.print(word.charAt(word.length()-1));
            word  = word.substring(0,word.length()-1);
            printWordReverse(word);
        }
        
    }
    
}