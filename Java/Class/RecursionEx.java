public class RecursionEx {
    public static void main(String[] args) {
    
    int total = getSum(5);
    System.out.println(total);
    System.out.println(getSum2(5));
    System.out.println(getSum3(5));

    int [] a = {1,2,3,4,5};
    int [] b = {4,5,6,7, 6, 1, 4, 2, 0, 3, 6, 5, 3, 96};


    

    System.out.println(getSum4(a));
    System.out.println("Largest: " + findMax(a));
    printReverse("abcd");


    }

    public static void printHello_Rec1(int n, int i){
    
    if(i<n){
        //i++;
        printHello_Rec1(n, i+1);
        System.out.println("Hello");
    
    }
    
    }

    public static void printHello_Rec2(int n){
    
        if (n == 0){
            System.out.println("Done...");
        }
        else{
        
            printHello_Rec2(n-1);
            System.out.println("Hello");
        
        }
    
    }
    public static void printHello_Rec3(int n){

    if (n > 0){
        printHello_Rec3(n-1);
        System.out.println("Hello");
    }

    
    }

    public static int getSum(int n){
    
    int totalSum = 0;
    for(int i = 0; i < 5; i++){
    
        totalSum += n;
        n = n-1;

    }
    
    return totalSum;
    
    }

    public static int getSum2(int n){
    
    if(n == 0){
    
    return 0;
    
    }

    return n + getSum2(n-1);
    
    }

    public static int getSum3(int n){
    
    if(n > 0){
    
        return n + getSum(n-1);
    
    }
    return 0;
    
    }

    public static int getSum4(int []a){
        return getSum4(a, 0);
    }
    //Helper method to perform the recursion
    private static int getSum4(int[] a, int i){
    

    if(i == a.length){
    
        return 0;
    
    }
    else{
    
        return a[i] + getSum4(a, i+1);
    
    }
    
    }

    //Write a method called findMax()
    //This method will take at least 1D array as a parameter
    //and return the largest element in the array
    //This method should use

    public static int findMax(int []a){
    
    return findMax(a, 0, Integer.MIN_VALUE);
    
    }

    private static int findMax(int []a, int i, int largest){

        if (i == a.length) {
            return largest;
        }
        if (largest < a[i]) {
            largest = a[i];
        }
        return findMax(a, i + 1, largest); 
    }

    //Write a method called printReverse()
    //This method will take at least a String as a parameter
    //The method will print the String backwards

    public static void printReverse(String s){
    
        printReverse(s, 0);
        System.out.println();
    }

   /* private static void printReverse(String s, int i){

    for(i = s.length()-1; i >= 0; i--){
    
        System.out.print(s.charAt(i));
    
    }ls
    
    */

    private static void printReverse(String s, int i){
        
        if(i == s.length()){
            System.out.print("");
        }
        if(i < s.length()){
        printReverse(s, i + 1);
        System.out.print(s.charAt(i));
        
        }

    }

    //Write a method called counOnlyOdds
    //This method will process an array of ints
    //The method shall count and return the total number of odd values in the array
    //and odd number is a number that is not divisible by 2, i.e
    //if the reminder of the number by 2 is not 0
    //Ex: b = {4,5,6,7, 6, 1, 4, 2, 0, 3, 6, 5, 3, 96};
    //There are 7 odd numbers: 5, 3, 7, 1, 3, 5 and 3
    //Write a public method that takes the array as a param only
    //Write a private method that takes any additional params

    public static int CountOnlyOdds(int [] b){
    
    return CountOnlyOdds(b);
    
    }

    private static int CountOnlyOdds(int [] b, int count){
    
    for(int i = 0; i < b.length; i++){
    
        
    
    
    }


    return count;
    
    
    }






    }


    


    
    



    


    
    




    

    




