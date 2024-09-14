public class TwoDArrays {
public static void main(String[] args) {

int [][] a = 

            {
             {98, 78, 100},
             {87, 96, 95},
             {92, 80, 90}
            };
    
    print(a);
}

    public static void print(int [][] a){
    for(int row = 0; row < a.length; row++){
    
        for(int col = 0; col < a[row].length; col++){
        
            System.out.print(a[row][col] + " ");

        }
        System.out.println("");
    }
    
    }

}


