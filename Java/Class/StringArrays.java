public class StringArrays{
    public static void main(String[] args) {
        
        String[] arr = {"UTEP", "NMSU", "EPCC"};
        String target = "EPCC";
        String s = "casio";

        printArray(arr);
        System.out.println();

        System.out.println(findTarget(arr, target));

        char [] charArray = convertToArray(s);
            for(int i = 0; i < charArray.length; i++){
                System.out.print("'" + charArray[i] + "', ");
            }
            System.out.println();

        System.out.println(convertToString(charArray));

        

    }

    public static void printArray(String[] arr){
    
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static boolean findTarget(String[] arr, String target){
    
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return true;
            }
        }
            return false;    

    }

    public static char[] convertToArray(String s){
    char [] charArray = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            charArray[i] = s.charAt(i);  
        }
        return charArray;

    }

    public static String convertToString(char[] charArray){
    
        String stringArray = "";
        for(int i = 0; i < charArray.length; i++){
            stringArray += charArray[i];
        }
        return stringArray;

    }
}