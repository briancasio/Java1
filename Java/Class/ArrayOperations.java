public class ArrayOperations {
    public static void main(String[] args) {
        
        // 1 & 2

        double[] array = new double[10];
        int i;
        double sum = 0;

        // 3

        for(i = 0; i < array.length; i++){
        
            array[i] = i + 1;
    
        }

        System.out.println("first value " + array[0]);
        System.out.println("third value " + array[2]);
        System.out.println("last value " + array[9]);


        for(i = 0; i < array.length; i++){
        
            sum += array[i];

        }
        
        System.out.println("The sum of my array is " + sum);

        double average = sum / array.length;

        System.out.println("The average of my array is " + average);

        System.out.print("My array is ");
        for(i = 0; i < array.length; i++){
        
            System.out.print(array[i] + " ");
        
        }

        System.out.println();
        // e

        System.out.print("My array reversed is ");
        for(i = array.length-1; i >= 0; i--){
        
            System.out.print(array[i] + " ");

        }

        System.out.println();

        double[] a = {1.0,2.0,3.0};

        System.out.println("sum of a is " + findSum(a));
        System.out.println("avg of a is " + findAVG(a));
        printReverse(a);

        System.out.println();

    }

    // 4

    public static double findSum (double[] a){
    
        double suma = 0;
        int i;

        for(i = 0; i < a.length; i++){
        
            suma += a[i];

        }

        return suma;
    
    }

    public static double findAVG(double[] a){
    

        
        double avg = findSum(a) / a.length;

        return avg;
    
    }

    public static void printReverse(double[] a){
    
        int i;
        System.out.print("a reversed ");

        for(i = a.length-1; i >= 0; i--){
        
            System.out.print(a[i] + " ");

        }


    
    }

}
