public class Methods{
public static void main(String[] args) {
    
 
//System.out.println(transformToUpperCase("andrew")); // #8
//System.out.println(findSum(3, 7));
//System.out.println(factorial(-5));
System.out.println(getTotalCombination(5, 2));

}

    //Number 1
    public static int findSum(int x, int y){
    
        int sum = 0;
        int i = x;
        while(i <= y){
        
            sum = sum + i;
            i++;
        }
        return sum;
    
    }

    //Number 8
    public static String transformToUpperCase(String str){
    
        String upperString = str.toUpperCase();

        return upperString;
    
    
    }


    /*
        Implement a method named printReverse. This method will take a number as a parameter and should print
        the numbers in reverse order until 0. For example, if n = 5, and we call printReverse(n), your method
        will print "5 4 3 2 1 0."
     */

     public static void printReverse(int x) {
        while(x >= 0) {
            System.out.print(x + " ");
            x--;
        }
     
     }

     /*
     Implement a method named factorial. This method will take a number n as an argument
     and then calculate the factorial (i.e n!) of that number...

     Predict which ints will the user input and act accordingly

      */

      public static long factorial(int num){
      
      long fact = 1;
        if(num < 0){
        
        return 0;
        
        }
        else if(num == 0 || num == 1){
        
            return 1;
        
        }
        else{
        

            for(int i = 2; i <= num; i++){
            
                fact *= i;
            
            } 
        
        }

    return fact;
      
      }

      //Number 10
      /*
      Implement a method named getTotalCombination. This method calculates the combination Cr formula:

      Cr = n! / (r!(n - r)!)

      hint: use the factorial method implemented in previous question
      
       */

       public static long getTotalCombination(int n, int r){
       
            return factorial(n) / (factorial(r) * factorial(n - r));
       
       }


}