public class ttt{
    public static void main(String[] args) {
        
        int []a = {2,3,4,1};
        int[]b={3,2,3};

        int[] c = addition(a, b);
        
        for(int i=0; i<c.length;i++){
        
        System.out.println(c[i]);

        };

        
    }

    public static int[] addition(int[]a, int[]b){
    
    int [] c = new int[a.length];

    for(int i = 0; i< a.length;i++){
    
    c[i] = a[i] + b[i];

    }

    return c;
    
    }


}