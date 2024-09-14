public class SplitMethod{
public static void main(String[] args) {
    // if I have no arguments
    if(args.length <= 0){
            System.out.println("Nothing to process");
            return;
    }

    //if I have any argument
    int sum = 0;
    for(int i = 0; i < args.length; i++){
    
        String [] a = args[i].split(" ");
        System.out.println(a[i]);

        for(int j = 0; j < a.length; i++){
        
        
        }

    }

    
    
    }

    

}


}