public class Recursion {
public static void main(String[] args) {
    
printReverseIter(5);
System.out.println();
printReverseRec(5);
System.out.println();
System.out.println(getSum(5, 0));
System.out.println();
System.out.println(getSumRec(5, 0));



System.out.println();
printReverse("Computer", 0);

System.out.println();
printReverse("Computer");
System.out.println();



}

public static void printReverseRec(int n){
int i = 0;
   if(i<n){
        System.out.println(n);
        printReverseRec(n-1);
    }



}

public static void printReverseIter(int n){

for(int i = 0; i < n; n--){

    System.out.println(n);

} 

}


public static int getSum(int n, int sum){

for(int i = 0; i < 5; i++){

    sum += n;
    n = n-1;

}
return sum;

}

public static int getSumRec(int n, int sum){

    while(n > 0){

    sum = sum + n;
    n--;
    
    }
    return sum;

}





public static void printReverse(String s, int i){
    
    if(i == s.length()){
        System.out.print("");
    }
    if(i < s.length()){
    printReverse(s, i + 1);
    System.out.print(s.charAt(i));
    
    }


}

/*public static void printReverse(String s){

    if(s.length() == 1){
    
    System.out.println();

    }
    else{

    s = 
    printReverse();
    
    
    }*/

public static void printReverse(String s) {
    if (s.length() == 1) {

        System.out.println(s.charAt(0));

    }
    else{
    
    System.out.print(s.substring(s.length() - 1));
    printReverse(s.substring(0, s.length() - 1));
    
    }   
    }
}



