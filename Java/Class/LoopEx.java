public class LoopEx {
  public static void main(String[] args) {
    
  int [] digits = {1, 0, 5};



  }

    public static int[]plusOne(int [] digits){
    
    
    
        for(int i = digits.length - 1; i >= 0; i--){
            
            if(i == 9){
            
                digits[i-1] = digits[i-1] + 1;
                digits[i] = 0;

            
            }
            else{
            
                
            
            }
            
        }

        return plusOne(digits);
    
    
    }



}
