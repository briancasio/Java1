public class NestedLoops {
    public static void main(String[] args) {

int i;
int j;

    //first
    System.out.println("First:");
        int n = 5; 
        for (i = 1; i <= n; i++) {
           
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println(); 
        }

        System.out.println(); 


    //second
        System.out.println("Second:");


        for (i = 1; i <= n; i++){
        
            
            for(j = i; j <= n; j++){

            System.out.print(i);
            }
            System.out.println();

        }

        System.out.println();


    //third
        System.out.println("Third:");


        for(i = 1; i <= n; i++){
        
            for(j = i; j <= n; j++){
            
                System.out.print(j);
            

            }
        
        System.out.println();

        }

    System.out.println();


    //fourth
        System.out.println("Fourth:");

        n = 1;

        for(i = 5; i >= n; i--){
        
            for(j = i; j >= n; j--){
            
                System.out.print(i);
            

            }
        
        System.out.println();

        }

    System.out.println();
        

    }
}