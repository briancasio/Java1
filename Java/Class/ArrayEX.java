public class ArrayEX {
    public static void main(String[] args) {
        
        
       int [] array = {5,4,6,2,1};
       

        System.out.println(getSum(array));
        
    }

        public static int getSum(int[] array){
        int sum = 0;
        
        for(int i = 0; i < array.length;i++){
        
           // array[i] = array[i] + array[i-1];
            sum += array[i];
        
        
        }
        return sum;
        
        
        
        }

}
