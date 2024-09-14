import java.io.IOException;
public class wea{
    public static void main(String [] args)throws IOException{
     int [] a = {1,2,4,5,6,7,8};
     
    int initial = 0;
    int end = a.length-1;

    while(initial <= end){
        
      int mid = initial + (end - initial) / 2;
      
      if(a[mid] == mid + 1){
      
        initial = mid +1;
      
      }
      else{
      
        end = mid - 1;
      
      }

    }
   
      System.out.println(initial + 1);

        

                    
    }
}