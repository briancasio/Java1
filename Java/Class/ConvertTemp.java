public class ConvertTemp {
    public static void main(String[] args) {
        
        double temp;
        for(int i = 0;i <= 20; i++){
        
            temp = i;
            double celsiusToFah = celsius(temp);
            System.out.printf(temp + " F is: %.2f C\n", celsiusToFah);
        }
    }
    public static double celsius(double temp){
        
        double celsius = (5*(temp - 32))/9;
        return celsius;

    }
}
