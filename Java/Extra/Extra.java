public class Extra{
public static void main(String[] args) {
    int [] a = {3, 5, 11, 7, 2, 1, 0, 15, 20, 4};
    
    bubbleSort(a);
    System.out.println(bSearch(a, 7));
}
    public static void bubbleSort(int[]a){
    for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a.length-1-i; j++){
            if(a[j] > a[j + 1]){
            int temp = a[j];
            a[j] = a[j + 1];
            a[j + 1] = temp;          
            /*a[j] = a[j] * a[j+1];
            a[j+1] = a[j] / a[j+1];
            a[j] = a[j] / a[j+1]; */
             }
        }
    //System.out.print(a[i] + ", ");
    }
    }
public static boolean binarySearchIteration(int [] a, int target){
    int first = 0;
    int last = a.length-1;
    boolean found = false;
    while(!found && first <= last){
    int middle = (first + last) / 2;
    if(a[middle] == target){
        found = true;
    }
    else if(a[middle] > target){
        last = middle - 1;
    }
    else {
        first = middle + 1;
    }
    }
    return found;
}

public static boolean binarySearchRecursion(int [ ]a, int target){
    return binarySearchRecursion(a, target, 0, a.length-1);
}

private static boolean binarySearchRecursion(int [ ]a, int target, int first, int last){
    if(first > last){
        return false;
    }
        int middle = (first + last) / 2;
    if(target == a[middle]){
        return true;
    }
    else if (target > a[middle]){
        return binarySearchRecursion(a, target, middle + 1, last);
    }
    else {
        return binarySearchRecursion(a, target, first, middle - 1);
    }
}



public static boolean bSearch(int [] a, int target){

    int first = 0;
    int last = a.length;
    int middle = (first + last) / 2;
    boolean found = false;

    while(!found && first <= last){

    if(a[middle] == target){
    
        return found;
    
    }
    else if(a[middle] > target){
    
        last = middle - 1;
    
    }
    else{
    
        first = middle + 1;
    
    }

    return found;

    }

    return found;

}

public static boolean bSearchRec(int [] a, int target, int first, int last){
if(first > last){

    return false;

}
    int middle = (first - last) / 2;

if(a[middle] == target){

    return true;

}
else if(a[middle] > target){

    return bSearchRec(a, target, middle + 1, last);

}
else{

    return bSearchRec(a, target, first, middle - 1);

}

}


public static int binarySearch(char[] a, char c, int start, int end) {

  int mid = (start + end) / 2;
  if(a[mid] == c) {
      //now search for the 'last' character of that value
      while (mid+1<a.length && a[mid+1]==c) {
          mid++;
      }
      return mid;
  }
  else if (start==end) {
      //if no character of that value found
      return -1;
  }
  else if (a[mid] < c) {
      return binarySearch(a, c, mid+1, end);
  }
  else {
      return binarySearch(a, c, start, mid);
  }
}
}

