import java.util.Scanner;

public class leibnizPiCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n = input.nextInt();
        System.out.println("N \t\t Pi");
        System.out.println("==================)");

        for(int i = 0; i <= n; i += 100){
        
            System.out.println(i + "\t\t" + getLeibniz(i));
        
        }

    }










    public static double getNumerator(int k){
    
        return Math.pow(-1, k);

    }

    public static int getDenominator(int k){
    
        return 2 * k + 1;

    }


 
    
        






    public static double getLeibniz(int n){

    double sigma = 0;

        for(int k = 0; k <= n; k++){
            //double numerator = getNumerator(k);
            
            //int denominator = getDenominator(k);
            
            sigma += 4 * getNumerator(k) / getDenominator(k);
            
        
        }
            
            return sigma;
    }
    
}
