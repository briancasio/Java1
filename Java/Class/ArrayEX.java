public class ArrayEX {
    public static void main(String[] args) {
        
        
       int [] array = {0,1,2,3,4,6,8,9};

       int ranges = 0;
       

        for(int i = 0; i < array.length-1; i++){

            int start = array[0];

            if(array[i+1] - (array[i]) != 1 ){
            
               ranges++;
                start = array[i];
                System.out.println(start);

            }
                if (array[].length == array.length){
                
                System.out.println(array[i]);
                
                }
            
        
        }
        ranges = ranges + 1;


        



    }
/*
        public static int getSum(int[] array){
 
        
        
        }
        */

}
